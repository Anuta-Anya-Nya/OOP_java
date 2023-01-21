package terminal.executable;

import data.comparators.StudentComparable;
import service.user.StudentService;

public class CreateStudentExecutable implements CommandExecutable {
    private final StudentService studentService;
    private final StudentComparable student;

    public CreateStudentExecutable(StudentService studentService, StudentComparable student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.create(student);
    }

}
