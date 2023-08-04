import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        Storage foodStorage = StorageUtil.creatFoodStorage();
        System.out.println(foodStorage.getAllProducts());

        Automat foodAutomat = new Automat(foodStorage);
        HashMap<String, Integer> shoppingList = new HashMap<>();
        shoppingList.put("Twix", 5);
        shoppingList.put("Mars", 5);
        Human person1 = new Human("Ivan", false, false, 1000, shoppingList);
        foodAutomat.createOrder(person1);
    }
}