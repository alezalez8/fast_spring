package messages;

import org.springframework.stereotype.Component;

@Component
public class CustomMessages {

    public void iAmAspect() {
        System.out.println("I am a logger - aspect");
    }
}
