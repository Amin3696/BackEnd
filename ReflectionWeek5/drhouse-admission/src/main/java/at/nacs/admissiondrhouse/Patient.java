package at.nacs.admissiondrhouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
public class Patient {

    private String id;
    private String name;
    private String symptoms;

}
