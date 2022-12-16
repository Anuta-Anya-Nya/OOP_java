import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    protected List<Product> productInVending = new ArrayList<>();
    public void initProducts(List <Product> list) {
        for (Product product : list) {
            this.productInVending.add(product);
            System.out.println("Продукт "+ product.getName() + " загружен в автомат");
        }
        System.out.println(productInVending);
    }
    public String getProduct(String name) {
        for (Product product : productInVending) {
            if(product.getName().equals(name)){
                productInVending.remove(product);
                System.out.printf("Продукт %s выдан\n", name);
                return name;
            }
        }
        System.out.printf("Продукт %s не найден\n", name);
        return name;
    }
    
    public List<Product> getProductInVending() { //setProductInVending() не делаю, чтобы нельзя было изменить список продуктов в автомате
        return productInVending;
    }
    
    
}
