package terminal;

import java.util.Scanner;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

public class TerminalReader { 
    // private final static Scanner sc = new Scanner(System.in);
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void listenerCommand() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.nextLine();
            String[] comList = commandParser.parseCommand(command);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(comList);
            commandExecutable.execute();
        }
    }
}
