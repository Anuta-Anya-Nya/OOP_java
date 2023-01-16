package data;

public abstract class User {
    private String fio;
    private int birthday;
    private int numberPass;
    
    public User(String fio) {
        this.fio = fio;
    }
    public User(String fio, int birth, int numberPass) {
        this.fio = fio;
        this.birthday = birth;
        this.numberPass = numberPass;
    }
    public User(){

    }
    @Override
    public String toString() {
        return "Student{ fio: "+fio+" }";
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
