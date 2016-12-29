package cleancode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberToWordShould {

    @Test
    public void print_zero_when_0_is_passed() {
        NumberToWord convert = new NumberToWord();
        assertEquals("zero", convert.numberToWord(0));
    }

    @Test
    public void print_one_when_1_is_passed() {
        NumberToWord convert = new NumberToWord();
        assertEquals("one", convert.numberToWord(1));
    }

}
