package cleancode;

public class NumberToWord {

    public String numberToWord(int number) {
        NumberToWordsFactory factory = new NumberToWordsFactory();
        Convertor convert = factory.getInstance(String.valueOf(number).length());
        return convert.numberToWord(number);
    }

}
