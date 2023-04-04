package enums;

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
