package entities;

public class Employee {
  
  private int id;
  private String name;
  private float salary;

  public Employee(int id, String name, float salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public float getSalary() {
    return salary;
  }

  public void increaseSalary(float percentage) {
    this.salary += this.salary * percentage;
  }

  @Override
  public String toString() {
    return this.getId() + ", " +
      this.getName() + ", " +
      this.getSalary();
  }
  
}
