package terminal.executable;

import data.comparators.StudentComparable;
import service.user.StudentService;

public class DeleteStudentExecutable implements CommandExecutable {
    private StudentService studentService;
    private final StudentComparable student;

    public DeleteStudentExecutable(StudentService studentService, StudentComparable student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.DeleteUser(student);
        System.out.println("Студент удален");
    }

}
