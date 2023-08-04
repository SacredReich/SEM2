import java.util.ArrayList;
import java.util.List;

public class Storage {
    List<Product> categoryList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return new ArrayList<>(categoryList);
    }

    public void addProduct(Product product) {
        this.categoryList.add(product);
    }

    public Product getProduct(String name) {
        for (Product el : categoryList) {
            if (el.getName().equals(name)) {
                return el;
            }
        }
        return null;
    }

    public int getQuantityProduct(String name) {
        for (Product el : categoryList) {
            if (el.getName().equals(name)) {
                return el.getQuantity();
            }
        }
        return -1;
    }

    public void changeQuantity(String name, int difference) {
        for (Product el : categoryList) {
            if (el.getName().equals(name)) {
                int nowQuntity = el.getQuantity();
                nowQuntity -= difference;
                el.setQuantity(nowQuntity);
            }
        }
    }

    public int getPriceProduct(String name) {
        for (Product el : categoryList) {
            if (el.getName().equals(name)) {
                return el.getPrice();
            }
        }
        return -1;
    }

}