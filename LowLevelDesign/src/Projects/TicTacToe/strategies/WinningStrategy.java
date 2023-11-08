package Projects.TicTacToe.strategies;

import Projects.TicTacToe.models.Board;

public interface WinningStrategy {

    void checkWinner(Board board);

}
