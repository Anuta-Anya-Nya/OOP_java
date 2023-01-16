package terminal.executable;

import data.Student;
import service.user.StudentService;

public class DeleteStudentByFioExecutable implements CommandExecutable {
    private StudentService studentService;
    private String fio;

    public DeleteStudentByFioExecutable(StudentService studentService, String fio) {
        this.studentService = studentService;
        this.fio = fio;
    }

    @Override
    public void execute() {
        Student student = studentService.findStudentByFio(fio);
        if (student == null) {
            System.out.println("Студента c такими ФИО не найдено");
        } else {
            studentService.DeleteStudent(student);
            System.out.println("Студент c такими ФИО удален");
        }
    }
}
