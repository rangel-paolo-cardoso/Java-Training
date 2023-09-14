package exercise11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise11 {

    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the first file: ");
        String path = sc.nextLine();

        System.out.println("Enter a word to be searched in the file: ");
        String wordToSearch = sc.nextLine();

        try {
            sc = getScanner(path);
            int wordEvidences = countWordEvidences(sc, wordToSearch);
            System.out.printf(
                    "The number of times the word %s appeardin the file is %d%n",
                    wordToSearch,
                    wordEvidences);
        } catch (Exception e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static int countWordEvidences(Scanner sc, String wordToSearch) {
        int wordEvidences = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains(wordToSearch)) {
                wordEvidences += 1;
            }
        }
        return wordEvidences;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
