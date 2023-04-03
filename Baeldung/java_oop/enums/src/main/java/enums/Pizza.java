package enums;

public class Pizza {
    private PizzaStatus status;

    public boolean isDeliverable() {
        if (geStatus() == PizzaStatus.READY) {
            return true;
        }
        return false;
    }

    public PizzaStatus geStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }
}
