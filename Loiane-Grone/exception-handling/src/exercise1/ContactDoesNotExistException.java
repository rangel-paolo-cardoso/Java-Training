package exercise1;

public class ContactDoesNotExistException extends Exception {
    
    public ContactDoesNotExistException() {
        super("ERROR: The contact does not exist in the schedule.");
    }
}
