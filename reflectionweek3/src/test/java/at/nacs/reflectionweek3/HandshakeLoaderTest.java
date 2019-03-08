package at.nacs.reflectionweek3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class HandshakeLoaderTest {

    @Autowired
    HandshakeLoader handshakeLoader;

    @Test
    void testSizeOfMoves() {
        Map<Integer, String> actualMoves = handshakeLoader.getMove();
        int size = actualMoves.size();
        Assertions.assertEquals(5, size);
    }

    @ParameterizedTest
    @CsvSource({
            "1,Move1",
            "2,Move2",
    })
    void testIndividualHandshake(Integer number, String name) {
        Map<Integer, String> actualHandShakes = handshakeLoader.getMove();
        System.out.println(actualHandShakes);
        Set<Integer> numbers = actualHandShakes.keySet();
        Collection<String> names = actualHandShakes.values();

        assertTrue(numbers.contains(number));
        assertTrue(names.contains(name));
    }
}