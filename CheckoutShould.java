package cleancode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutShould {

    private Checkout checkout;
    private Item itemA;
    private Item itemB;

    @Before
    public void setUp() {
        checkout = new Checkout();
        itemA = new Item("A", 50);
        itemB = new Item("B", 30);
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

}
