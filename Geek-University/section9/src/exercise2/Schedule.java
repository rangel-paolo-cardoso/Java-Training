package exercise2;

public class Schedule {
    
    private Person[] people;

    public Schedule() {
        people = new Person[10];
    }

    public void registerPerson(Person person) {
        for (int i = 0; i < people.length; i += 1) {
            if (people[i] == null) {
                people[i] = person;
                break;
            }
        }
    }

    public void removePerson(String name) {
        for (int i = 0; i < people.length; i += 1) {
            if (people[i].getName().equals(name)) {
                people[i] = null;
                break;
            }
        }
    }

    public int searchPerson(String name) {
        int position = -1;
        for (int i = 0; i < people.length; i += 1) {
            if (people[i].getName().equals(name)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void printSchedule() {
        for (int i = 0; i < people.length; i += 1) {
            people[i].printInfo();
        }
    }

    public void printPerson(int index) {
        if (index > -1 && index < people.length) {
            people[index].printInfo();
        } else {
            System.out.println("Invalid position!");
        }
    }
}
