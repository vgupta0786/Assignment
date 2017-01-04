package cleancode;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private String itemCode;

    private Integer price;
    private Integer offerQuantity = 0;
    private Integer offerPrice = 0;
    private Map<String, Integer> quantity = new HashMap<>();

    public Item(String itemCode, Integer price) {
        this.itemCode = itemCode;
        this.price = price;
    }

    public Item(String itemCode, Integer price, Integer offerQuantity, Integer offerPrice) {
        this.itemCode = itemCode;
        this.price = price;
        this.offerQuantity = offerQuantity;
        this.offerPrice = offerPrice;
    }

    public Integer getPrice() {
        if (offerQuantity == 0 || getItemQuantity(itemCode) < offerQuantity) {
            return getItemQuantity(itemCode) * price;
        } else {
            int discountedQuantity = getItemQuantity(itemCode) / offerQuantity;
            int constantQuantity = getItemQuantity(itemCode) % offerQuantity;
            return discountedQuantity * offerPrice + constantQuantity * price;
        }
    }

    public int getItemQuantity(String itemCode) {
        return quantity.get(itemCode);
    }

    public void countItems(String itemCode) {
        quantity.put(itemCode, quantity.getOrDefault(itemCode, 0) + 1);
    }

    public String getItemCode() {
        return itemCode;
    }

}
