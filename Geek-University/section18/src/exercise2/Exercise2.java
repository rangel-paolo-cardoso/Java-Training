package exercise2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String filePath = sc.nextLine();

        try {
            sc = getScanner(filePath);
            int numberOfLines = countLines(sc);
            System.out.printf("The file you entered has %d lines%n", numberOfLines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        } finally {
            sc.close();
        }
    }

    private static int countLines(Scanner sc) {
        int count = 0;
        while (sc.hasNextLine()) {
            count += 1;
            sc.nextLine();
        }
        return count;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
