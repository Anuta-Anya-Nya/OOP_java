package service.user;

import java.util.Collections;
import java.util.List;

import data.Student;
import data.comparators.UserComparator;
import repository.StudentRepository;

public class StudentService implements DataService<Student> {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student findStudentByBirth(int birth) {
        return studentRepository.findByBirth(birth);
    }

    public void DeleteStudent(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public void sortUsers(List<Student> users) {
        Collections.sort(users);
    }

    @Override
    public void sortUsersByName(List<Student> users) {
        Collections.sort(users, new UserComparator());

    }

    @Override
    public Student findByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

}
