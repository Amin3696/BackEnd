package at.nacs.fundumental2properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ConfigurationProperties("dancer")
public class BallerinaLoader {

    private List<Ballerina> ballerina;
}
