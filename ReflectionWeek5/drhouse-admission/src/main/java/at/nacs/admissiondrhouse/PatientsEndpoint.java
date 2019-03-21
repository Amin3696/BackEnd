package at.nacs.admissiondrhouse;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor


public class PatientsEndpoint {

    private final Admission admission;
    private final DiagnoseClient diagnoseClient;

    @PostMapping
    Patient admitPatient(@RequestBody Patient patient) {
        Patient admitedPationt = admission.admit(patient);
        diagnoseClient.forwardTodiagnosticDepartment(admitedPationt);
        return admitedPationt;
    }

}
