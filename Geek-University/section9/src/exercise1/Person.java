package exercise1;

public class Person {

    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\n");
        stringBuilder.append("Age: ");
        stringBuilder.append(this.age);
        stringBuilder.append("\n");
        stringBuilder.append("Height: ");
        stringBuilder.append(this.height);
        System.out.println(stringBuilder.toString());
    }
}
