package exercise3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        try {
            sc = getScanner(path);
            int numberOfVowels = countVowels(sc);
            System.out.printf("The number of vowels in the file you provided is %d%n", numberOfVowels);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        } finally {
            sc.close();
        }

    }

    private static int countVowels(Scanner sc) {
        int vowelsCount = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (char letter : line.toCharArray()) {
                vowelsCount += switch (Character.toLowerCase(letter)) {
                    case 'a', 'e', 'i', 'o', 'u' -> 1;
                    default -> 0;
                };
            }
        }
        return vowelsCount;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
