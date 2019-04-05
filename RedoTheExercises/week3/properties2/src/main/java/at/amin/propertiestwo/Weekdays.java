package at.amin.propertiestwo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Weekdays {
    @Getter
    @Value("${weekDays}")
    private List<String> weekDays;
}

