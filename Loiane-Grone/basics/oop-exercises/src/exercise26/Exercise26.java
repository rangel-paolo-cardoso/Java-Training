package exercise26;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Animal camel = new Animal("Camel", 150, 4, "Yellow", "Earth", 2.0);
        Fish shark = new Fish("Shark", 300, "Gray", "Sea", 1.5, "Fin and tail.");
        Mammal bear = new Mammal("Canada bear", 180, 4, "Red", "Earth", 0.5, "Honey");

        System.out.println("Zoo:");
        System.out.println("------------------------------");
        printAnimals(Arrays.asList(camel, shark, bear));

        sc.close();
    }

    static void printAnimals(List<Animal> animals) {
        animals.forEach(animal -> {
            System.out.println(animal);
            System.out.println("------------------------------");
        });
    }
}
