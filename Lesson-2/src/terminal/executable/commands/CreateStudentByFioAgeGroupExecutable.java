package terminal.executable.commands;

import java.util.List;

import data.Student;
import service.user.DataService;

public class CreateStudentByFioAgeGroupExecutable implements CommandExecutable{

    private final DataService<Student> studentService;
    private String studentFio;
    private int studentYearOfBirth;
    private int groupNumber;
    private Student student;
    

    public CreateStudentByFioAgeGroupExecutable(DataService<Student> studentService, List<String> arguments) {
        this.studentService = studentService;
        this.studentFio = arguments.get(0);
        this.studentYearOfBirth = Integer.parseInt(arguments.get(1));
        this.groupNumber = Integer.parseInt(arguments.get(2));
    }

    @Override
    public boolean execute() {
        student = new Student(studentFio, studentYearOfBirth, groupNumber);
        studentService.create(student);
        return true;
    }
    
}
