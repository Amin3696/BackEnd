package at.nacs.marathonserver;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WinnerEndpointTest {

    @Autowired
    WinnerEndpoint winnerEndpoint;

    @ParameterizedTest
    @CsvSource({

    })
    void getWinner() {


    }
}