package service.user;

import java.util.Collections;
import java.util.List;

import data.Teacher;
import data.comparators.UserComparator;
import repository.UserRepository;

public class TeacherService implements DataService<Teacher> {
    private final UserRepository<Teacher, Integer> teacherRepository;

    public TeacherService(UserRepository<Teacher, Integer> teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(Teacher user) {
        teacherRepository.save(user);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacherRepository.findByFio(fio);
    }

    @Override
    public void sortUsers(List<Teacher> users) {
        this.sortUsersByName(users);
    }

    @Override
    public void sortUsersByName(List<Teacher> users) {
        Collections.sort(users, new UserComparator());
    }

    @Override
    public Teacher findByBirth(int birth) {
        return teacherRepository.findByBirth(birth);
    }

    @Override
    public void DeleteUser(Teacher user) {
        teacherRepository.delete(user);
    }

    public UserRepository<Teacher, Integer> getTeacherRepository() {
        return teacherRepository;
    }

}
