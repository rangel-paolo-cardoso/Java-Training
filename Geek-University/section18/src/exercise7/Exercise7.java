package exercise7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise7 {

    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        System.out.print("Enter the name to the new file: (txt, doc, etc) ");
        String fileName = sc.nextLine();

        try {
            String fileContent = readAndGetFileContent(getScanner(path));
            fileContent = overwriteVowels(fileContent);
            createAndWriteFile(fileName, fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It was not possible to read the file.");
        } finally {
            sc.close();
        }
    }

    private static void createAndWriteFile(String fileName, String fileContent) {
        try (PrintStream fileWriter = new PrintStream(fileName)) {
            fileWriter.println(fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occured while trying to write to the file.");
        }
    }

    private static String overwriteVowels(String fileContent) {
        return fileContent.replaceAll("[aeiouAEIOU]", "*");
    }

    private static String readAndGetFileContent(Scanner sc) {
        StringBuilder text = new StringBuilder();
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
