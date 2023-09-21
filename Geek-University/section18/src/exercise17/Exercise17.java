package exercise17;

import java.io.FileInputStream;
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
public class Exercise17 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the matrix info file: ");
        String path = sc.nextLine();

        System.out.print("Enter the path and name to the output file: ");
        String outputFileName = sc.nextLine();

        try {
            sc = getScanner(path);
            int[][] matrix = readFile(sc);
            printMatrixToTheFile(outputFileName, matrix);
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        }
    }

    private static void printMatrixToTheFile(String outputFileName, int[][] matrix) {
        try (PrintStream fileWriter = new PrintStream(outputFileName)) {
            fileWriter.print(stringfyMatrix(matrix));
        } catch (FileNotFoundException e) {
            System.out.println("An error ocurred while trying to write to the file.");
            e.printStackTrace();
        }
    }

    private static String stringfyMatrix(int[][] matrix) {
        StringBuilder matrixText = new StringBuilder();
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                matrixText.append(matrix[line][column]);
                if (column < matrix[line].length - 1) {
                    matrixText.append(" ");
                }
            }
            if (line < matrix.length - 1) {
                matrixText.append("\n");
            }
        }
        return matrixText.toString();
    }

    private static int[][] readFile(Scanner sc) {
        String[] lineInfo;
        byte matrixLines = 0;
        byte matrixColumns = 0;
        byte nullableCells = 0;
        int[][] nullCellsPositions;
        while (true) {
            if (sc.hasNextLine()) {
                lineInfo = sc.nextLine().split(" ");
                matrixLines = Byte.parseByte(lineInfo[0]);
                matrixColumns = Byte.parseByte(lineInfo[1]);
                nullableCells = Byte.parseByte(lineInfo[2]);
                break;
            }
        }

        nullCellsPositions = new int[nullableCells][];
        byte column1 = 0;
        byte column2 = 0;
        for (int i = 0; i < nullableCells; i++) {
            if (sc.hasNextLine()) {
                lineInfo = sc.nextLine().split(" ");
                column1 = Byte.parseByte(lineInfo[0]);
                column2 = Byte.parseByte(lineInfo[1]);
                nullCellsPositions[i] = new int[] { column1, column2 };
            }
        }

        return createMatrix(matrixLines, matrixColumns, nullCellsPositions);
    }

    private static int[][] createMatrix(byte matrixLines, byte matrixColumns, int[][] nullCellsPositions) {
        byte nullLine = 0;
        byte nullColumn = 0;
        int[][] matrix = new int[matrixLines][matrixColumns];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                matrix[line][column] = 1;
            }
        }
        for (int i = 0; i < nullCellsPositions.length; i++) {
            nullLine = (byte) nullCellsPositions[i][0];
            nullColumn = (byte) nullCellsPositions[i][1];
            matrix[nullLine][nullColumn] = 0;
        }
        return matrix;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
