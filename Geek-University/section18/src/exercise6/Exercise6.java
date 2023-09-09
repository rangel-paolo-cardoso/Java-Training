package exercise6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

import static exercise6.UtilClass.initializeAlphabetMap;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise6 {
    
    /**
     * This exercise takes into consideration the alphabets from English and Portuguese.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        try {
            sc = getScanner(path);
            Map<Character, Integer> letterCount = countAlphabetLetters(sc);
            printStatistics(letterCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        } finally {
            sc.close();
        }
    }

    private static void printStatistics(Map<Character, Integer> alphabetMap) {
        for (char key : alphabetMap.keySet()) {
            System.out.printf("%c: %d%n", key, alphabetMap.get(key));
        }
    }

    private static Map<Character, Integer> countAlphabetLetters(Scanner sc) {
        Map<Character, Integer> alphabetMap = initializeAlphabetMap();
        StringBuilder text = new StringBuilder();
        while (sc.hasNextLine()) {
            text.append(sc.nextLine());
        }

        for (char letter : text.toString().toCharArray()) {
            if (alphabetMap.containsKey(letter)) {
                alphabetMap.put(letter, alphabetMap.get(letter) + 1);
            }
        }
        return alphabetMap;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
