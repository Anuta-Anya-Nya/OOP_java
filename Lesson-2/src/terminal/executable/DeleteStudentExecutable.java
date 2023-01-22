package terminal.executable;

import data.comparators.StudentComparable;
import service.user.DataService;

public class DeleteStudentExecutable implements CommandExecutable {
    private DataService<StudentComparable> studentService;
    private final StudentComparable student;

    public DeleteStudentExecutable(DataService<StudentComparable> studentService, StudentComparable student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.DeleteUser(student);
        System.out.println("Студент удален");
    }

}
