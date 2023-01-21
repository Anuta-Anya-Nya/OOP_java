package controller;

import data.comparators.StudentComparable;
import service.user.DataService;

public class StudentController implements UserController<StudentComparable, Integer>{
    private final DataService<StudentComparable> studentService;

    public StudentController(DataService<StudentComparable> studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(StudentComparable entity) {
        studentService.create(entity);
    }

    @Override
    public void save(StudentComparable entity) {
        studentService.create(entity);
    }

    @Override
    public StudentComparable findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public StudentComparable findByFio(String fio) {
        return studentService.findByFio(fio);
    }

}
