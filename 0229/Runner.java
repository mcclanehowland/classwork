import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner keyboard = new Scanner(System.in);
        while(!g.checkFull()) {
            g.printTable();
            System.out.println("Player 1 please enter the row of you turn");
            int row = keyboard.nextInt();
            System.out.println("Player 1 please enter the column");
            int column = keyboard.nextInt();
            g.player1Turn(row-1,column-1);
            System.out.println();
            g.printTable();
            if(g.checkFull()) {
                break;
            }
            if(g.checkTicTacToe1()) {
                System.out.println("player 1 wins");
                break;
            }
            System.out.println("Player 2 please enter the row of you turn");
            row = keyboard.nextInt();
            System.out.println("Player 2 please enter the column");
            column = keyboard.nextInt();
            g.player2Turn(row-1,column-1);
            if(g.checkTicTacToe2()) {
                System.out.println("player 2 wins");
                break;
            }
            System.out.println();
        }
    }
}

