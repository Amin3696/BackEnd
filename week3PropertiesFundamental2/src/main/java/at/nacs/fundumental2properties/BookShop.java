package at.nacs.fundumental2properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Getter
@Setter
@ConfigurationProperties("booklist")
public class BookShop {

    private Map<String,Integer> book;
}
