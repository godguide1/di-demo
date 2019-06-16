package guru.springframework.didemo.controllers;

import guru.springframework.didemo.sevices.GreetingServiceImpl;

/**
 * Created by Adetola on 16/06/2019
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
