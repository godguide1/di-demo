package guru.springframework.didemo.sevices;

import org.springframework.stereotype.Service;

/**
 * Created by Adetola on 16/06/2019
 */

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
