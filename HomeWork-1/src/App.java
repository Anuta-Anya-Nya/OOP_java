import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Chips", 250));
        productList.add(new Product("Nuts", 100));
        productList.add(new Drink("Coca-cola", 120, 350));
        productList.add(new HotDrink("Latte", 120, 250, 90));
        productList.add(new HotDrink("Tea", 80, 300,100));

        VendingMashine mashine = new VendingMashine();
        DrinkVendingMashine drMashine = new DrinkVendingMashine();
        HotDrinkVendingMashine hotMashine = new HotDrinkVendingMashine();
        mashine.initProducts(productList); //загрузили продукты в автомат
        mashine.getProduct("Nuts"); //попросили выдать nuts
        mashine.getProduct("Mars");
        drMashine.initProducts(productList);//загрузили напитки
        drMashine.getProduct("Coca-cola");
        drMashine.getProduct("Vodka");
        hotMashine.initProducts(productList);
        hotMashine.getProduct("Latte", 200, 50);
        hotMashine.getProduct("Latte", 250, 90);
    }
}
