package at.nacs.fundumental2properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("leasure.sauna")

public class Sauna {
    private int availableSeat;
    private double temperature;
}
