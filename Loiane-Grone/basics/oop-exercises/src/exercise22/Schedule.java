package exercise22;

public class Schedule {
    
    private String name;
    private Contact[] contacts;

    public Schedule(String name, Contact[] contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAllContacts() {
        System.out.println("============" + this.name + "============");
        for (int i = 0; i < this.contacts.length; i += 1) {
            contacts[i].printInfo();
            System.out.println();
        }
    }

    public void showContact(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("=======Contact found=======");
                contact.printInfo();
                System.out.println("===========================\n");
                break;
            }
        }
    }
}
