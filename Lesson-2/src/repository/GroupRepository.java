package repository;

import data.StudentGroup;

public class GroupRepository implements Repository<StudentGroup, Integer>{

    @Override
    public StudentGroup save(StudentGroup entity) {
        return entity;
    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }

    @Override
    public StudentGroup delete(StudentGroup entity) {
        return null;
    }

    public void removeStudent(String fio) {
    }



}
