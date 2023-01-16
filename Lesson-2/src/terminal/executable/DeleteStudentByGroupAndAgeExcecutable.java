package terminal.executable;

import data.Student;
import service.user.StudentService;

public class DeleteStudentByGroupAndAgeExcecutable implements CommandExecutable {
    private StudentService studentService;
    private int groupNumber;
    private int studentYearOfBirth;

    public DeleteStudentByGroupAndAgeExcecutable(StudentService studentService, int group, int birth) {
        this.studentService = studentService;
        this.groupNumber = group;
        this.studentYearOfBirth = birth;
    }

    @Override
    public void execute() {
        Student student = studentService.findStudentByBirth(studentYearOfBirth);
        if (student == null) {
            System.out.println("Студента c такими данными не найдено");
        } else if (student.getNumberGroup() == groupNumber) {
            studentService.DeleteStudent(student);
            System.out.println("Студент удален");
        } else {
            System.out.println("Студента c такими данными не найдено");
        }
    }

}
