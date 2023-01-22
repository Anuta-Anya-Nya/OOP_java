package terminal.executable;

import data.Student;
import service.user.DataService;
import terminal.MessageLog;

public class DeleteStudentByFioExecutable implements CommandExecutable {
    private DataService<Student> studentService;
    private String studentFio;
    private Student student;
    private MessageLog messageLogExecutary;

    public DeleteStudentByFioExecutable(DataService<Student> studentService, String fio) {
        this.studentService = studentService;
        this.studentFio = fio;
    }

    @Override
    public void execute() {
        student = studentService.findByFio(studentFio);
        if (student == null) {
            messageLogExecutary.failedAction();
        } else {
            studentService.DeleteUser(student);
            messageLogExecutary.successfulAction();
        }
    }
}
