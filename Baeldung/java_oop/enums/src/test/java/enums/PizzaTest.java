package enums;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PizzaTest {
    
    @Test
    public void givenPizzaOrder_whenReady_thenDelivarable() {
        Pizza testPz = new Pizza();
        testPz.setStatus(PizzaStatus.READY);
        assertTrue(testPz.isDeliverable());
    }

    @Test
    public void givenPizzaOrders_whenRetriveingUnDeliveredPzs_thenCorrectlyRetrieved() {
        List<Pizza> pzList = new ArrayList<>();
        Pizza pz1 = new Pizza();
        pz1.setStatus(PizzaStatus.DELIVERED);

        Pizza pz2 = new Pizza();
        pz1.setStatus(PizzaStatus.ORDERED);

        Pizza pz3 = new Pizza();
        pz1.setStatus(PizzaStatus.ORDERED);

        Pizza pz4 = new Pizza();
        pz1.setStatus(PizzaStatus.READY);

        pzList.add(pz1);
        pzList.add(pz2);
        pzList.add(pz3);
        pzList.add(pz4);

        List<Pizza> undeliverabledPzs = Pizza.getAllUndeliverablePizzas(pzList);
        assertTrue(undeliverabledPzs.size() == 3);
    }
}
