package cleancode;

public class DiscountedPricingRule extends BasePricingRule implements PricingRule {

    private int offerQuantity;
    private int offerPrice;

    public DiscountedPricingRule() {
    }

    public DiscountedPricingRule(int offerQuantity, int offerPrice) {
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
