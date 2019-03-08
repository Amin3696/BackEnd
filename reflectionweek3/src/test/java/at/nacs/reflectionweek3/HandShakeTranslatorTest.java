package at.nacs.reflectionweek3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class HandShakeTranslatorTest {

    @Autowired
    HandShakeTranslator handShakeTranslator;

    @ParameterizedTest
    @CsvSource({

            "1,Move1",
            "2,Move2"

    })
    void testIndividualHandshake(Integer number, String expected) {
        List<String> actualHandShakes = handShakeTranslator.translate(number);
        String collect = actualHandShakes.stream().collect(Collectors.joining());
        System.out.println(actualHandShakes);
        assertEquals(expected, collect);
    }

    @Test
    void testNoHandshake() {
        List<String> actual = handShakeTranslator.translate(3);
        assertTrue(actual.isEmpty());
    }
}