package exercise28;

import java.util.Scanner;

public class Exercise28 {

    private static final String path = "./src/exercise28/";
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the input file name: ");
        String inputFileName = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String outputFileName = sc.nextLine();
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
