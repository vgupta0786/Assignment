package cleancode;

public class BasePricingRule implements PricingRule {

    protected int basePrice;

    public BasePricingRule() {
    }

    public BasePricingRule(int basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public Integer applyRule(int itemCount) {
        return basePrice * itemCount;
    }

}
