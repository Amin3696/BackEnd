package at.amin.properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NumberTest {

    @Autowired
    Number number;

    @Test
    void getNumber() {
        int actual = number.getNumber();
        assertEquals(396, actual);

    }
}