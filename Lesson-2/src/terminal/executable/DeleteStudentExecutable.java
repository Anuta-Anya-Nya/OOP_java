package terminal.executable;

import service.user.StudentService;

public class DeleteStudentExecutable implements CommandExecutable{
    private StudentService studentService;

    public DeleteStudentExecutable(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @Override
    public void execute() {
        studentService.DeleteStudent();
    }
    
}
