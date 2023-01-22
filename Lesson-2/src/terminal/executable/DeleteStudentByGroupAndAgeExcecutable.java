package terminal.executable;

import data.Student;
import service.user.DataService;
import terminal.MessageLog;

public class DeleteStudentByGroupAndAgeExcecutable implements CommandExecutable {
    private DataService<Student> studentService;
    private int groupNumber;
    private int studentYearOfBirth;
    private Student student;
    private MessageLog messageLogExecutary;

    public DeleteStudentByGroupAndAgeExcecutable(DataService<Student> studentService, int group, int birth) {
        this.studentService = studentService;
        this.groupNumber = group;
        this.studentYearOfBirth = birth;
    }

    @Override
    public void execute() {
        student = studentService.findByBirth(studentYearOfBirth);
        if (student.getNumberGroup() == groupNumber) {
            studentService.DeleteUser(student);
            messageLogExecutary.successfulAction();
        } else {
            messageLogExecutary.failedAction();
        }
    }

}
