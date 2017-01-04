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
    public void print_seven_when_7_is_passed() {
        assertEquals("seven", convert.numberToWord(7));
    }

    @Test
    public void print_nineteen_when_19_is_passed() {
        assertEquals("nineteen", convert.numberToWord(19));
    }

    @Test
    public void print_twentyone_when_21_is_passed() {
        assertEquals("twentyone", convert.numberToWord(21));
    }

    @Test
    public void print_twentynine_when_29_is_passed() {
        assertEquals("twentynine", convert.numberToWord(29));
    }

    @Test
    public void print_thirty_when_30_is_passed() {
        assertEquals("thirty", convert.numberToWord(30));
    }

    @Test
    public void print_ninetynine_when_99_is_passed() {
        assertEquals("ninetynine", convert.numberToWord(99));
    }

    @Test
    public void print_onehunderedninetynine_when_199_is_passed() {
        assertEquals("one hundered ninetynine", convert.numberToWord(199));
    }

    @Test
    public void print_onethousandninetynine_when_1099_is_passed() {
        assertEquals("one thousand ninetynine", convert.numberToWord(1099));
    }
    
    @Test
    public void print_ninethousandninehunderedninetynine_when_9999_is_passed() {
        assertEquals("nine thousand nine hundered ninetynine", convert.numberToWord(9999));
    }


}