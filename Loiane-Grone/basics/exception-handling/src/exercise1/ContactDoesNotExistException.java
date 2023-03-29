package exercise1;

public class ContactDoesNotExistException extends Exception {

    private int contactId;
    
    public ContactDoesNotExistException(int contactId) {
        this.contactId = contactId;
    }

    @Override
    public String toString() {
        return "\nThe contact with id '" + this.contactId + "' does not exist!\n";
    }
}
