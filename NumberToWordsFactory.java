package cleancode;

import static java.util.Arrays.asList;

import java.util.List;

public class NumberToWordsFactory {

    List<Convertor> onesList = asList(null, new OnesConvertor(), new TensConvertor(),
            new HunderedsConvertor(), new ThousandsConvertor());

    public Convertor getInstance(int numberLength) {
        return onesList.get(numberLength);
    }
}
