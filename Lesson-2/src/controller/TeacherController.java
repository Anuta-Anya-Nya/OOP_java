package controller;

import data.Teacher;
import service.user.DataService;

public class TeacherController implements UserController<Teacher, Integer> {
    private final DataService<Teacher> teacherService;

    public TeacherController(DataService<Teacher> teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacherService.findByFio(fio);
    }

    @Override
    public void create(Teacher entity) {
        teacherService.create(entity);
    }

    @Override
    public void save(Teacher entity) {
        teacherService.create(entity);
    }

}
