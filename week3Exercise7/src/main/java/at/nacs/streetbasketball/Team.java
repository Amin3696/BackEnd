package at.nacs.streetbasketball;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Data
public class Team {
    private String team;
    private List<String> players;
}
