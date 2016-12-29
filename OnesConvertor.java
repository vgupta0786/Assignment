package cleancode;

import static java.util.Arrays.asList;

import java.util.List;

public class OnesConvertor implements Convertor {

    List<String> onesList = asList("", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen");

    public String numberToWord(int number) {
        if (number == 0)
            return "zero";
        return onesList.get(number);
    }

}
