package exercise1;

public class Schedule {
    
    private Contact[] contacts;

    public Schedule(int amount) {
        this.contacts = new Contact[amount];
    }

    public void addContact(Contact contact) throws FullScheduleException {
        if (this.contacts[this.contacts.length - 1] != null) {
            throw new FullScheduleException();
        }
        for (int i = 0; i < this.contacts.length; i += 1) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                System.out.println("Id: " + contact.getId());
                break;
            }
        }
    }

    public String showContact(int id) throws ContactDoesNotExistException {
        for (Contact contact : this.contacts) {
            if (contact.getId() == id) {
                return contact.toString();
            }
        }
        throw new ContactDoesNotExistException(id);
    }
}
