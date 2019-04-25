package at.amin.rsp.configuration;

import at.amin.rsp.domain.Move;
import at.amin.rsp.logic.Moves;
import at.amin.rsp.logic.player.ComputerPlayer;
import at.amin.rsp.logic.player.HumanPlayer;
import at.amin.rsp.logic.player.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfiguration {

    @Bean
    Player human(Moves moves) {
        return new HumanPlayer(moves);
    }

    @Bean
    Player computer(List<Move> moves) {
        return new ComputerPlayer(moves);
    }


}
