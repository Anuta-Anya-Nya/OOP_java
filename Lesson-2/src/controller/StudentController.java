package controller;

import data.Student;
import service.user.StudentService;

public class StudentController implements UserController<Student, Integer>{
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(Student item) {
         studentService.create(item);
                
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByFio(String fio) {
        return studentService.findByFio(fio);
    }

    @Override
    public void save(Student entity) {
        studentService.create(entity);
    }

    
    
    
}
