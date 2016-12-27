package exercise5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PerfectNumberTest {
    @Test
    public void should_return_true_when_6_is_passed() {
        PerfectNumber perfectNumber = new PerfectNumber();
        assertTrue(perfectNumber.isPerfectNumber(6));
    }

}
