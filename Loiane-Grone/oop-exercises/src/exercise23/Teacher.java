package exercise23;

public class Teacher {

    private String name;
    private String department;
    private String email;

    public Teacher() {
    }

    public Teacher(String name, String department, String email) {
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n=======Teacher Info========\n");
        stringBuilder.append("Name: " + this.name);
        stringBuilder.append(",\nDepartment: " + this.department);
        stringBuilder.append(",\nEmail: " + this.email);
        stringBuilder.append("=============================\n");
        System.out.println(stringBuilder.toString());
    }
}
