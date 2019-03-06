package at.nacs.fundumental2properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SaunaTest {
    @Autowired
    Sauna sauna;

    @Test
    void testSauna() {
        assertNotNull(sauna);
    }

    @Test
    void testTemperature() {
        double actualTemperature = sauna.getTemperature();
        assertEquals(55.0, actualTemperature);
    }

    @Test
    void testAvailableSeat() {
        int actualAvailableSeat = sauna.getAvailableSeat();
        assertEquals(10, actualAvailableSeat);
    }
}