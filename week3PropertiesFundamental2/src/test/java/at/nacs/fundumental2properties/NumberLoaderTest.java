package at.nacs.fundumental2properties;

import com.sun.jdi.IntegerValue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class NumberLoaderTest {

    @Autowired
    NumberLoader numberLoader;

    @Test
    void getValue() {
        Integer actual = numberLoader.getValue();

        assertEquals(Integer.valueOf(369),actual);
    }
}
