package exercise12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise12 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the first file: ");
        String path = sc.nextLine();

        try {
            sc = getScanner(path);
            printFileStatistics(sc);
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static void printFileStatistics(Scanner sc) {
        int numberOfCharacters = 0;
        int numberOfLines = 0;
        int numberOfWords = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            numberOfCharacters += line.length();
            numberOfLines += 1;
            numberOfWords += calculateNumberOfWords(line);
        }

        System.out.println("Number of characters: " + numberOfCharacters);
        System.out.println("Number of lines: " + numberOfLines);
        System.out.println("Number of words: " + numberOfWords);
    }

    private static int calculateNumberOfWords(String text) {
        return text.split(" ").length;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
