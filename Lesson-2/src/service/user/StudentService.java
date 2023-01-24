package service.user;

import java.util.Collections;
import java.util.List;

import data.Student;
import data.comparators.UserComparator;
import repository.UserRepository;

public class StudentService implements DataService<Student> {
    private final UserRepository<Student, Integer> studentRepository;

    public StudentService(UserRepository<Student, Integer> studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(Student user) {
        studentRepository.save(user);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    @Override
    public void sortUsers(List<Student> users) {
        this.sortUsersByName(users);
    }

    @Override
    public void sortUsersByName(List<Student> users) {
        Collections.sort(users, new UserComparator());
    }

    @Override
    public Student findByBirth(int birth) {
        return studentRepository.findByBirth(birth);
    }

    @Override
    public void DeleteUser(Student user) {
        studentRepository.removeByName(user.getFio());
    }

    public UserRepository<Student, Integer> getStudentRepository() {
        return studentRepository;
    }
    

}
