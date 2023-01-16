package terminal.executable;

import data.Student;
import service.user.StudentService;

public class DeleteStudentExecutable implements CommandExecutable {
    private StudentService studentService;
    private final Student student;

    public DeleteStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.DeleteStudent(student);
        System.out.println("Студент удален");
    }

}
