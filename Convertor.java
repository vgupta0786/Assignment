package cleancode;

import static java.util.Arrays.asList;
import java.util.List;

public class Convertor {

    private List<String> numToWordList = asList("zero", "one", "two", "three", "four", "five",
            "six", "seven");

    public String numberToWord(int number) {
        return numToWordList.get(number);
    }

}
