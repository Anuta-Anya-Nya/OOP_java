package terminal.executable.commands;

import data.Student;
import service.user.DataService;

public class CreateStudentExecutable implements CommandExecutable {
    private final DataService<Student> studentService;
    private final Student student;
    

    public CreateStudentExecutable(DataService<Student> studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public boolean execute() {
        studentService.create(student);
        return true;
    }

}
