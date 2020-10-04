import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
 */
public class LeituraNumeroFuncionario {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int codigoFuncionario;
    short horasTrabalhadas;
    double valorHora;

    codigoFuncionario = sc.nextInt();
    horasTrabalhadas = sc.nextShort();
    valorHora = sc.nextDouble();

    System.out.println("NUMBER = " + codigoFuncionario);
    System.out.printf("SALARY = U$ %.2f\n", (horasTrabalhadas * valorHora));

    sc.close();
  }
}
