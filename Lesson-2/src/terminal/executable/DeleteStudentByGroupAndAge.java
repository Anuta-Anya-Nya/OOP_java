package terminal.executable;

import data.Student;
import service.user.StudentService;

public class DeleteStudentByGroupAndAge implements CommandExecutable {
    private StudentService studentService;
    private int group;
    private int birth;

    public DeleteStudentByGroupAndAge(StudentService studentService, int group, int birth) {
        this.studentService = studentService;
        this.group = group;
        this.birth = birth;
    }

    @Override
    public void execute() {
        Student student = studentService.findStudentByBirth(birth);
        if (student == null) {
            System.out.println("Студента c такими данными не найдено");
        } else if (student.getNumberGroup() == group) {
            studentService.DeleteStudent(student);
            System.out.println("Студент удален");
        } else {
            System.out.println("Студента c такими данными не найдено");
        }
    }

}
