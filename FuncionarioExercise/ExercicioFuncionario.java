import java.util.Locale;
import java.util.Scanner;

/**
 * Author: Rangel
 */
public class ExercicioFuncionario {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Gross salary: ");
    double grossSalary = sc.nextDouble();

    System.out.print("Tax: ");
    double tax = sc.nextDouble();

    Funcionario funcionario = new Funcionario(name, grossSalary, tax);

    System.out.println("\nEmployee: " + funcionario.toString());
    System.out.print("\nWhich percentage to increase salary? ");
    funcionario.increaseSalary(sc.nextDouble());

    System.out.println("\nUpdated data: " + funcionario.toString());

    sc.close();
  }
}
