package terminal;

import data.Student;
import service.user.StudentService;
import terminal.executable.CommandExecutable;
import terminal.executable.CreateStudentExecutable;
import terminal.executable.DeleteStudentExecutable;

public class CommandExecutableFactory {
    StudentService studentService;
    
    public CommandExecutableFactory() {
    }
    public CommandExecutable create(String[] input) {
        if(input[0].equals("add")){
            Student student = new Student(input[1]);
            CreateStudentExecutable createStudentExecutable = new CreateStudentExecutable(studentService, student);
            return createStudentExecutable;
        } else {            
            return new DeleteStudentExecutable(studentService);
        }
    }
}
