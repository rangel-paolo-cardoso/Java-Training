package exercise10;

public class TikTakToe {

    String winner = "";
    char[][] table = new char[3][3];

    void buildTable() {
        System.out.println("===================Table===================");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (j == table.length - 1) {
                    System.out.print(table[i][j] + "\t\n");
                } else {
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
    }

    boolean validatePosition(int x, int y) {
        if (x < 0 || x > table.length - 1
                || y < 0 || y > table.length - 1
                || table[x][y] != '\u0000') {
            return true;
        }
        return false;
    }

    void registrerPlayerPosition(int x, int y, char currentPlayer) {
        table[x][y] = currentPlayer;
    }

    boolean checkTheWinner(char player) {
        boolean finished = false;
        for (int i = 0; i < table.length; i++) {
            if (table[i][0] == player && table[i][1] == player && table[i][2] == player) {
                finished = true;
                winner = buildWinnerPhrase(player);
                break;
            }
        }
        for (int i = 0; i < table.length; i++) {
            if (table[0][i] == player && table[1][i] == player && table[2][i] == player) {
                finished = true;
                winner = buildWinnerPhrase(player);
                break;
            }
        }
        if (table[0][0] == player && table[1][1] == player && table[2][1] == player) {
            finished = true;
            winner = buildWinnerPhrase(player);
        }
        if (table[0][2] == player && table[1][1] == player && table[2][0] == player) {
            finished = true;
            winner = buildWinnerPhrase(player);
        }
        return finished;
    }

    String buildWinnerPhrase(char player) {
        return (player == 'O') ? "You!" : "Computer!";
    }

    void performeComputerMove() throws InterruptedException {
        Thread.sleep(2000);
        int compX;
        int compY;
        do {
            compX = (int) Math.floor(Math.random() * 3);
            compY = (int) Math.floor(Math.random() * 3);
        } while (table[compX][compY] != '\u0000');
        
        registrerPlayerPosition(compX, compY, 'X');
    }

    boolean checkTiedGame() {
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
            System.out.println("That was a tie.");
            return fullTable;
        }
        return false;
    }
}
