package view;

import java.util.List;

import data.Student;

public interface MessageResult {
    void successfulAction();
    void failedAction();
    void printTable(List<Student> list);
    void startMenu();
    void failedCommand();
}
