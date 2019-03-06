package at.nacs.streetbasketball;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
class TeamLoaderTest {
    @Autowired
    TeamLoader teamLoader;

    @Autowired
    Team team;

    @Test
    void testTeam() {
        Set<Team> basketball = teamLoader.getBasketball();
        basketball.stream()
                .forEach(e -> System.out.println("Team: " + e.getTeam() + " | Players: " + e.getPlayers()));
    }


}