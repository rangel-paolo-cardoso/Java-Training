import java.util.Locale;

public class HRApp {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        System.out.println("HR App Starts");

        Department department = new Department("Department Education");
        System.out.println(department);

        Employee emp1 = new Employee(101, "Ann", 1234.56);
        Employee emp2 = new Employee(102, "Bob", 1200.34);
        Employee emp3 = new Employee(103, "Ray", 1122.33);
        Employee emp4 = null;

        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);
        department.addEmployee(emp4);

        Employee emp = department.getEmployee(101);
        System.out.println(emp == null ? "Not found!" : emp);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.printf("Total Salary: %.2f\n", department.getTotalSalary());
        System.out.printf("Average Salary: %.2f\n", department.getAverageSalary());
    }
}
