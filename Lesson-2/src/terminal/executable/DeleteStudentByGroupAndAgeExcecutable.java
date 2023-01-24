package terminal.executable;

import data.Student;
import service.user.DataService;

public class DeleteStudentByGroupAndAgeExcecutable implements CommandExecutable {
    private DataService<Student> studentService;
    private int groupNumber;
    private int studentYearOfBirth;
    private Student student;

    public DeleteStudentByGroupAndAgeExcecutable(DataService<Student> studentService, int group, int birth) {
        this.studentService = studentService;
        this.groupNumber = group;
        this.studentYearOfBirth = birth;
    }

    @Override
    public boolean execute() {
        student = studentService.findByBirth(studentYearOfBirth);
        if (student.getNumberGroup() == groupNumber) {
            studentService.DeleteUser(student);
            return true;
        } else {
            return false;
        }
    }

}
