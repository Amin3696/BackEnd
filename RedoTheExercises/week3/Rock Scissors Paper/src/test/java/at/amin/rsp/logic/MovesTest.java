package at.amin.rsp.logic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MovesTest {

    @Autowired
    Moves moves;

    @ParameterizedTest
    @CsvSource({
            "rock",
            "scissors",
            "paper"
    })
    void asString(String expected) {
        String actual = moves.asString();
        String[] split = actual.split(" ,");
        boolean result = Stream.of(split)
                .anyMatch(name -> name.equals(expected));
        assertTrue(result);
    }

    @Test
    void from() {
    }
}