package at.nacs.streetbasketball;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Configuration
public class Tournament {
    @Bean
    ApplicationRunner applicationRunner(TeamLoader team) {
        return args ->
        {
            System.out.println("-------------------------------------");
            System.out.println("Welcome to the street basketball tournament!\n" +
                    "These are the teams who signed up:");
            Set<Team> basketball = team.getBasketball();
            basketball.stream()
                    .forEach(e -> System.out.println("Team: " + e.getTeam() + " | Players: " + e.getPlayers()));
        };
    }

    @Bean
    ApplicationRunner applicationRunner2(TeamLoader teamLoader) {
        return args -> {
            Set<Team> basketball = teamLoader.getBasketball();
            Deque<Team> teams = new ArrayDeque<>(basketball);
            System.out.println("-------------------------------------");

            while (teams.size() > 1) {
                Team team1 = teams.poll();
                Team team2 = teams.poll();
                System.out.println(team1.getTeam() + " plays vs " + team2.getTeam());
                List<Team> play = new ArrayList<>();
                play.add(team1);
                play.add(team2);
                Team winner = playBasketbal(play);
                teams.addLast(winner);
                System.out.println("And " + winner.getTeam() + " wins this match!");
            }
            System.out.println("The tournament's winning team is " + teams.poll().getTeam());

        };

    }

    private Team playBasketbal(List<Team> teams) {
        Random random = new Random();
        int position = random.nextInt(2);
        return teams.get(position);
    }


}
