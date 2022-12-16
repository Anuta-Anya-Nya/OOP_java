public class Drink extends Product {
    private double volume;
    public Drink(String name, double price, double volume) {
        this.volume = volume;
        // super(name, price);
        super.name = name;
        super.price = price;
    }
    public double getVolume() {
        return volume;
    }
}
