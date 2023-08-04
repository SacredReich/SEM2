import java.util.HashMap;
import java.util.Map;

public class Automat {
    private Storage categoryList;
}

    public Automat(Storage catergoryList) {
        this.categoryList = catergoryList;
    }

    void createOrder(Human person) {
        if ((total(person.getShoppingList()) <= person.getMoney())
                && checkAvailabilityShoppingList(person.getShoppingList())) {
            Order newOrder = new Order(person.getShoppingList(), person.getName(), categoryList);
            System.out.println(newOrder.orderReceipt());
        } else {
            System.out.println("Не выполнены условия покупки!");
        }
    }

    double total(HashMap<String, Integer> shoppingList) {
        double total = 0;
        for (Map.Entry<String, Integer> name : shoppingList.entrySet()) {
            String tmpName = name.getKey();
            int tmpQuantity = name.getValue();
            total += tmpQuantity * categoryList.getPriceProduct(tmpName);
        }
        return total;
    }

    boolean checkAvailability(String name, int quantity) {
        return categoryList.getQuantityProduct(name) >= quantity;
    }

    boolean checkAvailabilityShoppingList(HashMap<String, Integer> shoppingList) {
        boolean verification = true;
        for (Map.Entry<String, Integer> name : shoppingList.entrySet()) {
            String tmpName = name.getKey();
            int tmpQuantity = name.getValue();
            if (!checkAvailability(tmpName, tmpQuantity)) {
                verification = false;
                break;
            }
        }
        return verification;
    }
