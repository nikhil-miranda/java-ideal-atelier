import Projects.TicTacToe.controller.GameController;
import Projects.TicTacToe.exceptions.DuplicateSymbolException;
import Projects.TicTacToe.exceptions.MoreThanOneBotException;
import Projects.TicTacToe.exceptions.PlayersCountDimensionMismatchException;
import Projects.TicTacToe.models.Game;
import Projects.TicTacToe.models.GameState;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args)
            throws DuplicateSymbolException, PlayersCountDimensionMismatchException, MoreThanOneBotException {

        GameController gameController = new GameController();

        Game game = gameController.startGame(3, new ArrayList<>(), new ArrayList<>());

        while (gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.printBoard(game);
            gameController.makeMove();
        }

    }

}
