package exercise10.overload;

public class Person {
    private int code;
    private String name;
    private int age;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String showData() {
        return "Code: " + code
                + "\nName: " + name
                + "\nAge: " + age
                + "\n";
    }

    public String showData(int ageOption) {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Code: " + code);
        sBuilder.append("\nName: " + name);
        if (ageOption == 1) {
            sBuilder.append("\nAge: " + age);
        }
        sBuilder.append("\n");
        return sBuilder.toString();
    }
}
