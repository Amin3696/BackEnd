package at.amin.amazinghelloworld;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    public String sayHello() {
        return "Hello";
    }
}
