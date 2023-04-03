package enums;

public class App {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.setStatus(PizzaStatus.DELIVERED);

        System.out.println(pizza.geStatus());

        PizzaStatus status = pizza.geStatus();
        System.out.println(status.isDelivered());
    }
}
