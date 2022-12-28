package data.iterators;

import java.util.Iterator;

import data.Student;
import data.StudentGroup;


public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    private Iterator<Student> students;
    // private List<Student> students;
    // private int cursor; //равен 0 при инициализации


    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        // this.students = studentGroup.getStudentList();
        this.students = studentGroup.getStudentList().iterator();
    }

    @Override
    public boolean hasNext() {
        // return cursor<students.size();
        return this.students.hasNext();
    }

    @Override
    public Student next() {
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
