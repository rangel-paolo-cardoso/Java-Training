package exercise14;

import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char player = 'O';

        System.out.println("You are the letter 'O'");
        System.out.println("Computer is the letter 'X'");
        TikTakToe tikTakToe = new TikTakToe();

        do {
            tikTakToe.buildTable();
            System.out.println("Choose a position.");
            System.out.print("X axis: ");
            int yourX = sc.nextInt();

            System.out.print("Y axis: ");
            int yourY = sc.nextInt();
            while (tikTakToe.validatePosition(yourX, yourY)) {
                System.out.println("Position occupied or invalid!");
                System.out.print("Reenter the X axis: ");
                yourX = sc.nextInt();

                System.out.print("Reenter the Y axis: ");
                yourY = sc.nextInt();
            }
            tikTakToe.registrerPlayerPosition(yourX, yourY, player);
            if (tikTakToe.checkTheWinner(player)) {
                break;
            }
            player = 'X';

            System.out.println("Computer's turn.");
            System.out.println("The Computer is thinking...");
            tikTakToe.performeComputerMove();
            if (tikTakToe.checkTheWinner(player)) {
                break;
            }
            if (tikTakToe.checkTiedGame()) {
                break;
            }
            player = 'O';
        } while (true);

        if (!tikTakToe.getWinner().equals("")) {
            System.out.printf("The winner is: %s\n", tikTakToe.getWinner());
        }
        
        sc.close();
    }
}
