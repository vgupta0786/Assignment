package cleancode;

import static java.util.Arrays.asList;
import java.util.List;

public class Convertor {

    private List<String> numToWordList = asList("zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");

    public String numberToWord(int number) {
        return numToWordList.get(number);
    }

}
