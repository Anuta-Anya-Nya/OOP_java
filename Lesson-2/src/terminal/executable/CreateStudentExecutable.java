package terminal.executable;

import data.comparators.StudentComparable;
import service.user.DataService;

public class CreateStudentExecutable implements CommandExecutable {
    private final DataService<StudentComparable> studentService;
    private final StudentComparable student;

    public CreateStudentExecutable(DataService<StudentComparable> studentService, StudentComparable student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.create(student);
    }

}
