package cleancode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberToWordShould {
    
    private NumberToWord convert;
    
    @Before
    public void setUp() {
        convert = new NumberToWord();
    }
    
    @Test
    public void print_zero_when_0_is_passed() {
        assertEquals("zero", convert.numberToWord(0));
    }

    @Test
    public void print_one_when_1_is_passed() {
        assertEquals("one", convert.numberToWord(1));
    }
    
    @Test
    public void print_two_when_2_is_passed() {
        assertEquals("two", convert.numberToWord(2));
    }

}
