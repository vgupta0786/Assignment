package cleancode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CheckOutShould {

    @Test
    public void scan_one_item() {
        CheckOut checkout = new CheckOut();
        assertNotNull(checkout.scanItem("A,50"));
    }

    @Test
    public void scan_2_items() {
        CheckOut checkout = new CheckOut();
        assertEquals(2, checkout.scanItem("A,50:B,30").size());
    }
    
    @Test
    public void scan_one_item_and_print_its_price() {
        CheckOut checkout = new CheckOut();
        checkout.scanItem("A,50");
        assertEquals(new Integer(50),checkout.getTotalPrice());
    }
    
    @Test
    public void scan_2_items_and_print_total_price() {
        CheckOut checkout = new CheckOut();
        checkout.scanItem("A,50:B,30");
        assertEquals(new Integer(80),checkout.getTotalPrice());
    }
}
