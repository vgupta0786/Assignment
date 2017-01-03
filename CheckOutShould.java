package cleancode;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CheckOutShould {

    @Test
    public void scan_one_item() {
        CheckOut checkout = new CheckOut();
        assertNotNull(checkout.scanItem("A,50"));
    }
}
