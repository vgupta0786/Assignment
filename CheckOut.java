package cleancode;

import java.util.ArrayList;
import java.util.List;

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
        ItemInfo singleItemInfo = new ItemInfo();
        singleItemInfo.setName(itemName(item));
        singleItemInfo.setPrice(itemPrice(item));
        cart.add(singleItemInfo);
    }

    private String itemName(String item) {
        return item.split(",")[0];
    }

    private int itemPrice(String item) {
        return Integer.parseInt(item.split(",")[1]);
    }

    public Integer getTotalPrice() {
        return new Integer(0);
    }

}
