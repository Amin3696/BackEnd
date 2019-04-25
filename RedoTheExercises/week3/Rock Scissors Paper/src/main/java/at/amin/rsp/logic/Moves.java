package at.amin.rsp.logic;

import at.amin.rsp.domain.Move;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor

public class Moves {

    private final List<Move> moves;

    public String asString() {
        return moves.stream()
                .map(Move::getName)
                .collect(Collectors.joining(", "));
    }

    public Optional<Move> from(String name) {
        return moves.stream()
                .filter(e -> Objects.equals(e.getName(), name))
                .findFirst();

    }
}
