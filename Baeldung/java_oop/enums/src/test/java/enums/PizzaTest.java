package enums;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.EnumMap;
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

    @Test
    public void givenPizaOrders_whenGroupByStatusCalled_thenCorrectlyGrouped() {
        List<Pizza> pzList = new ArrayList<>();
        Pizza pz1 = new Pizza();
        pz1.setStatus(PizzaStatus.DELIVERED);

        Pizza pz2 = new Pizza();
        pz2.setStatus(PizzaStatus.ORDERED);

        Pizza pz3 = new Pizza();
        pz3.setStatus(PizzaStatus.ORDERED);

        Pizza pz4 = new Pizza();
        pz4.setStatus(PizzaStatus.READY);

        pzList.add(pz1);
        pzList.add(pz2);
        pzList.add(pz3);
        pzList.add(pz4);

        EnumMap<PizzaStatus, List<Pizza>> map = Pizza.groupPizzaByStatus(pzList);
        assertTrue(map.get(PizzaStatus.DELIVERED).size() == 1);
        assertTrue(map.get(PizzaStatus.ORDERED).size() == 2);
        assertTrue(map.get(PizzaStatus.READY).size() == 1);
    }
}
