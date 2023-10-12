package study_group.model.builder;

import study_group.model.student.Student;

public class MyStudentBuilder<T> {
    private int id;
    public T createStudent(String name,
                           int age){
        return (T)new Student(id++, name, age);
    }
}
