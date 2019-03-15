package at.nacs.morsecode;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/morse")
@RequiredArgsConstructor

public class MorseEndpoint {

    private final MorseCodeRepository morseCodeRepository;

    @GetMapping
    List<MorseCode> morseCodes() {
        return morseCodeRepository.findAll();
    }

    @PostMapping
    MorseCode add(@RequestBody MorseCode code) {
        morseCodeRepository.add(code);
        return code;
    }

}
