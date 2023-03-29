import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char[][] table = new char[3][3];
        String winner = "";

        // Note: This exercise does not consider using functions or methods.
        System.out.println("You are the letter 'O'");
        System.out.println("Computer is the letter 'X'");
        do {
            System.out.println("================Tic Tac Toe================");
            System.out.println("===================Table===================");
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length; j++) {
                    if (j == table.length - 1) {
                        System.out.print(table[i][j] + "\t\n");
                    }  else {
                        System.out.print(table[i][j] + "\t|\t");
                    }
                }
                if (i < table.length - 1) {
                    for (int j = 0; j < 36; j++) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }

            System.out.println("Choose a position.");
            System.out.print("X axis: ");
            int yourX = sc.nextInt();

            System.out.print("Y axis: ");
            int yourY = sc.nextInt();
            while (
                yourX < 0 || yourX > table.length - 1
                || yourY < 0 || yourY > table.length - 1
                || table[yourX][yourY] != '\u0000'
            ) {
                System.out.println("Position occupied or invalid!");
                System.out.print("Reenter the X axis: ");
                yourX = sc.nextInt();

                System.out.print("Reenter the Y axis: ");
                yourY = sc.nextInt();
            }
            table[yourX][yourY] = 'O';
            if (
                table[0][0] == 'O' && table[0][1] == 'O' && table[0][2] == 'O'
                || table[1][0] == 'O' && table[1][1] == 'O' && table[1][2] == 'O'
                || table[2][0] == 'O' && table[2][1] == 'O' && table[2][2] == 'O'
                || table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O'
                || table[0][1] == 'O' && table[1][1] == 'O' && table[2][1] == 'O'
                || table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O'
                || table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == 'O'
            ) {
                winner = "You won!";
                break;
            }

            System.out.println("Computer's turn.");
            System.out.println("The Computer is thinking...");
            Thread.sleep(2000);
            int compX = (int) Math.floor(Math.random() * 3);
            int compY = (int) Math.floor(Math.random() * 3);
            while (table[compX][compY] != '\u0000') {
                compX = (int) Math.floor(Math.random() * 3);
                compY = (int) Math.floor(Math.random() * 3);
            }
            table[compX][compY] = 'X';
            if (
                table[0][0] == 'X' && table[0][1] == 'X' && table[0][2] == 'X'
                || table[1][0] == 'X' && table[1][1] == 'X' && table[1][2] == 'X'
                || table[2][0] == 'X' && table[2][1] == 'X' && table[2][2] == 'X'
                || table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X'
                || table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X'
                || table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X'
                || table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X'
            ) {
                winner = "Computer won!";
                break;
            }

            boolean fullTable = true;
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length; j++) {
                    if (table[i][j] == '\u0000') {
                        fullTable = false;
                        break;
                    }
                }
            }

            if (fullTable) {
                winner = "That was a tie.";
                break;
            }
        } while (true);

        System.out.printf("The winner is: %s\n", winner);

        sc.close();
    }
}
