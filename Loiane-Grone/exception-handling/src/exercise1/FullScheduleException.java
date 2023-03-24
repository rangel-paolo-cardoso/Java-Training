package exercise1;

public class FullScheduleException extends Exception {

    public FullScheduleException() {
        super("ERROR: The schedule is full!");
    }
}
