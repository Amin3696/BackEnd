package at.nacs.fundumental2properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component


public class Word {
    @Getter
    @Value("${amin.word}")
    private String amin;
}
