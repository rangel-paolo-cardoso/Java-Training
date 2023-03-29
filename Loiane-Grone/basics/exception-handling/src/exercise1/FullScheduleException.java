package exercise1;

public class FullScheduleException extends Exception {

    public FullScheduleException() {
        super("\nERROR: The schedule is full!\n");
    }
}
