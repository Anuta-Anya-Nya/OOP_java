package terminal.executable;

import terminal.Command;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl{
    

    
    public LogingCommandExecutableFactory() {
        super();
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result =  super.create(input);
        return result;
    }
}
