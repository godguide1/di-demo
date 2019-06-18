package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Adetola on 16/06/2019
 */

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the constructor";
    }
}
