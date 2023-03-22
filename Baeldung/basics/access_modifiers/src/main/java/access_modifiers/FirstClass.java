package access_modifiers;

public class FirstClass {
    
    protected String name;

    protected FirstClass(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    protected static class InnerClass {
        public InnerClass() {}

        public String sayHello() {
            return "Hello, World!";
        }
    }
}
