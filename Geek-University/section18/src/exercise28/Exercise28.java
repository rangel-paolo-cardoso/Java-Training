package exercise28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercise28 {

    private static final String path = "./src/exercise28/";
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the input file name: ");
        String inputFileName = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String outputFileName = sc.nextLine();
        sc.close();

        try {
            sc = getScanner(path + inputFileName + ".txt");
            String fileContent = readFileContent(sc);
            fileContent = reverseFileContent(fileContent);
            writeContentToTheOutputFile(fileContent, path + outputFileName + ".txt");
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static void writeContentToTheOutputFile(String fileContent, String filePathAndName) {
        try (PrintStream fileWriter = new PrintStream(filePathAndName)) {
            fileWriter.print(fileContent);
            System.out.println("Content saved!");
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write to the output file.");
            e.printStackTrace();
        }
    }

    private static String reverseFileContent(String fileContent) {
        StringBuilder reversedContent = new StringBuilder();
        String[] fileLines = fileContent.split("\n");
        for (int i = fileLines.length - 1; i > -1; i--) {
            char[] characters = fileLines[i].toCharArray();
            for (int j = characters.length - 1; j > -1; j--) {
                reversedContent.append(characters[j]);
            }
            reversedContent.append("\n");
        }
        return reversedContent.toString();
    }

    private static String readFileContent(Scanner sc) {
        StringBuilder fileContent = new StringBuilder();
        while (sc.hasNextLine()) {
            fileContent.append(sc.nextLine());
            fileContent.append("\n");
        }
        return fileContent.toString();
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
