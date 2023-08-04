import java.util.GregorianCalendar;

public class StorageUtil {
    public static Storage creatFoodStorage() {
        Storage foodStorage = new Storage();
        Product tmpProduct;

        tmpProduct = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0), 0.2);
        foodStorage.addProduct(tmpProduct);
        tmpProduct = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0), 0.15);
        foodStorage.addProduct(tmpProduct);
        tmpProduct = new Food("Snickers", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0), 0.2);
        foodStorage.addProduct(tmpProduct);
        tmpProduct = new Food("Cookie", 1300, 10, new GregorianCalendar(2025, 10, 14, 0, 0), 0.5);
        foodStorage.addProduct(tmpProduct);
        tmpProduct = new Food("Nuts", 70, 10, new GregorianCalendar(2025, 10, 14, 0, 0), 0.1);
        foodStorage.addProduct(tmpProduct);
        return foodStorage;
    }
}