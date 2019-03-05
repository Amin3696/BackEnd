package at.nacs.fundumental2properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DayOfWeek {

@Getter
    @Value("${week.day}")
    private List<String> day;
}
