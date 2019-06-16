package guru.springframework.didemo.controllers;

import guru.springframework.didemo.sevices.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Adetola on 16/06/2019
 */

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;


    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
