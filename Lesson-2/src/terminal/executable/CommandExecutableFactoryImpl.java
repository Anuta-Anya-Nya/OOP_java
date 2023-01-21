package terminal.executable;

import data.comparators.StudentComparable;
import service.user.StudentService;
import terminal.Command;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private StudentService studentService;

    @Override
    public CommandExecutable create(Command input) {
            if(input.isCreateCommand()){
                return new CreateStudentExecutable(studentService, new StudentComparable(input.getFirstArgument()));
            } else if (input.isDeleteCommand()){
                return new DeleteStudentExecutable(studentService, new StudentComparable(input.getFirstArgument()));
            }
            return null;
            
            // switch (command) {
            //     case "add":
            //         return new CreateStudentExecutable(studentService, new Student(fioOrGroupNumber));
            //     case "dell":
            //         return new DeleteStudentExecutable(studentService, new Student(fioOrGroupNumber));
            //     case "dellByFio":
            //         return new DeleteStudentByFioExecutable(studentService, fioOrGroupNumber);
            //     case "dellByGroupNumberAndAge":
            //         return new DeleteStudentByGroupAndAgeExcecutable(studentService, Integer.parseInt(fioOrGroupNumber),
            //                 Integer.parseInt(studentYearOfBirth));
            //     default:
            //         return null;
    }
}

    // public CommandExecutableFactory(StudentService studentService) {
    // this.studentService = studentService;
    // }

    

