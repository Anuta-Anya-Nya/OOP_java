package controller;

import data.Student;
import service.user.StudentService;


public class StudentController implements UserController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student create(Student entity) {
        return studentService.createUser(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByLastName(String LastName) {
        return studentService.findByLastName(LastName);
    }
}