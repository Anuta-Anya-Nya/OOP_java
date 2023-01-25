package terminal.executable.factories;

import data.Student;
import service.user.DataService;
import terminal.Command;
import terminal.executable.commands.CommandExecutable;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(DataService<Student> studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        return result;
    }
}
