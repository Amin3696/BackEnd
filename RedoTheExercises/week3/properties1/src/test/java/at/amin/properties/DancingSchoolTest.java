package at.amin.properties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DancingSchoolTest {
    @Autowired
    DancingSchool dancingSchool;

    @Test
    void getBallerinas() {
        List<Ballerina> ballerinas = dancingSchool.getBallerinas();
        assertEquals(3, ballerinas.size());
    }

    @ParameterizedTest
    @CsvSource({
            "0, Mina, 4",
            "1, Farnaz, 3",
            "2, Shamissa, 2"
    })
    void getBallerinas(int index, String name, Integer performance) {
        Ballerina ballerina = dancingSchool.getBallerinas().get(index);
        assertNotNull(ballerina);
        assertEquals(name, ballerina.getName());
        assertEquals(performance, ballerina.getPerformance());
    }
}