package classes_and_objects;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ObjectsUnitTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car("Ford", "Focus", "red");
    }

    @Test
    public final void when_speedIncreased_then_verifySpeed() {
        car.increaseSpeed(90);
        assertEquals(90, car.getSpeed());

        car.increaseSpeed(20);
        assertEquals(110, car.getSpeed());
    }

    @Test
    public final void when_speedDecreased_then_verifySpeed() {
        car.increaseSpeed(100);
        assertEquals(100, car.getSpeed());

        car.decreaseSpeed(50);
        assertEquals(50, car.getSpeed());

        car.decreaseSpeed(50);
        assertEquals(0, car.getSpeed());
    }
}
