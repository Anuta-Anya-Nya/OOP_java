package controller;

import data.Student;
import service.user.StudentService;

public class StudentController implements UserController<Student, Integer>{
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student create(Student item) {
        studentService.create(item);
        return (Student)studentService.read(item);        
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findStudentById(id);
    }

    @Override
    public Student findByFio(String fio) {
        return studentService.findStudentByFio(fio);
    }

    @Override
    public void save(Student entity) {
        studentService.saveStudent(entity);
    }

    
    
    
}
