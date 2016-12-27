package exercise5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PerfectNumberTest {
    @Test
    public void should_return_true_when_6_is_passed() {
        PerfectNumber perfectNumber = new PerfectNumber();
        assertTrue(perfectNumber.isPerfectNumber(6));
    }

    @Test
    public void should_return_true_As_1_is_factorOf_6() {
        PerfectNumber perfectNumber = new PerfectNumber();
        assertTrue(perfectNumber.isFactor(1,6));
    }
    
    @Test
    public void should_return_false_As_4_is_not_factorOf_6() {
        PerfectNumber perfectNumber = new PerfectNumber();
        assertFalse(perfectNumber.isFactor(4,6));
    }

}
