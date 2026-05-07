package controller;

import com.sun.net.httpserver.HttpServer;

public class Router {
    
    private HelloWorldHandler _helloWorldHandler = new HelloWorldHandler();
    private WeatherHandler _weatherHandler = new WeatherHandler();

    public Router() {
    }

    public void createContext(HttpServer server) {

        _helloWorldHandler.createHelloWorldHandler(server);
        _weatherHandler.createWeatherHandler(server);
    }
}
