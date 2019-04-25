package at.amin.rsp.logic.player;

import at.amin.rsp.domain.Move;
import at.amin.rsp.logic.Moves;
import lombok.RequiredArgsConstructor;

import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

@RequiredArgsConstructor
public class HumanPlayer implements Player {

    private final Moves moves;

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move choose() {
        Optional<Move> humansMove=Optional.empty();
        while (humansMove.isEmpty()){
            humansMove= getMove();
        }

        return humansMove.get();
    }

    private Optional<Move> getMove() {
        System.out.println("Please choose your move " + moves.asString() + ": ");
        String inputMove = scanner.next();
        Optional<Move> humansMove = moves.from(inputMove);
        return humansMove;
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again?(yes/no)");
        String choice = scanner.next();
        return Objects.equals(choice, "yes");
    }
}
