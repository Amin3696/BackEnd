package at.nacs.fundumental2properties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BallerinaLoaderTest {

    @Autowired
    BallerinaLoader ballerinaLoader;

    @Test
    void testNumberOfBallerina() {
        List<Ballerina> actualDancers = ballerinaLoader.getBallerina();
        System.out.println(actualDancers);
        assertEquals(3, actualDancers.size());
    }

    @ParameterizedTest
    @CsvSource({
            "0,shamissa,5.0",
            "1,mahnaz,4.3",
            "2,farnaz,4.5"
    })
    void testIndivdualDancer(int index,String name,double quality){
        List<Ballerina> actualBallerina = ballerinaLoader.getBallerina();
        Ballerina ballerina = actualBallerina.get(index);

        assertEquals(name,ballerina.getName());
        assertEquals(quality,ballerina.getQuality());
    }
}