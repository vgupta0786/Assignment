package cleancode;

import java.util.Map;

public class ItemInfo {
    private Map<String, Integer> name;
    private int price;
    private int offerQuantity;
    private int offerPrice;

    public int getOfferQuantity() {
        return offerQuantity;
    }

    public void setOfferQuantity(int offerQuantity) {
        this.offerQuantity = offerQuantity;
    }

    public int getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(int offerPrice) {
        this.offerPrice = offerPrice;
    }

    public Map<String, Integer> getName() {
        return name;
    }

    public void setName(Map<String, Integer> name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
