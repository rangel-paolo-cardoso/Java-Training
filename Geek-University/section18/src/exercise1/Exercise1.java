package exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "./src/exercise1/file.txt";
        Scanner sc = new Scanner(System.in);

        createAndWriteFile(sc, path);

        readFile();
    }

    private static void createAndWriteFile(Scanner sc, String path) {
        try (PrintStream printStream = new PrintStream(path)) {
            String input = "";
            while (true) {
                System.out.print("Enter some text: ");
                input = sc.nextLine();
                if (input.equals("0")) {
                    break;
                }
                printStream.println(input);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to create the file.");
        } finally {
            sc.close();
        }
    }

    private static void readFile() {
        try (Scanner sc = new Scanner(new FileInputStream("./src/exercise1/file.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    System.out.println(line.charAt(i));
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }
    }
}
