package repository;

import data.comparators.StudentComparable;

public class StudentRepository implements UserRepository<StudentComparable, Integer> {

    @Override
    public StudentComparable save(StudentComparable entity) {
        return null;
    }

    @Override
    public StudentComparable findById(Integer id) {
        return null;
    }

    @Override
    public StudentComparable findByFio(String fio) {
        return null;
    }

    @Override
    public StudentComparable delete(StudentComparable entity) {
        return null;
    }

    @Override
    public StudentComparable findByBirth(Integer birthday) {
        return null;
    }

}
