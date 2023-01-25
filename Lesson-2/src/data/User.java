package data;

public abstract class User {
    
    // объекты студет, учитель и т.д., которые держат состояние, чтобы передать его в базу
    protected String fio;
    protected int birthday;
    private int numberPass;

    public User(String fio) {
        this.fio = fio;
    }
    
    public User(String fio, int birthday) {
        this.fio = fio;
        this.birthday = birthday;
    }

    public User(String fio, int birth, int numberPass) {
        this.fio = fio;
        this.birthday = birth;
        this.numberPass = numberPass;
    }

    @Override
    public String toString() {
        return "Student { fio: " + fio + " }";
    }

    public String getFio() {
        return fio;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getNumberPass() {
        return numberPass;
    }
}
