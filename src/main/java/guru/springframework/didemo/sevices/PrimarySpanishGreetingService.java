package guru.springframework.didemo.sevices;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Adetola on 17/06/2019
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
