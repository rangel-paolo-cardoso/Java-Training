package mehod_overloading_overriding;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

    private Vehicle vehicle;
    private Car car;

    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle();
        car = new Car();
    }

    @Test
    public void whenCalledAccelerate_thenOneAssertion() {
        assertEquals(vehicle.accelerate(100),
                "The vehicle accelerates at : 100 MPH.");
    }

    @Test
    public void whenCalledRun_thenOneAssertion() {
        assertEquals(vehicle.run(), "The vehicle is running.");
    }

    @Test
    public void whenCalledStop_thenOneAssertion() {
        assertEquals(vehicle.stop(), "The vehicle has stopped.");
    }

    @Test
    public void whenCalledAccelerate_thenOneAssertion2() {
        assertEquals(car.accelerate(80), "The car accelerates at : 80 MPH.");
    }

    @Test
    public void whenCalledRun_thenOneAssertion2() {
        assertEquals(car.run(), "The vehicle is running.");
    }

    @Test
    public void whenCalledStop_thenOneAssertion2() {
        assertEquals(car.stop(), "The vehicle has stopped.");
    }

    // 
    @Test
    public void givenVehicleCarInstances_whenCalledRun_thenEqual() {
        assertEquals(vehicle.run(), car.run());
    }

    @Test
    public void givenVehicleCarInstances_whenCalledStop_thenEqual() {
        assertEquals(vehicle.stop(), car.stop());
    }
}
