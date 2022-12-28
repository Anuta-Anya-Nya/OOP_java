package repository;

import data.StudentGroup;

public class GroupRepository implements Repository<StudentGroup, Integer>{

    @Override
    public StudentGroup save(StudentGroup entity) {
        // TODO Auto-generated method stub
        return entity;
    }

    @Override
    public StudentGroup findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }


}
