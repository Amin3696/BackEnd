package at.nacs.polo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PoloEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    String url = "/polo";

    @ParameterizedTest
    @CsvSource({
        "Marco, Polo",
        "marco, What?",
        "something else, What?"
    })
    void post(String message, String expected) {
        String response = restTemplate.postForObject(url, message, String.class);

        assertThat(response).isEqualTo(expected);
    }
}