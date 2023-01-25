package terminal.executable.factories;

import data.Student;
import service.user.DataService;
import terminal.Command;
import terminal.executable.commands.CommandExecutable;
import terminal.executable.commands.CreateStudentByFioAgeGroupExecutable;
import terminal.executable.commands.CreateStudentExecutable;
import terminal.executable.commands.DeleteStudentByFioExecutable;
import terminal.executable.commands.DeleteStudentByGroupAndAgeExcecutable;
import terminal.executable.commands.PrintStudentExecutable;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private DataService<Student> studentService;

    public CommandExecutableFactoryImpl(DataService<Student> studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable create(Command input) {
            if(input.isCreateCommand()){
                return new CreateStudentExecutable(studentService, new Student(input.getFirstArgument()));
            } else if (input.isDeleteCommand()){
                return new DeleteStudentByFioExecutable(studentService, input.getFirstArgument());
            } else if (input.isPrintCommand()){
                return new PrintStudentExecutable(studentService);
            } else if (input.isDelByGroupAndAgeCommand()){
                return new DeleteStudentByGroupAndAgeExcecutable(studentService, input.getArguments());
            } else if (input.isAddByFioGroupAgeCommand()){
                return new CreateStudentByFioAgeGroupExecutable(studentService, input.getArguments());
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

    

