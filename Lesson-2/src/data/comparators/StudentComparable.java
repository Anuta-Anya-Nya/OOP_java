package data.comparators;

import data.Student;

public class StudentComparable extends Student implements Comparable<Student> {
    
    public StudentComparable(String fio) {
        super(fio);
    }

    public StudentComparable(String fio, int birth, int numberPass, int numberGroup) {
        super(fio, birth, numberPass, numberGroup);
    }

    @Override
    public int compareTo(Student o) {
        if (this.getBirthday() > o.getBirthday())
            return 1;
        if (this.getBirthday() < o.getBirthday())
            return -1;
        return 0;
    }

}
