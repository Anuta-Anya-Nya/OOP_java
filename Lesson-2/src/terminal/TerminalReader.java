package terminal;

import java.util.Scanner;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

public class TerminalReader {
    // private final static Scanner sc = new Scanner(System.in);
    // TerminalReader это синглтон. конструктор закрыт, getInstance - фабричный метод, есть статическую переменная, которая содержит единый экземпляр
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public void listenerCommand() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.nextLine();
            Command comList = commandParser.parseCommand(command);
            CommandExecutable commandExecutable = commandExecutableFactory.create(comList);
            commandExecutable.execute();
        }
    }
}
