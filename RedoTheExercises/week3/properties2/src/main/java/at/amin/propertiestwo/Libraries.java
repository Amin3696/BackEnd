package at.amin.propertiestwo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("libraries")
public class Libraries {

    @Getter
    @Setter
    private Map<String, Integer> books;
}
