package enums;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PizzaTest {
    
    @Test
    public void givenPizzaOrder_whenReady_thenDelivarable() {
        Pizza testPz = new Pizza();
        testPz.setStatus(PizzaStatus.READY);
        assertTrue(testPz.isDeliverable());
    }
}
