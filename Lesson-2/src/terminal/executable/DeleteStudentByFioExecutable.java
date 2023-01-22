package terminal.executable;

import data.comparators.StudentComparable;
import service.user.DataService;

public class DeleteStudentByFioExecutable implements CommandExecutable {
    private DataService<StudentComparable> studentService;
    private String studentFio;
    private StudentComparable student;

    public DeleteStudentByFioExecutable(DataService<StudentComparable> studentService, String fio) {
        this.studentService = studentService;
        this.studentFio = fio;
    }

    @Override
    public void execute() {
        student = studentService.findByFio(studentFio);
        if (student == null) {
            System.out.println("Студента c такими ФИО не найдено");
        } else {
            studentService.DeleteUser(student);
            System.out.println("Студент c такими ФИО удален");
        }
    }
}
