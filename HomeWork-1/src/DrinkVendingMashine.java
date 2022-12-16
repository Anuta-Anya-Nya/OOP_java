import java.util.ArrayList;
import java.util.List;

public class DrinkVendingMashine extends VendingMashine{
    protected List<Drink> drinksInVending = new ArrayList<>();
    @Override
    public void initProducts(List<Product> list) {
        for (Product product : list) {
            if(product instanceof Drink){
                drinksInVending.add((Drink) product);
                System.out.println("Напиток "+ product.getName() + " загружен в автомат напитков");
            }
        }
        System.out.println(drinksInVending);
    }
    @Override
    public String getProduct(String name) {
        for (Product product : drinksInVending) {
            if(product.getName().equals(name)){
                drinksInVending.remove(product);
                System.out.printf("Напиток %s выдан\n", name);
                return name;
            }
        }
        System.out.printf("Напиток %s не найден\n", name);
        return name;
    }
    
}
