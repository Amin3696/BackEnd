package at.nacs.diagnoses;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
@ConfigurationProperties("data.seekness")
@Log


public class MedicalDiagnosis {

    @Getter
    private final Map<String,String> diagnosis;


    public Patient checkUp(Patient patient) {
        String symptoms = patient.getSymptoms();
        if (isDiagnosisFound(symptoms)) {
            Patient patientWithDiagnostick = assignDiagnosis(patient);
            return patientWithDiagnostick;
        }
        patient.setDiagnosis("lupus");
        return patient;
    }

    private boolean isDiagnosisFound(String symptoms) {
        return diagnosis.containsKey(symptoms);
    }

    private Patient assignDiagnosis(Patient patient) {
        String symptoms = patient.getSymptoms();
        String diagnose = diagnosis.get(symptoms);
        patient.setDiagnosis(diagnose);
        return patient;
    }
}
