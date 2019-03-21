package at.nacs.admissiondrhouse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
public class Patient {

    private String id;
    private String name;
    private String symptoms;

}
