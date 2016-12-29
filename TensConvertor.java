package cleancode;

import static java.util.Arrays.asList;

import java.util.List;

public class TensConvertor extends OnesConvertor implements Convertor {

    List<String> tensList = asList("", "", "twenty", "thirty", "forty", "fifty", "sixty",
            "seventy", "eighty", "ninety");

    public String numberToWord(int number) {
        StringBuilder builder = new StringBuilder(50);
        if (number >= 11 && number <= 19) {
            builder.append(onesList.get(number));
        } else {
            builder.append(tensList.get(number / 10));
            builder.append(onesList.get(number % 10));
        }
        return builder.toString();
    }

}
