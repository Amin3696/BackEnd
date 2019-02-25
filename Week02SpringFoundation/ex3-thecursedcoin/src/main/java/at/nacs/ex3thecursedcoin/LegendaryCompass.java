package at.nacs.ex3thecursedcoin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LegendaryCompass {

    private final CursedCoin cursedCoin;

    public String findCoursedCoin() {
        return cursedCoin.getClass().getSimpleName();
    }
}
