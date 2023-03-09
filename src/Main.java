import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Neighbors Game!");
        boolean win = false;
        int randomNum;
        GameBoard play = new GameBoard();

        while (win == false) {
            System.out.println("");
            play.printBoard();
            randomNum = (int) ((Math.random() * 9) + 1);
            System.out.println("Generated Number: " + randomNum);

            System.out.println("What row would you like to put it in?");
            int row = scan.nextInt() - 1;
            System.out.println("What column would you like to put it in?");
            int column = scan.nextInt() - 1;

            play.setBoardPosition(row, column, randomNum);
            win = play.allPositionsFilled();
        }

        System.out.println("");
        System.out.println("This is your final board: ");
        play.printBoard();





    }
}
