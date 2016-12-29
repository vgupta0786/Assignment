package cleancode;

import static java.util.Arrays.asList;

import java.util.List;

public class Convertor {

    private static final String TWENTY = "twenty";

    private List<String> numToWordList = asList("zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");

    public String numberToWord(int number) {

        if (number>=21 && number<=29) {
            StringBuilder builder = new StringBuilder(50);
            builder.append(Convertor.TWENTY);
            builder.append(numToWordList.get(number % 10));
            return builder.toString();
        }
        return numToWordList.get(number);
    }

}
