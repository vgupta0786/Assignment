package cleancode;

public class NumberToWordsFactory {

    public Convertor createInstance(int numberLength) {
        if (numberLength == 3)
            return new HunderedsConvertor();
        else if (numberLength == 2)
            return new TensConvertor();
        else
            return new OnesConvertor();

    }
}
