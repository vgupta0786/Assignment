package cleancode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckOut {

    private List<ItemInfo> cart = new ArrayList<ItemInfo>();

    public List<ItemInfo> scanItem(String items) {
        if (items.contains(":")) {
            for (String item : items.split(":")) {
                setItemInfo(item);
            }
        } else {
            setItemInfo(items);
        }
        return cart;
    }

    private void setItemInfo(String item) {
        // map consist of item name and quantity
        Map<String, Integer> itemCount = new HashMap<>();
        if (itemCount.containsKey(itemName(item))) {
            // Map already contains the item. Just increment it's count by 1
            itemCount.put(itemName(item), itemCount.get(itemName(item)) + 1);
        } else {
            // Map doesn't have mapping for item. Add one with count = 1
            itemCount.put(itemName(item), 1);
        }
        ItemInfo singleItemInfo = new ItemInfo();
        singleItemInfo.setName(itemCount);
        singleItemInfo.setPrice(itemPrice(item));
        singleItemInfo.setOfferQuantity(itemOfferQuantity(item));
        singleItemInfo.setOfferPrice(itemOfferPrice(item));
        cart.add(singleItemInfo);
    }

    private String itemName(String item) {
        return item.split(",")[0];
    }

    private int itemPrice(String item) {
        return Integer.parseInt(item.split(",")[1]);
    }

    private int itemOfferQuantity(String item) {
        return Integer.parseInt(item.split(",")[2]);
    }

    private int itemOfferPrice(String item) {
        return Integer.parseInt(item.split(",")[3]);
    }

    public Integer getTotalPrice() {
        return cart.stream().mapToInt(item -> {
            if (item.getName().get(0).equals(item.getOfferQuantity()))
                return item.getOfferPrice();
            else
                return item.getPrice();
        }).sum();
    }

}
