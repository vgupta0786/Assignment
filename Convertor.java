package cleancode;

import static java.util.Arrays.asList;

import java.util.List;

public class Convertor {

    private final List<String> tensList = asList("", "", "twenty", "thirty"); 
    
    private List<String> onesList = asList("", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");

    public String numberToWord(int number) {
        if(number==0)
            return "zero";
        
        if (number>=21 && number<=30) {
            StringBuilder builder = new StringBuilder(50);
            builder.append(tensList.get(number / 10));
            builder.append(onesList.get(number % 10));
            return builder.toString();
        }
        return onesList.get(number);
    }

}
