package access_modifiers.another_package;

import access_modifiers.FirstClass;

public class SecondClass extends FirstClass {

    // public SecondClass(String name) {
    //     FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
    // }

    protected SecondClass(String name) {
        super(name);
        FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
    }
}
