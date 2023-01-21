package service.user;

import java.util.Collections;
import java.util.List;

import data.comparators.StudentComparable;
import data.comparators.UserComparator;
import repository.UserRepository;

public class StudentService implements DataService<StudentComparable> {
    private final UserRepository<StudentComparable, Integer> studentRepository;

    public StudentService(UserRepository<StudentComparable, Integer> studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(StudentComparable user) {
        studentRepository.save(user);
    }

    @Override
    public StudentComparable findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public StudentComparable findByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    @Override
    public void sortUsers(List<StudentComparable> users) {
        Collections.sort(users);
    }

    @Override
    public void sortUsersByName(List<StudentComparable> users) {
        Collections.sort(users, new UserComparator());
    }

    @Override
    public StudentComparable findByBirth(int birth) {
        return studentRepository.findByBirth(birth);
    }

    @Override
    public void DeleteUser(StudentComparable user) {
        studentRepository.delete(user);
    }

    public UserRepository<StudentComparable, Integer> getStudentRepository() {
        return studentRepository;
    }
    

}
