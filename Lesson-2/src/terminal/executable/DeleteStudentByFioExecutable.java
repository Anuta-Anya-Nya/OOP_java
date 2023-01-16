package terminal.executable;

import data.Student;
import service.user.StudentService;

public class DeleteStudentByFioExecutable implements CommandExecutable {
    private StudentService studentService;
    private String studentFio;

    public DeleteStudentByFioExecutable(StudentService studentService, String fio) {
        this.studentService = studentService;
        this.studentFio = fio;
    }

    @Override
    public void execute() {
        Student student = studentService.findByFio(studentFio);
        if (student == null) {
            System.out.println("Студента c такими ФИО не найдено");
        } else {
            studentService.DeleteStudent(student);
            System.out.println("Студент c такими ФИО удален");
        }
    }
}
