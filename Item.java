package cleancode;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private String itemCode;
    private BasePricingRule basePrice;
    private DiscountedPricingRule promotion;
    private Map<String, Integer> quantity = new HashMap<>();

    public Item(String itemCode, BasePricingRule basePrice, DiscountedPricingRule promotion) {
        super();
        this.basePrice=basePrice;
        this.itemCode = itemCode;
        this.promotion = promotion;
    }

    public Integer getPrice() {
        if (promotion.getOfferQuantity()==0 || getItemQuantity(itemCode) < promotion.getOfferQuantity()) {
            return basePrice.applyRule(getItemQuantity(itemCode));
        } else {
            return promotion.applyRule(getItemQuantity(itemCode));
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
