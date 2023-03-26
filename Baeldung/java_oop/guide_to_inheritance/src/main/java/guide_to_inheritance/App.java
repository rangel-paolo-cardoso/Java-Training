package guide_to_inheritance;

import java.util.Arrays;
import java.util.List;

import guide_to_inheritance.car.ArmoredCar;
import guide_to_inheritance.car.BMW;
import guide_to_inheritance.car.Car;
import guide_to_inheritance.car.SpaceCar;
import guide_to_inheritance.employees.Employee;
import guide_to_inheritance.interfaces.SpaceTraveller;

public class App {
    public static void main(String[] args) {
        System.out.println(Car.msg());
        System.out.println(ArmoredCar.msg());

        ArmoredCar armoredCar = new ArmoredCar();
        armoredCar.setModel("Armored Car");
        System.out.println("Registered model: " + armoredCar.registerModel());
        armoredCar.fly();
        armoredCar.FloatOnWater();
        armoredCar.repair();
        armoredCar.aMethod();

        SpaceCar spaceTraveller = new SpaceCar();
        spaceTraveller.setModel("Space Car");

        BMW bmw = new BMW();
        bmw.setModel("BMW");

        // Employees
        Employee e1 = new Employee("Shreay", armoredCar);
        Employee e2 = new Employee("Paul", spaceTraveller);
        Employee e3 = new Employee("Pavni", bmw);

        List<Employee> employees = Arrays.asList(e1, e2, e3);
        employees.forEach(e -> {
            if (e.getCar() instanceof ArmoredCar) {
                System.out.println("Registered model: " + ((ArmoredCar) e.getCar()).registerModel());
            }
            if (e.getCar() instanceof SpaceCar) {
                System.out.println("Registered model: " + ((SpaceCar) e.getCar()).registerModel());
            }
            if (e.getCar() instanceof BMW) {
                System.out.println("Registered model: " + ((BMW) e.getCar()).registerModel());
            }
        });
    }
}
