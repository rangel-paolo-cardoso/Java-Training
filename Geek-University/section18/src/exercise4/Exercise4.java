package exercise4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise4 {
    
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
            Map<String, Integer> letterMap = countVowelsAndConsonants(sc);
            System.out.printf("Number of vowels: %d%n", letterMap.get("vowelsCount"));
            System.out.printf("Number of consonants: %d%n", letterMap.get("consonantsCount"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        } finally {
            sc.close();
        }
    }

    private static Map<String, Integer> countVowelsAndConsonants(Scanner sc) {
        int vowels = 0;
        int consonants = 0;
        Map<String, Integer> letterMap = new HashMap<>();
        StringBuilder text = new StringBuilder();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            text.append(line);
        }
        for (char letter : text.toString().toCharArray()) {
            vowels += switch (Character.toLowerCase(letter)) {
                case 'a', 'ã', 'á', 'â', 'e', 'é', 'ê',
                        'i', 'í', 'o', 'ó', 'ô', 'õ', 'u', 'ú' -> 1;
                default -> 0;
            };
            consonants += switch (Character.toLowerCase(letter)) {
                case 'b', 'c', 'd', 'f', 'g', 'j', 'k', 'l',
                        'm', 'n', 'p', 'q', 'r', 's',
                        't', 'v', 'w', 'x', 'z' -> 1;
                default -> 0;
            };
        }
        letterMap.put("vowelsCount", vowels);
        letterMap.put("consonantsCount", consonants);
        return letterMap;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
