package at.nacs.admissiondrhouse;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class DiagnoseClient {

    private final RestTemplate restTemplate;

    private String diagnosesUrl = "http://localhost:9002/patients";

    public Patient forwardTodiagnosticDepartment(Patient patient) {
        Patient clearDiagnosePatient = restTemplate.postForObject(diagnosesUrl, patient, Patient.class);
        return clearDiagnosePatient;
    }
}
