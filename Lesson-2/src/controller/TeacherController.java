package controller;

import data.Teacher;
import service.user.TeacherService;

public class TeacherController implements UserController<Teacher, Integer> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacherService.createUser(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return teacherService.findByLastName(lastName);
    }
}