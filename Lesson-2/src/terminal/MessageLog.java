package terminal;

import java.util.List;

import data.Student;

public interface MessageLog {
    void successfulAction();
    void failedAction();
    void printTable(List<Student> list);
    void startMenu();
}
