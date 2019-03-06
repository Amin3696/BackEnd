package at.nacs.fundumental2properties;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DayOfWeekApplication {

    @Bean
    ApplicationRunner application(DayOfWeek day) {
        return args -> {
            List<String> days = day.getDay();
            System.out.println(days);
        };
    }
}
