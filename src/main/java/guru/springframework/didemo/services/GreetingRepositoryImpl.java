package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

/**
 * Created by Adetola on 18/06/2019
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Hallo - primärer Begrüßungsdienst";

    }
}
