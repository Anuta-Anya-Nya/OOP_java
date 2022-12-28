package controller;

import data.Teacher;
import service.user.TeacherService;

public class TeacherController implements UserController<Teacher, Integer> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher create(Teacher item) {
        teacherService.create(item);
        return (Teacher) teacherService.read(item);
        
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findTeacherById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacherService.findTeacherByFio(fio);
    }

    @Override
    public void save(Teacher entity) {
        teacherService.saveTeacher(entity);
    }
    
}
