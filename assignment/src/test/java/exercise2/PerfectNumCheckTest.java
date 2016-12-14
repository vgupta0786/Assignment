package exercise2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <h1>Perfect Number Check Test!</h1>
 * <p>
 * Perfect number check test
 * </p>
 * 
 * @author vgup77
 *
 */
public class PerfectNumCheckTest {

    /**
     * test if method returns false when non perfect number is passed as argument
     */
    @Test
    public final void testFalseWhenNonPerfectNumberisPassed() {
        assertFalse(PerfectNumCheck.perfectNumberCheck(1));
    }

    /**
     * test if method returns false when 0 is passed as argument
     */
    @Test
    public final void testFalseWhenZeroisPassed() {
        assertFalse(PerfectNumCheck.perfectNumberCheck(0));
    }
    
    /**
     * test if method returns true when perfect number is passed as argument
     */
    @Test
    public final void testTrueWhenPerfectNumberisPassed() {
        assertTrue(PerfectNumCheck.perfectNumberCheck(28));
    }

    /**
     * test method success when negative number is passed as argument
     */
    @Test
    public final void testSuccessWhenNegativeNumberIsPassed() {
        assertFalse(PerfectNumCheck.perfectNumberCheck(-7));
    }

}
