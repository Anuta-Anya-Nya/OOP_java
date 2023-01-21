package data.iterators;

import java.util.Iterator;
import java.util.List;

import data.StudentGroup;
import data.comparators.StudentComparable;

public class StudentGroupIterable extends StudentGroup implements Iterable<StudentComparable>{

    public StudentGroupIterable(List<StudentComparable> studentList, int groupNumber) {
        super(studentList, groupNumber);
    }

    @Override
    public Iterator<StudentComparable> iterator() {// возвращает экземпляр созданного итератора
        return new StudentGroupIterator(this); // создаем новый экземпляр класса StudentGroupIterator и передаем ему на
        // вход экземпляр класса StudentGroup (т.к. мы в нем находимся, передаем
        // this т.е.самого себя)
    }        // теперь можно итерироваться по участникам группы
    
    
}
