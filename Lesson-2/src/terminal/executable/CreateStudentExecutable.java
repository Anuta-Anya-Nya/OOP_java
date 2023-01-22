package terminal.executable;

import data.Student;
import service.user.DataService;
import terminal.MessageLog;

public class CreateStudentExecutable implements CommandExecutable {
    private final DataService<Student> studentService;
    private final Student student;
    private MessageLog messageLogExecutary;

    public CreateStudentExecutable(DataService<Student> studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.create(student);
        messageLogExecutary.successfulAction();
    }

}
