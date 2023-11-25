import Projects.TicTacToe.controller.GameController;
import Projects.TicTacToe.exceptions.DuplicateSymbolException;
import Projects.TicTacToe.exceptions.MoreThanOneBotException;
import Projects.TicTacToe.exceptions.PlayersCountDimensionMismatchException;
import Projects.TicTacToe.models.*;
import Projects.TicTacToe.strategies.ColumnWinningStrategy;
import Projects.TicTacToe.strategies.DiagonalWinningStrategy;
import Projects.TicTacToe.strategies.RowWinningStrategy;
import Projects.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args)
            throws DuplicateSymbolException, PlayersCountDimensionMismatchException, MoreThanOneBotException {

        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);

        int dimensions = 3;
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1L, "nikhil", new Symbol('X'), PlayerType.HUMAN ));
        playerList.add(new Player(2L, "miranda", new Symbol('0'), PlayerType.HUMAN ));

        List<WinningStrategy> winningStrategyList = List.of(
                new ColumnWinningStrategy(),
                new RowWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        Game game = gameController.startGame(dimensions, playerList, winningStrategyList);

        while (gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.printBoard(game);
            gameController.makeMove(game);
        }

        System.out.println("Game is finished");
        GameState gameState = gameController.checkState(game);

        if (gameState.equals(GameState.DRAW)) {
            System.out.println("Game is drawn");
        } else if (gameState.equals(GameState.WINNER)) {
            System.out.println("Game is finished");

        }


    }

}
