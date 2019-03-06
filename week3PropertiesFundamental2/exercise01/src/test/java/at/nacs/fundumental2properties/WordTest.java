package at.nacs.fundumental2properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WordTest {

    @Autowired
    Word word;

    @Test
    void getWord() {
        String actual = this.word.getAmin();
        assertEquals("fantastic", actual);
    }
}