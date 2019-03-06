package at.nacs.fundumental2properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookShopTest {
    @Autowired
    BookShop bookShop;

    @Test
    void getBooks() {
        Map<String, Integer> book = bookShop.getBook();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("HarryPotter", 3);
        expected.put("TheFoundation", 2);
        expected.put("TheLordOfTheRings", 4);

        assertEquals(expected, book);
    }

}