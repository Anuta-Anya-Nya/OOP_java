package terminal.parser;

import terminal.Command;

public interface CommandParser {
    Command parseCommand(String inputCommand);
}
