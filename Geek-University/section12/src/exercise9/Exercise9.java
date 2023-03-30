package exercise9;

import java.util.Locale;
import java.util.Scanner;

import exercise9.inheritance.Computer;
import exercise9.inheritance.Equipment;

public class Exercise9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Equipment equipment = new Equipment();
        System.out.print("Enter the equiment code: ");
        equipment.setCode(sc.next());

        System.out.print("Enter the equiment price: ");
        equipment.setPrice(sc.nextDouble());
        System.out.println("---- Equipment ----");
        System.out.println(equipment.showData());


        Computer computer = new Computer();
        System.out.print("Enter the computer code: ");
        computer.setCode(sc.next());
        
        System.out.print("Enter the computer price: ");
        computer.setPrice(sc.nextDouble());

        System.out.print("Enter the computer HD memory: ");
        computer.setHardDiskMemory(sc.nextInt());
        
        System.out.print("Enter the computer RAM Memory: ");
        computer.setRamMemory(sc.nextInt());
        System.out.println("---- Computer ----");
        System.out.println(computer.showData());

        sc.close();
    }
}
