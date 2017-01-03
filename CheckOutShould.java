package cleancode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CheckOutShould {

    @Test
    public void scan_one_item() {
        CheckOut checkout = new CheckOut();
        assertNotNull(checkout.scanItem("A,50,0,0"));
    }

    @Test
    public void scan_2_items() {
        CheckOut checkout = new CheckOut();
        assertEquals(2, checkout.scanItem("A,50,0,0:B,30,0,0").size());
    }

    @Test
    public void scan_one_item_and_print_its_price() {
        CheckOut checkout = new CheckOut();
        checkout.scanItem("A,50,0,0");
        assertEquals(new Integer(50), checkout.getTotalPrice());
    }

    @Test
    public void scan_2_items_and_print_total_price() {
        CheckOut checkout = new CheckOut();
        checkout.scanItem("A,50,0,0:B,30,0,0");
        assertEquals(new Integer(80), checkout.getTotalPrice());
    }

    @Test
    public void scan_3_same_items_and_print_total_offer_price() {
        CheckOut checkout = new CheckOut();
        checkout.scanItem("A,50,3,130:A,50,3,130:A,50,3,130");
        assertEquals(new Integer(130), checkout.getTotalPrice());
    }
}
