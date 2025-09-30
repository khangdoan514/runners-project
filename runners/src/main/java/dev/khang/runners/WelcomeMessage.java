package dev.khang.runners;

import org.springframework.stereotype.Component;

@Component // it means this class is available to Spring
public class WelcomeMessage {
    
    public String getWelcomeMessage() {
        return "Welcome to the Spring Boot Application!";   
    }

}
