package terminal.executable;

import data.comparators.StudentComparable;
import service.user.DataService;

public class DeleteStudentByGroupAndAgeExcecutable implements CommandExecutable {
    private DataService<StudentComparable> studentService;
    private int groupNumber;
    private int studentYearOfBirth;
    private StudentComparable student;

    public DeleteStudentByGroupAndAgeExcecutable(DataService<StudentComparable> studentService, int group, int birth) {
        this.studentService = studentService;
        this.groupNumber = group;
        this.studentYearOfBirth = birth;
    }

    @Override
    public void execute() {
        student = studentService.findByBirth(studentYearOfBirth);
        if (student == null) {
            System.out.println("Студента c такими данными не найдено");
        } else if (student.getNumberGroup() == groupNumber) {
            studentService.DeleteUser(student);
            System.out.println("Студент удален");
        } else {
            System.out.println("Студента c такими данными не найдено");
        }
    }

}
