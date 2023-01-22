package terminal.executable;

import data.comparators.StudentComparable;
import service.user.DataService;
import terminal.Command;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(DataService<StudentComparable> studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        return result;
    }
}
