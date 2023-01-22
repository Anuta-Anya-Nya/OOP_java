package controller;

import data.StudentGroup;
import data.iterators.StudentGroupIterable;
import service.group.GroupService;

public class GroupController implements Controller<StudentGroup, Integer> {
    private final GroupService<StudentGroup, Integer> groupServiceImpl;

    public GroupController(GroupService<StudentGroup, Integer> groupServiceImpl) {
        this.groupServiceImpl = groupServiceImpl;
    }

    @Override
    public void create(StudentGroup entity) {
        int groupNumber = entity.getGroupNumber();
        groupServiceImpl.createGroup(groupNumber);
        
    }

    @Override
    public void save(StudentGroup entity) {
        groupServiceImpl.saveGroup(entity);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return groupServiceImpl.findGroup(id);
    }

    public void removeStudent(String fio) {
        groupServiceImpl.removeStudent(fio);
    }

    public void sortStudent(StudentGroupIterable studentGroup) {
        groupServiceImpl.sortStudent(studentGroup);
    }

}
