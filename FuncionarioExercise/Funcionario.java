/**
 * Author: Rangel
*/

public class Funcionario {
  
  public String name;
  public double grossSalary;
  public double tax;

  public double netSalary() {
    return this.grossSalary - tax;
  }

  public void increaseSalary(double percentage) {
    this.grossSalary += this.grossSalary * percentage; 
  }

  @Override
  public String toString() {
    return
      this.name + ", "
      + String.format("$ %.2f", netSalary());
  }

}
