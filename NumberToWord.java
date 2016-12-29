package cleancode;

public class NumberToWord {

    public String numberToWord(int number) {
        NumberToWordsFactory factory = new NumberToWordsFactory();
        Convertor convert = factory.createinstance(number);
        return convert.numberToWord(number);
    }

}
