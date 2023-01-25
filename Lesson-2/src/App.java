import repository.StudentRepository;
import service.user.StudentService;
import terminal.TerminalReader;
import terminal.executable.factories.CommandExecutableFactory;
import terminal.executable.factories.CommandExecutableFactoryImpl;
import terminal.parser.CommandParser;
import terminal.parser.CommandParserImpl;
import view.MessageResult;
import view.MessageResultImpl;

public class App {
    public static void main(String[] args){
        MessageResult messageResultImpl = new MessageResultImpl();
        StudentRepository studentRepository = new StudentRepository();
        StudentService service = new StudentService(studentRepository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();

        messageResultImpl.startMenu();
        TerminalReader.getInstance(parser, factory, messageResultImpl).listenerCommand();
    }
}
