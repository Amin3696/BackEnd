package at.amin.rsp.logic.player;

import at.amin.rsp.domain.Move;

public interface Player {

    Move choose();

    boolean wantsToPlayAgain();
}
