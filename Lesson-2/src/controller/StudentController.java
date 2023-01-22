package controller;

import data.Student;
import service.user.DataService;

public class StudentController implements UserController<Student, Integer>{
    private final DataService<Student> studentService;

    public StudentController(DataService<Student> studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(Student entity) {
        studentService.create(entity);
    }

    @Override
    public void save(Student entity) {
        studentService.create(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByFio(String fio) {
        return studentService.findByFio(fio);
    }

}
