package hw.level5and6;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }


    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.println(field[i][j] + "\t");
            }
        }
    }

    public int[][] createField() {
        int[][] field = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        return field;
    }

   /* public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return true;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return true;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        return true;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return true;
    }

    public boolean isDrawPosition(int[][] field) {
        return true;
    }*/

    public boolean isWin(int[][] arr, int playerToCheck) {

    }

    public boolean isDraw(int[][] arr) {

    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input X:");
        int x = scanner.nextInt();
        System.out.println("Input Y:");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
