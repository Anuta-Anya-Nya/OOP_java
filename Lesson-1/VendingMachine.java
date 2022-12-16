import java.util.List;

public class VendingMachine {
    
    public static void initProducts(List <Product> list) {
        // Product prod=list.get(0);
        Product product1 = new Product("Шоколад", 150);
        Product product2 = new Drink("Cola", 100, 200);
        System.out.println(product1);
        System.out.println(product2);
    }
    public static void getProduct(String name) {
        
    }
    public void restore() {
        System.out.println("Продукт употреблен");
    }
}
