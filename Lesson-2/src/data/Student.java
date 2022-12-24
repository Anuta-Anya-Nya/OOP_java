package data;

public class Student extends User implements Comparable<Student> {
    private int numberGroup;

    public int getNumberGroup() {
        return numberGroup;
    }

    public Student(String fio, int age, int numberPass, int numberGroup) {
        super(fio, age, numberPass);
        this.numberGroup = numberGroup;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getAge() > student.getAge())
            return 1;
        if (this.getAge() < student.getAge())
            return -1;
        return 0;
    }

}
