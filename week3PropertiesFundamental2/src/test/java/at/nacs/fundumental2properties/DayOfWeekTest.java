package at.nacs.fundumental2properties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DayOfWeekTest {

    @Autowired
    DayOfWeek dayOfWeek;

    @Test
    void getDay() {
        List<String> days = dayOfWeek.getDay();
        List<String> expected= Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
        assertEquals(expected,days);


    }
    @ParameterizedTest
    @ValueSource(strings={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"})
    void testDaysOfWeek(String day){
        List<String> actualDays = dayOfWeek.getDay();
        assertTrue(actualDays.contains(day));
    }
}