package enums;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza {
    private static EnumSet<PizzaStatus> undeliverablePizzaStatuses = EnumSet.of(PizzaStatus.ORDERED,
            PizzaStatus.READY);

    private PizzaStatus status;

    public boolean isDeliverable() {
        if (geStatus() == PizzaStatus.READY) {
            return true;
        }
        return false;
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.geStatus().getTimeToDelivery() + " days");
    }

    public static List<Pizza> getAllUndeliverablePizzas(List<Pizza> input) {
        return input.stream().filter(
                (s) -> undeliverablePizzaStatuses.contains(s.geStatus()))
                .collect(Collectors.toList());
    }

    public static EnumMap<PizzaStatus, List<Pizza>>
        groupPizzaByStatus(List<Pizza> pizzaList) {
            EnumMap<PizzaStatus, List<Pizza>> pzByStatus =
            new EnumMap<>(PizzaStatus.class);

            for (Pizza pz : pizzaList) {
                PizzaStatus status = pz.geStatus();
                if (pzByStatus.containsKey(status)) {
                    pzByStatus.get(status).add(pz);
                } else {
                    List<Pizza> newPzList = new ArrayList<>();
                    newPzList.add(pz);
                    pzByStatus.put(status, newPzList);
                }
            }
            return pzByStatus;
        }

    // public void deliver() {
    //     if (isDeliverable()) {
    //         PizzaDeliverySystemConfiguration.getInstance()
    //     }
    // }

    public PizzaStatus geStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }
}
