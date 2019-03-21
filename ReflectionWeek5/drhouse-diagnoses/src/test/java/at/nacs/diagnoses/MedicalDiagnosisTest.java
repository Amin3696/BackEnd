package at.nacs.diagnoses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class MedicalDiagnosisTest {

    @Autowired
    MedicalDiagnosis medicalDiagnosis;

    @MockBean
    RestTemplate restTemplate;

    @ParameterizedTest
    @CsvSource({
            "Abdominal pain,infection",
            "headache,had a cold",
            "Skin rashes,atopic dermatitis",
            "Constipation,low Liquied",
            "Joint pain or muscle pain,arthritis"
    })
    void TestCheckUp(String symptoms, String diagnosis) {
        Patient thomas = Patient.builder()
                .name("Thomas")
                .symptoms(symptoms)
                .diagnosis(diagnosis)
                .id(UUID.randomUUID().toString())
                .build();
        Patient afterCheckUp = medicalDiagnosis.checkUp(thomas);

        assertEquals(afterCheckUp.getDiagnosis(), diagnosis);
    }
}