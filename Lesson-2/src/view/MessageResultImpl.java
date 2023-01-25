package view;

import java.util.List;

import data.Student;

public class MessageResultImpl implements MessageResult{
    private static final String HELLO_MES = "Введите команду и данные пользователя, например: \n/add Ivanov \n/addByFioAgeGroup Ivanov YearOfBirth NumberOfGroup \n/delete Ivanov \n/deleteByGroupAndAge NumberOfGroup YearOfBirth\n/print \n";
    private static final String SUCCESS_MES = "Команда успешно выполнена!";
    private static final String FAILED_MES = "Команда не выполнена!";
    private static final String FAILED_COM = "Введена неверная команда!";

    @Override
    public void successfulAction() {
        System.out.println(SUCCESS_MES);
    }

    @Override
    public void failedAction() {
        System.out.println(FAILED_MES);
    }

    @Override
    public void printTable(List<Student> users) {
        for (Student student : users) {
            System.out.println(student);
        }
    }

    @Override
    public void startMenu() {
        System.out.println(HELLO_MES);
    }

    @Override
    public void failedCommand() {
        System.out.println(FAILED_COM);
    }

    
}
