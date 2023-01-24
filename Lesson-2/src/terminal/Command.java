package terminal;

import java.util.List;

// инкапсулирует данные ввода
public class Command {
    private static final String ADD = "/add"; 
    private static final String DEL = "/delete";

    private List<String> arguments;
    private String mainCommand;

    public Command(List<String> arguments, String mainCommand) {
        this.arguments = arguments;
        this.mainCommand = mainCommand;
    }

    public String getFirstArgument(){
        return arguments.get(0);
    }
    
    public boolean isCreateCommand(){
        return (mainCommand.equals(ADD));
    }

    public boolean isDeleteCommand(){
        return (mainCommand.equals(DEL));
    }


        // String fioOrGroupNumber = input[1];
        // String studentYearOfBirth = input[2];

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
        // }

    
}
