package at.amin.propertiestwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NumberTest {
    @Autowired
    Number number;

    @Test
    void getNumber() {
        Integer actualNr = number.getNumber();
        Assertions.assertEquals(Integer.valueOf(369), actualNr);
    }
}