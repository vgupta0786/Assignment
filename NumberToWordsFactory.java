package cleancode;

public class NumberToWordsFactory {

    public Convertor createInstance(int number) {

        OnesConvertor onesConvertor = new OnesConvertor();
        TensConvertor tensConvertor = new TensConvertor();

        return isTwoDigit(number) ? tensConvertor : onesConvertor;
    }

    private boolean isTwoDigit(int number) {
        return number >= 20 && number <= 99;
    }
}
