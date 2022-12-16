public class HotDrink extends Drink{
    private int temp;
    public HotDrink(String name, double price, int volume, int temp){
        super(name, price, volume);
        this.temp = temp;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
}
