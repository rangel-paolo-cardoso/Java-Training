import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
*/

public class RepecicaoLeituraNumeros {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i <= N; i += 1) {
      float v1 = sc.nextFloat();
      float v2 = sc.nextFloat();
      if (v2 == 0) System.out.println("divisao impossivel");
      else {
        System.out.printf("%.1f\n", (v1 / v2));
      }
    }

    sc.close();
  }
}


