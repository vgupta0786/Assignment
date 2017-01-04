package cleancode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutShould {

    private Checkout checkout;
    private Item itemA, itemB, itemD;

    @Before
    public void setUp() {
        itemA = new Item("A");
        BasePricingRule basePricing = new BasePricingRule(50);
        DiscountedPricingRule discount = new DiscountedPricingRule(50, 3, 130);
        Promotion promotionA = new Promotion("A", basePricing, discount);

        itemB = new Item("B");
        basePricing = new BasePricingRule(30);
        discount = new DiscountedPricingRule(30, 2, 45);
        Promotion promotionB = new Promotion("B", basePricing, discount);

        itemD = new Item("D");
        basePricing = new BasePricingRule(15);
        Promotion promotionD = new Promotion("D", basePricing, null);

        checkout = new Checkout(promotionA, promotionB, promotionD);
    }

    @Test
    public void print_50_when_A_is_passed() {
        assertEquals(new Integer(50), checkout.calculateTotalPrice(itemA));
    }

    @Test
    public void print_30_when_B_is_passed() {
        assertEquals(new Integer(30), checkout.calculateTotalPrice(itemB));
    }

    @Test
    public void print_80_when_A_and_B_both_passed() {
        assertEquals(new Integer(80), checkout.calculateTotalPrice(itemA, itemB));
    }

    @Test
    public void print_130_when_A_items_are_passed_thrice() {
        assertEquals(new Integer(130), checkout.calculateTotalPrice(itemA, itemA, itemA));
    }

    @Test
    public void print_45_when_B_items_are_passed_twice() {
        assertEquals(new Integer(45), checkout.calculateTotalPrice(itemB, itemB));
    }

    @Test
    public void print_180_when_A_items_are_passed_4_times() {
        assertEquals(new Integer(180), checkout.calculateTotalPrice(itemA, itemA, itemA, itemA));
    }

    @Test
    public void print_175_when_3A_and_2B_are_passed() {
        assertEquals(new Integer(175),
                checkout.calculateTotalPrice(itemA, itemA, itemA, itemB, itemB));
    }

    @Test
    public void print_175_when_items_are_passed_in_DABABA_sequence() {
        assertEquals(new Integer(190),
                checkout.calculateTotalPrice(itemD, itemA, itemB, itemA, itemB, itemA));
    }

}
