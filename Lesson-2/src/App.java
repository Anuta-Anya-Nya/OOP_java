import repository.StudentRepository;
import service.user.StudentService;
import terminal.CommandParser;
import terminal.CommandParserImpl;
import terminal.MessageLog;
import terminal.MessageLogExecutable;
import terminal.TerminalReader;
import terminal.executable.CommandExecutableFactory;
import terminal.executable.CommandExecutableFactoryImpl;

public class App {
    public static void main(String[] args){
        MessageLog messageLogExecutary = new MessageLogExecutable();
        StudentRepository studentRepository = new StudentRepository();
        StudentService service = new StudentService(studentRepository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();

        messageLogExecutary.startMenu();
        TerminalReader.getInstance(parser, factory, messageLogExecutary).listenerCommand();
    }
}
