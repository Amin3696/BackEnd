package at.nacs.morsecode;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class MorseCodeRepository {

    private Set<MorseCode> morsecodes = new HashSet<>();

    public void add(MorseCode morseCode) {
        morsecodes.add(morseCode);
    }
    public List<MorseCode> findAll() {
        return new ArrayList<>(morsecodes);
    }

}
