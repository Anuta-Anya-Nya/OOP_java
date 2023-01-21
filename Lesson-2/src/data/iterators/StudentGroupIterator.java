package data.iterators;

import java.util.Iterator;

import data.StudentGroup;
import data.comparators.StudentComparable;


public class StudentGroupIterator implements Iterator<StudentComparable> {
    private StudentGroup studentGroup;
    private Iterator<StudentComparable> students;
    // private List<Student> students;
    // private int cursor; //равен 0 при инициализации


    public StudentGroupIterator(StudentGroupIterable studentGroupIterable) {
    }

    @Override
    public boolean hasNext() {
        // return cursor<students.size();
        return this.students.hasNext();
    }

    @Override
    public StudentComparable next() {
        // return students.get(cursor++);
        return this.students.next();
    }
    public void remove(){
        // this.students.remove(cursor);
        this.students.remove();
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }   
}
