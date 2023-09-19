package exercise16;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here are fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise16 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        byte arraySize = 10;
        int[] numbers = new int[arraySize];

        System.out.print("Enter the name to the file: ");
        String fileName = sc.nextLine();

        for (byte i = 0; i < arraySize; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextByte();
        }

        String fileContent = generateFileContent(numbers);
        writeContentToTheFile(fileName, fileContent);
    }

    private static void writeContentToTheFile(String fileName, String fileContent) {
        try (PrintStream fileWriter = new PrintStream(fileName)) {
            fileWriter.print(fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("An error occured when trying to write to the file.");
            e.printStackTrace();
        }
    }

    private static String generateFileContent(int[] numbers) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            text.append(converToBinary(numbers[i]) + (i < numbers.length - 1 ? "\n" : ""));
        }
        return text.toString();
    }

    private static String converToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    private static String converToBinaryManually(int number) {
        StringBuilder numberString = new StringBuilder();
        int quotient = number / 2;
        int rest = number % 2;
        numberString.insert(0, rest);
        while (quotient > 0) {
            rest = quotient % 2;
            quotient /= 2;
            numberString.insert(0, rest);
        }
        return numberString.toString();
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
