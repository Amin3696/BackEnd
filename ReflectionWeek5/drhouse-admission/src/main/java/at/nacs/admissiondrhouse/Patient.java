package at.nacs.admissiondrhouse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder  //to be able to build it in Test
public class Patient {

    private String id;
    private String name;
    private String symptoms;

}
