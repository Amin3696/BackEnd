package at.nacs.diagnoses;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder

public class Patient {

    private String id;
    private String name;
    private String symptoms;
    private String diagnosis;
}
