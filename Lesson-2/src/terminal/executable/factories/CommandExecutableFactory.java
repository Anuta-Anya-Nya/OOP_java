package terminal.executable.factories;

import terminal.Command;
import terminal.executable.commands.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command input);
}
