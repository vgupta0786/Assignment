package cleancode;

public class DiscountedPricingRule implements PricingRule {

    private int basePrice;
    private int offerQuantity;
    private int offerPrice;

    public DiscountedPricingRule() {
    }

    public DiscountedPricingRule(int basePrice, int offerQuantity, int offerPrice) {
        this.basePrice=basePrice;
        this.offerQuantity = offerQuantity;
        this.offerPrice = offerPrice;
    }

    @Override
    public Integer applyRule(int itemCount) {
        int discountedQuantity = itemCount / offerQuantity;
        int nonDiscountedQuantity = itemCount % offerQuantity;
        return discountedQuantity * offerPrice + nonDiscountedQuantity * basePrice;
    }

    public int getOfferQuantity() {
        return offerQuantity;
    }

}
