package exercise5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise5 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        System.out.print(
            "Enter a character to count how many times it appears in the file: ");
        char character = sc.nextLine().charAt(0);

        try {
            sc = getScanner(path);
            int characterEvidence = countCharacterEvidence(sc, character);
            System.out.printf(
                "the number of times the character %c appears is %d%n", character, characterEvidence);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        } finally {
            sc.close();
        }
    }

    private static int countCharacterEvidence(Scanner sc, char character) {
        int characterEvidence = 0;
        StringBuilder text = new StringBuilder();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            text.append(line);
        }
        for (char letter : text.toString().toCharArray()) {
            if (letter == character) {
                characterEvidence += 1;
            }
        }
        return characterEvidence;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
