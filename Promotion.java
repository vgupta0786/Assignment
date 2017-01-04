package cleancode;

public class Promotion {
    private String itemCode;
    private BasePricingRule price;
    private DiscountedPricingRule discount;

    public Promotion(String itemCode, BasePricingRule price, DiscountedPricingRule discount) {
        this.itemCode = itemCode;
        this.price = price;
        this.discount = discount;
    }

    public String getItemCode() {
        return itemCode;
    }

    public Integer getPrice(int itemQuantity) {
        if (null==discount || discount.getOfferQuantity() == 0
                || itemQuantity < discount.getOfferQuantity()) {
            return price.applyRule(itemQuantity);
        } else {
            return discount.applyRule(itemQuantity);
        }
    }
}
