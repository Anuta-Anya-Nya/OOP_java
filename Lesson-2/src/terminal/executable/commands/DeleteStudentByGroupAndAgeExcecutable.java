package terminal.executable.commands;

import java.util.List;

import data.Student;
import service.user.DataService;

public class DeleteStudentByGroupAndAgeExcecutable implements CommandExecutable {
    private DataService<Student> studentService;
    private int groupNumber;
    private int studentYearOfBirth;
    private Student student;

    public DeleteStudentByGroupAndAgeExcecutable(DataService<Student> studentService, List<String> arguments) {
        this.studentService = studentService;
        this.groupNumber = Integer.parseInt(arguments.get(0));
        this.studentYearOfBirth = Integer.parseInt(arguments.get(1));
    }

    @Override
    public boolean execute() {
        student = studentService.findByBirth(studentYearOfBirth);
        if(student == null){
            return false;
        }
        if (student.getNumberGroup() == groupNumber) {
            studentService.DeleteUser(student);
            return true;
        } else {
            return false;
        }
    }

}
