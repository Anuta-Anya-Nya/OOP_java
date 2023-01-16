package data;

public class Student extends User implements Comparable<Student> {
    private int numberGroup;
    
    public Student(String fio) {
        super(fio);
    }

    public Student(String fio, int birth, int numberPass, int numberGroup) {
        super(fio, birth, numberPass);
        this.numberGroup = numberGroup;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getBirthday() > student.getBirthday())
            return 1;
        if (this.getBirthday() < student.getBirthday())
            return -1;
        return 0;
    }
    
    public int getNumberGroup() {
        return numberGroup;
    }

}
