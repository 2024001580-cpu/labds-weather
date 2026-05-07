package controller;

import java.nio.charset.StandardCharsets;

import com.sun.net.httpserver.HttpServer;

public class WeatherHandler {

    public WeatherHandler() {    }

    public void createWeatherHandler(HttpServer server) {
        String basePath = "/weather";

        // TODO: alterar e criar métodos
        // TODO: dá pra criar BaseHandler com os métodos genéricos
        server.createContext(basePath, exchange -> {

            String responseMessage = "Tempo agora: 19°C";

            // Método GET
            if (exchange.getRequestMethod().equalsIgnoreCase("GET")) {
                byte[] resposta = responseMessage.getBytes(StandardCharsets.UTF_8);
                exchange.sendResponseHeaders(200, resposta.length);
                exchange.getResponseBody().write(resposta);
                exchange.getResponseBody().close();
                return;
            }
            
            exchange.sendResponseHeaders(405, -1);
            exchange.close();
            return;
        });
    }
}
