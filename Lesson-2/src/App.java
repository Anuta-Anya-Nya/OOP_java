import repository.StudentRepository;
import service.user.StudentService;
import terminal.CommandParser;
import terminal.CommandParserImpl;
import terminal.TerminalReader;
import terminal.executable.CommandExecutableFactory;
import terminal.executable.CommandExecutableFactoryImpl;
import view.MessageResult;
import view.MessageResultImpl;

public class App {
    public static void main(String[] args){
        MessageResult messageLogExecutary = new MessageResultImpl();
        StudentRepository studentRepository = new StudentRepository();
        StudentService service = new StudentService(studentRepository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();

        messageLogExecutary.startMenu();
        TerminalReader.getInstance(parser, factory, messageLogExecutary).listenerCommand();
    }
}
