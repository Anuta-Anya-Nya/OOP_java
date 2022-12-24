package controller;

import java.util.List;

import data.GroupStream;
import data.Student;
import data.StudentGroup;
import data.Teacher;
import service.DataService;
import service.DataServiceGroup;
import service.DataServiceStream;
import service.GroupStreamServiceImpl;
import service.StudentGroupServiceImpl;


public class Controller {
    private DataService dataService;
    private DataServiceGroup dataServiceGroup;
    private StudentGroupServiceImpl studentGroupServiceImpl;
    private DataServiceStream dataServiceStream;

    public Controller(StudentGroupServiceImpl studentGroupServiceImpl) {
        this.studentGroupServiceImpl = studentGroupServiceImpl;
    }

    public Controller(DataService dataService) {
        this.dataService = dataService;
    }
    
    public Controller() {
    }
    public Student createStudent(Student student){
        dataService.create(student);
        return (Student) dataService.read(student);
    }
    public Teacher createTeacher(Teacher teacher){
        dataService.create(teacher);
        return (Teacher) dataService.read(teacher);
    }
    public StudentGroup createGroup(int groupNumber){
        dataServiceGroup.createGroup(groupNumber);
        return dataServiceGroup.readGroup(groupNumber);
    }
    public void removeStudent(String fio) {
        studentGroupServiceImpl.removeStudent(fio);
    }
    public void sortStudent(StudentGroup studentGroup) {
        studentGroupServiceImpl.sortStudent(studentGroup);
    }
    public void sortStream(List<GroupStream> streams){
        dataServiceStream.sortStream(streams);;
    }
}
