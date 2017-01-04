package cleancode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckoutShould {

    @Test
    public void print_50_when_A_is_passed() {
        Checkout checkout = new Checkout();
        assertEquals(new Integer(50), checkout.calculateTotalPrice("A"));
    }

    @Test
    public void print_30_when_B_is_passed() {
        Checkout checkout = new Checkout();
        assertEquals(new Integer(30), checkout.calculateTotalPrice("B"));
    }

}
