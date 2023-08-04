import java.util.List;

public class HotBeverageAutomat extends Automat {
    public HotBeverageAutomat(Storage catergoryList) {
        super(catergoryList);
        // TODO Auto-generated constructor stub
    }

    List<HotBeverage> listProduct = new ArrayList<>();

    public void initHotBeverage(List<HotBeverage> myList2) {
        listProduct = myList2;
    }

    public HotBeverage getProduct(String name, double volume, int temp) {
        for (HotBeverage el : listProduct) {
            if (el.getName().equals(name) && el.getVolume() == volume && el.getTemp() == temp) {
                // System.out.println(el);
                return el;
            }
        }
        return null;
    }

}