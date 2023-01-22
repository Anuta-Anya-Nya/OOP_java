package terminal.executable;

import data.Student;
import service.user.DataService;
import terminal.MessageLog;

public class DeleteStudentExecutable implements CommandExecutable {
    private DataService<Student> studentService;
    private final Student student;
    private MessageLog messageLogExecutary;

    public DeleteStudentExecutable(DataService<Student> studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.DeleteUser(student);
        messageLogExecutary.successfulAction();
    }

}
