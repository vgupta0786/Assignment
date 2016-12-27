package exercise5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PerfectNumberTest {

    private PerfectNumber perfectNumber;

    /**
     * instantiations
     */
    @Before
    public void setUp() {
        perfectNumber = new PerfectNumber();
    }

    @Test
    public void should_return_true_when_6_is_passed() {
        assertTrue(perfectNumber.isPerfectNumber(6));
    }

    @Test
    public void should_return_true_As_1_is_factorOf_6() {
        assertTrue(perfectNumber.isFactor(1, 6));
    }

    @Test
    public void should_return_false_As_4_is_not_factorOf_6() {
        assertFalse(perfectNumber.isFactor(4, 6));
    }

    @Test
    public void should_return_factors_for_1() {
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(1);
        assertEquals(expectedList, perfectNumber.factorFor(1));
    }

}
