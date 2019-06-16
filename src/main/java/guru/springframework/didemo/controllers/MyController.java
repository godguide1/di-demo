package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Adetola on 16/06/2019
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!!");

        return "foo";
    }
}
