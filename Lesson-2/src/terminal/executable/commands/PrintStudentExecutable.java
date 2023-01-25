package terminal.executable.commands;

import data.Student;
import service.user.DataService;

public class PrintStudentExecutable implements CommandExecutable{
    private DataService<Student> studentService;
    
    public PrintStudentExecutable(DataService<Student> studentService) {
        this.studentService = studentService;
    }

    @Override
    public boolean execute() {
        studentService.printList();
        return true;
    }
    
}
