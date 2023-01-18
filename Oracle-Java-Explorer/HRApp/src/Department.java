import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department {
    private String departmentName;

    private Employee[] employees = new Employee[0];

    public void addEmployee(Employee newEmployee) {
        Employee[] moreEmployees = Arrays.copyOf(this.employees, this.employees.length + 1);
        if (moreEmployees.length < 11) {
            moreEmployees[moreEmployees.length - 1] = newEmployee;
            this.employees = moreEmployees;
        } else {
            System.out.println("Too much employees for the department!");
        }
    }

    public Employee[] getEmployees() {
        List<Employee> listEmployee = new ArrayList<>();
        for (Employee emp : this.employees) {
            if (emp != null) {
                listEmployee.add(emp);
            }
        }
        return listEmployee.toArray(Employee[]::new);
    }

    public int getNumberOfNonNullEmployees() {
        int sum = 0;
        for (Employee emp : this.employees) {
            if (emp != null) {
                sum += 1;
            }
        }
        return sum;
    }

    public Employee getEmployee(int id) {
        for (Employee emp : this.employees) {
            if (emp != null && emp.getEmployeeID() == id) {
                return emp;
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double total = 0.0;
        if (this.employees.length > 0) {
            for (Employee emp : this.employees) {
                if (emp != null) {
                    total += emp.getEmployeeSalary();
                }
            }
        }
        return total;
    }

    public double getAverageSalary() {
        return getTotalSalary() / getNumberOfNonNullEmployees();
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department: " + departmentName;
    }
}
