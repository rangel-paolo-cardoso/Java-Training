package abstract_classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void when_Initialized_With_New_Then_Instance_Is_Not_Null() {
        User user = new User();

        assertEquals(false, user == null);
    }

    @Test
    public void when_Values_Are_Not_Initialized_Then_Use_Default() {
        User user = new User();

        assertEquals(true, user.getName() == null);
        assertEquals(true, user.getId() == 0);
    }

    @Test
    public void when_Initialized_With_Reflection_Then_Instance_Is_Not_Null()
            throws Exception {
        User user = User.class.getConstructor(String.class, int.class)
                .newInstance("Alice", 2);

        assertEquals(true, user != null);
    }

    @Test
    public void when_Copied_With_Clone_Then_Exatc_Match_Is_Created()
        throws CloneNotSupportedException {
            User user = new User("Rangel", 3);
            User clonUser = (User) user.clone();

            assertEquals(true, clonUser.getId() == user.getId());
            assertEquals(true, clonUser.getName() == user.getName());
        }
}
