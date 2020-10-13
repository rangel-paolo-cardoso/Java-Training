import java.util.Scanner;

/**
 * Author: Rangel
 */
public class MatrixMain {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();

    int[][] matrix = new int[M][N];

    for (int i = 0; i < matrix.length; i += 1) {
      for (int j = 0; j < matrix[i].length; j += 1) {
        matrix[i][j] = sc.nextInt();
      }
    }

    int x = sc.nextInt();
    for (int i = 0; i < matrix.length; i += 1) {
      for (int j = 0; j < matrix[i].length; j += 1) {
        if (matrix[i][j] == x) {
          System.out.println("Position " + i + "," + j + ":");
          if (j - 1 >= 0) {
            System.out.println("Left: " + matrix[i][j - 1]);
          }
          if (i - 1 >= 0) {
            System.out.println("Up: " + matrix[i - 1][j]);
          }
          if (j + 1 < matrix[i].length) {
            System.out.println("Right: " + matrix[i][j + 1]);
          }
          if (i + 1 < matrix[i].length) {
            System.out.println("Down: " + matrix[i + 1][j]);
          }
        }
      }
    }    

    sc.close();
  }
}