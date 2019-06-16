package guru.springframework.didemo.controllers;

import guru.springframework.didemo.sevices.GreetingService;

/**
 * Created by Adetola on 16/06/2019
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
