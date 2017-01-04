package cleancode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutShould {

    private Checkout checkout;

    @Before
    public void setUp() {
        checkout = new Checkout();
    }

    @Test
    public void print_50_when_A_is_passed() {
        assertEquals(new Integer(50), checkout.calculateTotalPrice(new Item("A",50)));
    }

    @Test
    public void print_30_when_B_is_passed() {
        assertEquals(new Integer(30), checkout.calculateTotalPrice(new Item("B",30)));
    }

}
