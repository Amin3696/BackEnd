package at.nacs.ex2amazinghelloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloTest {

    @Autowired
    Hello hello;

    @Test
    void sayHello() {
        String actual = hello.sayHello();
        String expected = "Hello";
        Assertions.assertEquals(expected, actual);


    }
}