import java.util.Scanner;

/**
 * Author: Rangel
*/

public class RepeticaoLinhas {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i <= N; i += 1) {
      System.out.printf("%d %d %d\n", i, (i * i), (i * i * i));
    }


    sc.close();
  }
}
