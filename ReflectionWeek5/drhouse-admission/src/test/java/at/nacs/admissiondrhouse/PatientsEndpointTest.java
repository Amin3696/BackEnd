package at.nacs.admissiondrhouse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    DiagnoseClient diagnoseClient;

    @Autowired
    Admission admission;

    @MockBean
    RestTemplate restTemplate;


    String url = "/patients";


    @Test
    void testAdmitPatient() {
        Patient patient = Patient.builder()
                .name("Amin")
                .symptoms("heart rate")
                .build();
        Patient patientWithID = admission.admit(patient);

        Patient admitedPatientForwardedToDiagnosticDepartment
                = diagnoseClient.forwardTodiagnosticDepartment(patientWithID);


        String name = admitedPatientForwardedToDiagnosticDepartment.getName();
        String symptoms = admitedPatientForwardedToDiagnosticDepartment.getSymptoms();
        String id = admitedPatientForwardedToDiagnosticDepartment.getId();

        assertEquals(name, patient.getName());
        assertEquals(symptoms, patient.getSymptoms());
        assertEquals(patient.getId(), id);


    }


}