import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
 */
public class ExercicioFuncionario {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Funcionario funcionario = new Funcionario();
    System.out.print("Name: ");
    funcionario.name = sc.nextLine();

    System.out.print("Gross salary: ");
    funcionario.grossSalary = sc.nextDouble();

    System.out.print("Tax: ");
    funcionario.tax = sc.nextDouble();

    System.out.println("\nEmployee: " + funcionario.toString());
    System.out.print("\nWhich percentage to increase salary? ");
    funcionario.increaseSalary(sc.nextDouble());

    System.out.printf("\nUpdated data: $ %.2f\n", funcionario.netSalary());

    sc.close();
  }
}
