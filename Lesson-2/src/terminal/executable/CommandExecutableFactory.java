package terminal.executable;

import data.Student;
import service.user.StudentService;

public class CommandExecutableFactory {
    private StudentService studentService;

    public CommandExecutableFactory() {
    }

    public CommandExecutable create(String[] input) {
        if (input[0].equals("add")) {
            Student student = new Student(input[1]);
            CreateStudentExecutable createStudentExecutable = new CreateStudentExecutable(studentService, student);
            return createStudentExecutable;
        } else if (input[0].equals("dell")) {
            Student student = new Student(input[1]);
            return new DeleteStudentExecutable(studentService, student);
        } else if (input[0].equals("dellByFio")) {
            return new DeleteStudentByFioExecutable(studentService, input[1]);
        } else {
            return new DeleteStudentByGroupAndAge(studentService, Integer.parseInt(input[1]),
                    Integer.parseInt(input[2]));
        }
    }
}
