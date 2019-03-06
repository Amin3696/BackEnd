package at.nacs.fundumental2properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Getter
@Setter
@ConfigurationProperties("booklist")
@PropertySource("applicationYml.yml")

public class BookShop {

    private Map<String, Integer> book;
}
