package Projects.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;

    private List<List<Cell>> board;

    public Board(int size, List<List<Cell>> board) {
        this.size = size;
        this.board = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
