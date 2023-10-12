package study_group.presenter;

import study_group.model.service.Service;
import study_group.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view){
        this.view = view;
        service = new Service();
    }

    public void addStudent(String name, int age) {
        service.addStudent(name, age);
        System.out.println();
//        getStudentList();1

    }

    public void getStudentList() {
        String answer = service.getStudentListInfo();
        view.printAnswer(answer);
    }

    public void sortByName() {
        service.sortByName();
        getStudentList();
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentList();
    }
}
