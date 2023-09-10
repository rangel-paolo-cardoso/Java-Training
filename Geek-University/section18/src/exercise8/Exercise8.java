package exercise8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise8 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        System.out.print("Enter the name to the new file: (txt, doc, etc) ");
        String fileName = sc.nextLine();

        try {
            sc = getScanner(path);
            String fileContent = readAndGetFileContent(sc);
            fileContent = convertAllLowersToUpperCase(fileContent);
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

    private static String convertAllLowersToUpperCase(String fileContent) {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(fileContent);

        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group().toUpperCase());
        }
        matcher.appendTail(result);

        return result.toString();
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
