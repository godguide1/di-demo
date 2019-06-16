package guru.springframework.didemo.controllers;

import guru.springframework.didemo.sevices.GreetingService;

/**
 * Created by Adetola on 16/06/2019
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
