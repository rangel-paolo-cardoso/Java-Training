package exercise9;

public class Student {

    int registration;
    String name;
    String course;
    Subject[] subjects = new Subject[3];

    boolean checkIfApprovedInASubject(String subjectName) {
        boolean approved = false;
        for (Subject subject : subjects) {
            if (subject.title.equals(subjectName)) {
                if (subject.grade >= 7) {
                    approved = true;
                }
            }
        }
        return approved;
    }
}
