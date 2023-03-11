package exercise3;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Elevator elevator = new Elevator();

        System.out.print("Enter the total capacity of the elevator: ");
        int capacity = sc.nextInt();

        System.out.print("Enter the number of floor: ");
        int floors = sc.nextInt();

        elevator.initilizeElevator(capacity, floors);

        System.out.println("Current floor: " +  elevator.getCurrentFloor());

        for (int i = 0; i <= capacity; i += 1) {
            elevator.enterElevator();
        }

        System.out.println("People inside the elevator: " +  elevator.getPeopleInside());

        for (int i = 0; i <= floors; i += 1) {
            elevator.goUp();
        }

        System.out.println("Current floor: " +  elevator.getCurrentFloor());

        for (int i = 0; i <= floors; i += 1) {
            elevator.goDown();
        }

        System.out.println("Current floor: " +  elevator.getCurrentFloor());

        for (int i = 0; i <= capacity; i += 1) {
            elevator.leaveElevator();
        }

        System.out.println("People inside the elevator: " +  elevator.getPeopleInside());

        sc.close();
    }
}
