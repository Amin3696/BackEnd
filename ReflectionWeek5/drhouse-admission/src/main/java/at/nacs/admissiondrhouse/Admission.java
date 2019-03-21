package at.nacs.admissiondrhouse;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor

public class Admission {

    private final DiagnoseClient diagnoseClient;

    public Patient admit(Patient patient) {

        UUID uuid = UUID.randomUUID();
        patient.setId(uuid.toString());
        Patient patientAfterDiagnostic = diagnoseClient.forwardTodiagnosticDepartment(patient);
        return patient;

    }
}
