package at.amin.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class FacilitiesTest {
    @Autowired
    Facilities facilities;

    @Test
    void testSauna() {
        Sauna actual = facilities.getSauna();
        assertNotNull(actual);

        assertEquals(Integer.valueOf(8), actual.getAvailableSeats());
        assertEquals(Integer.valueOf(80), actual.getTemperature());
    }

}