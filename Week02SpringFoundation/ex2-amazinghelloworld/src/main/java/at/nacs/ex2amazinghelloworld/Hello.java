package at.nacs.ex2amazinghelloworld;

import org.springframework.stereotype.Component;

@Component

public class Hello {
    public String sayHello() {
        return "Hello";
    }
}