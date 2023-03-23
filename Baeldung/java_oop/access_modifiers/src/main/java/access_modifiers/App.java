package access_modifiers;

public class App {
    public static void main(String[] args) {
        FirstClass.InnerClass innerClass = new FirstClass.InnerClass();

        String message = innerClass.sayHello();
        System.out.println(message);
    }
}
