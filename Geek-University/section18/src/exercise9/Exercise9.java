package exercise9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise9 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the first file: ");
        String path1 = sc.nextLine();

        System.out.print("Enter the path to the second file: ");
        String path2 = sc.nextLine();

        System.out.print("Enter the name to the new file: (txt, doc, etc) ");
        String fileName = sc.nextLine();

        try {
            sc = getScanner(path1);
            String filesContent = readFiles(sc, path2);
            writeFile(fileName, filesContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        } finally {
            sc.close();
        }
    }

    private static void writeFile(String fileName, String filesContent) {
        try (PrintStream fileWriter = new PrintStream(fileName)) {
            fileWriter.println(filesContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occured while trying to write to the file.");
        }
    }

    private static String readFiles(Scanner sc, String path2) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        while (sc.hasNextLine()) {
            text.append(sc.nextLine());
            text.append("\n");
        }
        sc = getScanner(path2);
        while (sc.hasNextLine()) {
            text.append(sc.nextLine());
            text.append("\n");
        }
        return text.toString();
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
