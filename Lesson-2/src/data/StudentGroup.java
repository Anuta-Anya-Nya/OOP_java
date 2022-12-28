package data;

import java.util.Iterator;
import java.util.List;

import data.iterators.StudentGroupIterator;

public class StudentGroup implements Iterable<Student> {

    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;

    public StudentGroup(List<Student> studentList, int groupNumber) {
        this.studentList = studentList;
        this.groupNumber = groupNumber;
    }

    public StudentGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public Iterator<Student> iterator() { // возвращает экземпляр созданного итератора
        return new StudentGroupIterator(this); // создаем новый экземпляр класса StudentGroupIterator и передаем ему на
                                               // вход экземпляр класса StudentGroup (т.к. мы в нем находимся, передаем
                                               // this т.е.самого себя)
    } // теперь можно итерироваться по участникам группы

    public int getGroupNumber() {
        return groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

}
