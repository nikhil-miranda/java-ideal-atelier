import Projects.TicTacToe.controller.GameController;
import Projects.TicTacToe.models.Game;

public class Client {

    public static void main(String[] args) {

        GameController gameController = new GameController();

        Game game = gameController.startGame();


    }

}
