// package controller;

// import data.StudentGroup;
// import service.group.GroupServiceImpl;

// public class GroupController implements Controller<StudentGroup, Integer> {
//     private final GroupServiceImpl groupServiceImpl;

//     public GroupController(GroupServiceImpl groupServiceImpl) {
//         this.groupServiceImpl = groupServiceImpl;
//     }

//     @Override
//     public StudentGroup create(StudentGroup entity) {
//         int groupNumber = entity.getGroupNumber();
//         groupServiceImpl.createGroup(groupNumber);
//         return groupServiceImpl.readGroup(groupNumber);
//     }

//     @Override
//     public void save(StudentGroup entity) {
//         groupServiceImpl.saveGroup(entity);
//     }

//     @Override
//     public StudentGroup findById(Integer id) {
//         return groupServiceImpl.findGroup(id);
//     }

//     public void removeStudent(String fio) {
//         groupServiceImpl.removeStudent(fio);
//     }

//     public void sortStudent(StudentGroup studentGroup) {
//         groupServiceImpl.sortStudent(studentGroup);
//     }

// }
