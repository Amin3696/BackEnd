package at.nacs.admissiondrhouse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AdmissionTest {

    @Autowired
    Admission admission;

    @MockBean
    RestTemplate restTemplate;

    @ParameterizedTest
    @CsvSource({
            "Amin, Headache",
    })
    void TestAdmit(String name, String symptoms) {

        Patient patient = Patient.builder()
                .name(name)
                .symptoms(symptoms)
                .build();
        Patient admitedPatient = admission.admit(patient);

        Assertions.assertThat(admitedPatient.getId()).isNotNull();

    }
}