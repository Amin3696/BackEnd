package at.nacs.diagnoses;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicalDiagnosis {

    public Patient checkUp(Patient patient){
         patient.setDiagnosis("lupus");
         return patient;
    }
}
