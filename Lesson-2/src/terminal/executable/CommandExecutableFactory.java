package terminal.executable;

import data.Student;
import service.user.StudentService;

public class CommandExecutableFactory {
    private StudentService studentService;

    // public CommandExecutableFactory(StudentService studentService) {
    // this.studentService = studentService;
    // }

    public CommandExecutable create(String[] input) {
        String command = input[0];
        String fioOrGroupNumber = input[1];
        String studentYearOfBirth = input[2];

        switch (command) {
            case "add":
                return new CreateStudentExecutable(studentService, new Student(fioOrGroupNumber));
            case "dell":
                return new DeleteStudentExecutable(studentService, new Student(fioOrGroupNumber));
            case "dellByFio":
                return new DeleteStudentByFioExecutable(studentService, fioOrGroupNumber);
            case "dellByGroupNumberAndAge":
                return new DeleteStudentByGroupAndAgeExcecutable(studentService, Integer.parseInt(fioOrGroupNumber),
                        Integer.parseInt(studentYearOfBirth));
            default:
                return null;
        }

    }
}
