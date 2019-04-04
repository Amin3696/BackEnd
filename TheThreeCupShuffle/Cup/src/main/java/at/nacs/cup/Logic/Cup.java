package at.nacs.cup.Logic;

import org.springframework.stereotype.Service;

@Service
public class Cup {

    private Boolean coin;

    public Boolean hasCoin() {
        return coin;
    }

    public void placeCoin() {
        coin = true;
    }

    public void removeCoin() {
        coin = false;

    }
}
