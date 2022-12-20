package data;

public class Student extends User{
    private int numberGroup;

    public int getNumberGroup() {
        return numberGroup;
    }

    public Student(String fio, int age, int numberPass, int numberGroup) {
        super(fio, age, numberPass);
        this.numberGroup = numberGroup;
    }
}
