package at.amin.amazinghelloworld;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor


public class AmazingHelloWorld {

    private final Hello hello;
    private final World world;

    public String getHelloWord() {
        return hello.sayHello() + world.sayWorld();
    }

}
