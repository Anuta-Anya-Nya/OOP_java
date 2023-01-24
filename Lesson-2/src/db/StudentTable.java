package db;

import data.Student;

public class StudentTable extends Table<Student> {

    public boolean removeByName(String name) {
        for (Student student : elements) {
            if(student.getFio().equals(name)){
                elements.remove(student);
                return true;
            }
        }
        return false;
    }
}
