package repository;

import data.Student;
import db.StudentTable;
import terminal.MessageLog;
import terminal.MessageLogExecutable;

public class StudentRepository implements UserRepository<Student, Integer> {
    private StudentTable studentTable;
    private MessageLog messageLogExecutary;

    public StudentRepository() {
        this.studentTable = new StudentTable();
        this.messageLogExecutary = new MessageLogExecutable();
    }
    
    @Override
    public Student save(Student entity) {
        studentTable.save(entity);
        messageLogExecutary.printTable(studentTable.getElements());
        return entity;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }

    @Override
    public Student delete(Student entity) {
        return null;
    }

    @Override
    public Student findByBirth(Integer birthday) {
        return null;
    }

    @Override
    public void removeByName(String fio) {
        studentTable.removeByName(fio);
        messageLogExecutary.printTable(studentTable.getElements());
    }

}
