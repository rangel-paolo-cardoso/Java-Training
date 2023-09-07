package exercise3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// import java.io.FileInputStream;
import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        try {
            sc = getScanner(path);
            int numberOfVowels = countVowels(sc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        }

    }

    private static int countVowels(Scanner sc) {
        //
        return 1;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
