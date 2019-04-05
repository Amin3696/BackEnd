package at.amin.propertiestwo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("facilities")
public class Facilities {

    @Getter
    @Setter
    private Sauna sauna;
}
