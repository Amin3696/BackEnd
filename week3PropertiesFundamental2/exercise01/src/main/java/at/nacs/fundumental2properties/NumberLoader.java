package at.nacs.fundumental2properties;

import com.sun.jdi.IntegerValue;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NumberLoader {

    @Getter
    @Value("${word.number}")
    private Integer value;

}

