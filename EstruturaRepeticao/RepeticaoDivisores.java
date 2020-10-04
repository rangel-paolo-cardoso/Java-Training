import java.util.Scanner;

/**
 * Author: Rangel
*/

public class RepeticaoDivisores {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i <= N; i += 1) {
      if (N % i == 0) System.out.println(i);
    }


    sc.close();
  }
}
