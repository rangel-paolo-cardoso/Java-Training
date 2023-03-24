package exercise1;

public class Contact {
    private int id;
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.id = (int) (Math.random() * 1_000_000);
        this.name = name;
        this.phone = phone;
        System.out.println("Id: " + this.getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "_____Contact Information_____"
                + "Id: " + this.id
                + "\nName: " + this.name
                + "\nPhone: " + this.phone;
    }
}
