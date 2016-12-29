package cleancode;

import java.util.HashMap;

public class NumberToWord {

    public String numberToWord(int number) {
        HashMap<Integer, String> numToWordMap=new HashMap<Integer, String>();
        numToWordMap.put(0, "zero");
        numToWordMap.put(1, "one");
        numToWordMap.put(7, "seven");
        
        return numToWordMap.get(number);
    }

}
