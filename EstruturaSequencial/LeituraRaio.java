import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
*/
public class LeituraRaio {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double raio, area;
    double pi = 3.14159;

    raio = sc.nextDouble();
    area = pi * Math.pow(raio, 2);

    System.out.printf("A=%.4f\n", area);

    sc.close();
  }
}
