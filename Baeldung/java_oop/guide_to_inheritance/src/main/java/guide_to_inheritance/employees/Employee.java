package guide_to_inheritance.employees;

import guide_to_inheritance.car.Car;

public class Employee {
    private String name;
    private Car car;

    public Employee() {}

    public Employee(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
