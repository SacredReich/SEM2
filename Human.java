import java.util.HashMap;

public class Human extends Actor {
    private double money;
    private HashMap<String, Integer> shoppingList;

    public Human(String namePerson, boolean isMakeOrder, boolean isTakeOrder, double money,
            HashMap<String, Integer> shoppingList) {
        super.namePerson = namePerson;
        this.money = money;
        this.shoppingList = shoppingList;
    }

    public String getName() {
        return namePerson;
    }

    public HashMap<String, Integer> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(HashMap<String, Integer> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void setMakeOrder(Automat automat) {
        automat.createOrder(null);
    }

    @Override
    public void setTakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTakeOrder'");
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isTakeOrder'");
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMakeOrder'");
    }

}