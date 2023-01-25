package data;

public class Student extends User {
    private int numberGroup;

    public Student(String fio) {
        super(fio);
    }

    public Student(String fio, int birthday, int numberGroup) {
        super(fio, birthday);
        this.numberGroup = numberGroup;
    }

    
    public Student(String fio, int birth, int numberPass, int numberGroup) {
        super(fio, birth, numberPass);
        this.numberGroup = numberGroup;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    @Override
    public String toString() {
        return "Student { fio: " + fio + ", yearOfBirth: " + birthday + ", group: " + numberGroup + " }";
    }
}
