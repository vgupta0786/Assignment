package cleancode;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private String itemCode;
    private Map<String, Integer> quantity = new HashMap<>();

    public Item(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getItemQuantity(String itemCode) {
        return quantity.get(itemCode);
    }

    public void countItems(String itemCode) {
        quantity.put(itemCode, quantity.getOrDefault(itemCode, 0) + 1);
    }

}
