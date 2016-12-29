package cleancode;

public class NumberToWord {

    public String numberToWord(int number) {
        NumberToWordsFactory factory = new NumberToWordsFactory();
        Convertor convert = factory.createInstance(String.valueOf(number).length());
        return convert.numberToWord(number);
    }

}
