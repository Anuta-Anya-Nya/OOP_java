package service.user;

import data.Teacher;
import data.comparators.UserComparator;
import repository.TeacherRepository;

import java.util.Collections;
import java.util.List;

public class TeacherService implements DataService<Teacher> {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createUser(Teacher user) {
        return teacherRepository.save(user);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return teacherRepository.findByLastName(lastName);
    }

    @Override
    public void sortUsers(List<Teacher> users) {
        this.sortUsersByName(users);
    }

    @Override
    public void sortUsersByName(List<Teacher> users) {
        Collections.sort(users, new UserComparator());
    }
}
    

