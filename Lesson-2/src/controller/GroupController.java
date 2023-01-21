package controller;

import data.iterators.StudentGroupIterable;
import service.group.GroupService;

public class GroupController implements Controller<StudentGroupIterable, Integer> {
    private final GroupService<StudentGroupIterable, Integer> groupServiceImpl;

    public GroupController(GroupService<StudentGroupIterable, Integer> groupServiceImpl) {
        this.groupServiceImpl = groupServiceImpl;
    }

    @Override
    public void create(StudentGroupIterable entity) {
        int groupNumber = entity.getGroupNumber();
        groupServiceImpl.createGroup(groupNumber);
        
    }

    @Override
    public void save(StudentGroupIterable entity) {
        groupServiceImpl.saveGroup(entity);
    }

    @Override
    public StudentGroupIterable findById(Integer id) {
        return groupServiceImpl.findGroup(id);
    }

    public void removeStudent(String fio) {
        groupServiceImpl.removeStudent(fio);
    }

    public void sortStudent(StudentGroupIterable studentGroup) {
        groupServiceImpl.sortStudent(studentGroup);
    }

}
