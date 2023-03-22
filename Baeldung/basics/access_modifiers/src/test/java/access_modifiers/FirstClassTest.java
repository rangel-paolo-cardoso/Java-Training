package access_modifiers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstClassTest {

    private FirstClass.InnerClass innerClass;

    @Before
    public void setUp() throws Exception {
        innerClass = new FirstClass.InnerClass();
    }
    
    @Test
    public void execute_InnerClass_sayHello_Method() {
        String message = "Hello, World!";
        assertEquals(
            message.equals(innerClass.sayHello()),
            true
        );
    }
}
