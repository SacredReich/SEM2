import java.util.HashMap;
import java.util.Map;

public class Order {
    private HashMap<String, Integer> shoppingList;
    private String namePerson;
    private Storage categoryList;

    public Order(HashMap<String, Integer> shoppingList, String namePerson, Storage catergoryList) {
        this.shoppingList = shoppingList;
        this.namePerson = namePerson;
        this.categoryList = catergoryList;
    }

    public StringBuilder orderReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Client: " + namePerson);
        receipt.append("\n");
        int totalOrder = 0;
        for (Map.Entry<String, Integer> name : shoppingList.entrySet()) {
            String tmpName = name.getKey();
            int tmpQuantity = name.getValue();
            int tmpPrice = categoryList.getPriceProduct(tmpName);
            String tmpString = String.format("Product: %s price: %d quantity: %d sum: %d \n", tmpName, tmpPrice,
                    tmpQuantity, tmpQuantity * tmpPrice);
            receipt.append(tmpString);
            totalOrder += tmpQuantity * tmpPrice;
        }
        receipt.append("Total: " + totalOrder + "\n");
        receipt.append("Thank you for your purchase! We are waiting for you again!");
        return receipt;

    }
}