package exercise26;

public class Mammal extends Animal {

    private String food;

    public Mammal() {
        super();
    }

    public Mammal(
            String name,
            double length,
            int paws,
            String color,
            String envorinment,
            double speed,
            String food) {
        super(name, length, paws, color, envorinment, speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String toString() {
        return super.toString()
                + "\nFood: " + this.getFood();
    }
}
