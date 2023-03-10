public class Score {
    public static int rowScore;
    public static int columnScore;

    public static int checkRowScore(int[][] game) {
        for (int[] row : game) {
            for (int i = 0; i < row.length - 1; i++) {
                    if (row[i] == row[i + 1]) {
                        rowScore += row [i] + row[i + 1];
                    }
            }
        }
        return rowScore;
    }

    public static int checkColumnScore(int[][] Arr) {
        for (int i = 0; i < Arr[0].length; i++) {
            for (int j = 0; j < Arr.length - 1; j++) {
                if (Arr[j][i] == Arr[j + 1][i]) {
                    columnScore += Arr[j][i] + Arr[j + 1][i];
                }
            }
        }
        return columnScore;
    }

    public static int getTotalScore(int[][] board) {
        return checkRowScore(board) + checkColumnScore(board);
    }

}
