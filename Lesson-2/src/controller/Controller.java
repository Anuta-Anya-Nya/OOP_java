package controller;
public interface Controller<U, I>{
    U create(U entity);
    void save(U entity);
    U findById(I id);
}
// import java.util.List;

// import data.GroupStream;
// import data.Student;
// import data.StudentGroup;
// import data.Teacher;
// import data.User;
// import service.group.GroupService;
// import service.group.GroupServiceImpl;
// import service.group.StreamService;
// import service.user.DataService;


// public class Controller {
//     private final DataService<User> dataService;
//     private final GroupService dataServiceGroup;
//     private final GroupServiceImpl studentGroupServiceImpl;
//     private final StreamService dataServiceStream;

//     public Controller(DataService<User> dataService, GroupService dataServiceGroup, GroupServiceImpl studentGroupServiceImpl,
//             StreamService dataServiceStream) {
//         this.dataService = dataService;
//         this.dataServiceGroup = dataServiceGroup;
//         this.studentGroupServiceImpl = studentGroupServiceImpl;
//         this.dataServiceStream = dataServiceStream;
//     }

//     public Student createStudent(Student student){
//         dataService.create(student);
//         return (Student) dataService.read(student);
//     }
//     public Teacher createTeacher(Teacher teacher){
//         dataService.create(teacher);
//         return (Teacher) dataService.read(teacher);
//     }
//     public StudentGroup createGroup(int groupNumber){
//         dataServiceGroup.createGroup(groupNumber);
//         return dataServiceGroup.readGroup(groupNumber);
//     }
//     public void removeStudent(String fio) {
//         studentGroupServiceImpl.removeStudent(fio);
//     }
//     public void sortStudent(StudentGroup studentGroup) {
//         studentGroupServiceImpl.sortStudent(studentGroup);
//     }
//     public void sortStream(List<GroupStream> streams){
//         dataServiceStream.sortStream(streams);
//     }
// }
