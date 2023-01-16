package data;

public abstract class User {
    private String fio;
    private int age;
    private int numberPass;
    
    public User(String fio) {
        this.fio = fio;
    }
    public User(String fio, int age, int numberPass) {
        this.fio = fio;
        this.age = age;
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
    public int getAge() {
            return age;
        }
    public int getNumberPass() {
    return numberPass;
    }
}
