package data;

import java.util.List;

public class StudentGroup {
    
    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;
    public StudentGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }
    public int getGroupNumber() {
        return groupNumber;
    }
    public StudentGroup() {
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    
    
    
}
