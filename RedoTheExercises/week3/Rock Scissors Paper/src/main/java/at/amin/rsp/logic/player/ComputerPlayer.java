package at.amin.rsp.logic.player;

import at.amin.rsp.domain.Move;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
public class ComputerPlayer implements Player {

    private final List<Move> moves;
    private final Random random = new Random();

    @Override
    public Move choose() {
        int randomIndexOfMove = random.nextInt(moves.size());
        return moves.get(randomIndexOfMove);
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}
