package study_group.model.group;


import study_group.model.group.comparators.StudentComparatorByAge;
import study_group.model.group.comparators.StudentComparatorByName;
import study_group.model.group.iterator.StudyGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup<E extends StudyGroupItem> implements Iterable<E> {
    private List<E> studentList;

    public StudentGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E student) {
        studentList.add(student);
    }

    @Override
    public Iterator<E> iterator() {
        return new StudyGroupIterator<>(studentList);
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName<>());
    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge<>());
    }
}

