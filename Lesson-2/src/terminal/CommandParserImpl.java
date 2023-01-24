package terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParserImpl implements CommandParser {

    @Override
    public Command parseCommand(String inputCommand) {
        List<String> arguments = new ArrayList<>(Arrays.asList(inputCommand.split(" ")));
        String mainCommand = arguments.get(0);
        arguments.remove(0);
        Command command = new Command(arguments, mainCommand);
        return command;
    }

}
