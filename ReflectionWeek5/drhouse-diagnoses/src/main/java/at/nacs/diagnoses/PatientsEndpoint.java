package at.nacs.diagnoses;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientsEndpoint {

    private final MedicalDiagnosis medicalDiagnosis;
    private final RestTemplate restTemplate;

    @PostMapping
    Patient checkPatient(@RequestBody Patient patient) {
        Patient patientWithDiagnosis = medicalDiagnosis.checkUp(patient);
        return patientWithDiagnosis;
    }

    public Patient sendToDepartment(Patient patient) {
        if (patient.getDiagnosis() == "Lupus") {
            restTemplate.postForObject("bed", patient, Patient.class);
        }
        restTemplate.postForObject("Pharmacy", patient, Patient.class);
        return patient;
    }

}


