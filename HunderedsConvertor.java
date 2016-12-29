package cleancode;

public class HunderedsConvertor extends TensConvertor implements Convertor {

    private final String HUNDERED = " hundered ";

    @Override
    public String numberToWord(int number) {
        String preWord = super.numberToWord(number / 100);
        String postWord = super.numberToWord(number % 100);
        return "".equals(preWord) ? postWord : preWord + HUNDERED + postWord;
    }

}
