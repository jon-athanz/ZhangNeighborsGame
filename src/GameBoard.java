import java.util.Arrays;

public class GameBoard {
    public int[][] board;
    public int size;

    public GameBoard(int size) {
        this.size = size;
        board = new int[size][size];
    }

    public void printBoard() {
        for (int[] innerArr : board) {
            System.out.println(Arrays.toString(innerArr));
        }
    }

    public void setBoardPosition(int row, int column, int number) {
        board[row][column] = number;
    }

    public boolean allPositionsFilled() {
        int count = 0;
        for (int[] row : board) {
            for (int element : row) {
                if (element == 0) {
                    count++;
                }
            }
        }
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getSize() {
        return size;
    }


}
