package at.amin.rsp.configuration;

import at.amin.rsp.domain.Move;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("game")
public class MoveConfiguration {

    @Setter
    private List<Move> moves;

    @Bean
    List<Move> available() {
        return moves;
    }
}
