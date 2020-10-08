/**
 * Author: Rangel
*/

public class Funcionario {
  
  public String name;
  public double grossSalary;
  public double tax;

  public Funcionario(String name, double grossSalary, double tax) {
    this.name = name;
    this.grossSalary = grossSalary;
    this.tax = tax;
  }

  public double netSalary() {
    return this.grossSalary - tax;
  }

  public void increaseSalary(double percentage) {
    this.grossSalary += this.grossSalary * (percentage / 100); 
  }

  @Override
  public String toString() {
    return
      this.name + ", "
      + String.format("$ %.2f", this.netSalary());
  }

}
