package at.nacs.reflectionweek3;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
public class HandShakeTranslator {
    private final HandshakeLoader handshakeLoader;

    public List<String> translate(Integer input) {
        Map<Integer, String> handshakes = handshakeLoader.getMove();
        return Stream.of(String.valueOf(input).split(""))
                .map(Integer::valueOf)
                .filter(handshakes::containsKey)
                .map(handshakes::get)
                .collect(Collectors.toList());
    }
}