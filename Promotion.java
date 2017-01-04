package cleancode;

public class Promotion {
    private String itemCode;
    private BasePricingRule basePrice;
    private DiscountedPricingRule discount;
    
    public Promotion(String itemCode, BasePricingRule basePrice, DiscountedPricingRule discount) {
        this.itemCode = itemCode;
        this.basePrice = basePrice;
        this.discount = discount;
    }
    
    public String getItemCode() {
        return itemCode;
    }

    public Integer getPrice(int itemQuantity) {
        if (discount.getOfferQuantity() == 0
                || itemQuantity < discount.getOfferQuantity()) {
            return basePrice.applyRule(itemQuantity);
        } else {
            return discount.applyRule(itemQuantity);
        }
    }
}
