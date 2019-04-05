package at.amin.properties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LibrariesTest {
    @Autowired
    Libraries libraries;

    @Test
    void testLibraries() {
        Map<String, Integer> actualBooks = libraries.getBooks();
        int actualSize = actualBooks.size();
        assertEquals(3, actualSize);
    }

    @ParameterizedTest
    @CsvSource({"3,Harry-Potter",
            "2,The-Foundation",
            "4,The-Lord-of-the-Rings"})
    void testIndividualBooks(Integer amount, String title) {
        Map<String, Integer> books = libraries.getBooks();

        assertEquals(amount, books.get(title));

    }

}