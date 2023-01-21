package data;

public class Student extends User {
    private int numberGroup;

    public Student(String fio) {
        super(fio);
    }

    public Student(String fio, int birth, int numberPass, int numberGroup) {
        super(fio, birth, numberPass);
        this.numberGroup = numberGroup;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

}
