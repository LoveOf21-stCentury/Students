package study_group.model.group.comparators;

import study_group.model.group.StudyGroupItem;

import java.util.Comparator;

public class StudentComparatorByAge<T extends StudyGroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        // TODO: 10/11/2023 different comparator
        return o2.getAge() - o1.getAge();
    }
}
