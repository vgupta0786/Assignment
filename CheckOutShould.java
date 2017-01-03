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
        assertEquals(2,checkout.scanItem("A,50:B,30").size());
    }
}
