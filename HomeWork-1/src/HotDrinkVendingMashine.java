import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMashine extends DrinkVendingMashine{
    List<HotDrink> hotDrinksInVending = new ArrayList<>();
    @Override
    public void initProducts(List<Product> list) {
        for (Product product : list) {
            if(product instanceof HotDrink){
                hotDrinksInVending.add((HotDrink) product);
                System.out.println("Горячий напиток "+ product.getName() + " загружен в автомат напитков");
            }
        }
        System.out.println(hotDrinksInVending);
    }
    public String getProduct(String name, double volume, int temp) {
        for (HotDrink drink : hotDrinksInVending) {
            if(drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemp() == temp){
                drinksInVending.remove(drink);
                System.out.printf("Горячий напиток %s выдан\n", name);
                return name;
            }
        }
        System.out.printf("Горячий напиток %s не найден\n", name);
        return name;
    }
}
