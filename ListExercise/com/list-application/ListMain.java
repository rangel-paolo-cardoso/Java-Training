import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

/**
 * Author: Rangel
 */
public class ListMain {

  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    System.out.print("How many employees will be registered? ");
    int numberOfEmployees = sc.nextInt();

    for (int i = 0; i < numberOfEmployees; i += 1) {
      System.out.println("\nEmployee #" + (i + 1));

      System.out.print("Id: ");
      int id = sc.nextInt();
      sc.nextLine();

      System.out.print("Name: ");
      String name = sc.nextLine();
      
      System.out.print("Salary: ");
      float salary = sc.nextFloat();
      
      Employee emp = new Employee(id, name, salary);
      employees.add(emp);
    }

    System.out.print("\nEnter the employee id tha will have salary increased: ");
    int employeeId = sc.nextInt();
    float percentage;

    Employee empSelected = employees
      .stream()
      .filter((emp) -> emp.getId() == employeeId)
      .findFirst()
      .orElse(null);

    if (empSelected == null) {
      System.out.println("This id does not exists!");
    } else {
      System.out.print("\nEnter the percentage: ");
      percentage = sc.nextFloat();
      empSelected.increaseSalary(percentage);
    }

    System.out.println("List of employees:");
    for (Employee employee : employees) {
      System.out.println(employee.toString());
    }

    sc.close();
  }
}
