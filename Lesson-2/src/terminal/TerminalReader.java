package terminal;

import java.util.Scanner;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;
import view.MessageResult;

public class TerminalReader {
    // private final static Scanner sc = new Scanner(System.in);
    // TerminalReader это синглтон. конструктор закрыт, getInstance - фабричный метод, есть статическую переменная, которая содержит единый экземпляр
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;
    private final MessageResult messageResultImpl;

    public static TerminalReader getInstance(CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory, MessageResult messageResultImpl) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory, messageResultImpl);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory, MessageResult messageResultImpl) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
        this.messageResultImpl = messageResultImpl;
    }

    public void listenerCommand() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.nextLine();
            Command comList = commandParser.parseCommand(command);
            CommandExecutable commandExecutable = commandExecutableFactory.create(comList);
            if(commandExecutable == null){
                messageResultImpl.failedCommand();
            } else {
                if(commandExecutable.execute()){
                    messageResultImpl.successfulAction();
                } else {
                    messageResultImpl.failedAction();
                }   
            }
            
        }
    }
}
