package at.amin.amazinghelloworld;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;


class AmazingHelloWorldTest {
    @Autowired
    AmazingHelloWorld amazingHelloWorld;

    @Test
    void getHelloWord() {
        String expected = amazingHelloWorld.getHelloWord();
        String actual = "Hello World";
        Assertions.assertEquals(expected, actual);
    }
}