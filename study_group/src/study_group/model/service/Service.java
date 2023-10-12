package study_group.model.service;

import study_group.model.student.Student;
import study_group.model.group.StudentGroup;

public class Service {
    private int idStudent;
    //    private MyStudentBuilder<Student> builder;
    private StudentGroup<Student> group;

    public Service() {
        group = new StudentGroup<>();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(idStudent++, name, age);
        group.addStudent(student);
    }

    public String getStudentListInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("There is list of students: \n");
        for (Student student : group) {
            sb.append(student);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByName() {
        group.sortByName();
    }

    public void sortByAge() {
        group.sortByAge();
    }

}
