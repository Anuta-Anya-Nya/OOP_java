package data;

import java.util.List;

import data.comparators.StudentComparable;

public class StudentGroup {

    private Teacher teacher;
    private List<StudentComparable> studentList;
    private int groupNumber;

    public StudentGroup(List<StudentComparable> studentList, int groupNumber) {
        this.studentList = studentList;
        this.groupNumber = groupNumber;
    }

    public StudentGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<StudentComparable> getStudentList() {
        return studentList;
    }

}
