package exercise23;

import java.util.Date;

public class Course {
    
    private String name;
    private Date schedule;
    private Teacher teacher;

    private Student[] students;

    public Course(String name, Date schedule, Teacher teacher, Student[] students) {
        this.name = name;
        this.schedule = schedule;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = new Date(schedule.getTime());
    }

    public void getTeacher() {
        teacher.printInfo();
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void showStudentsReportCards() {
        for (Student student : this.students) {
            student.printInfo();
        }
    }
}
