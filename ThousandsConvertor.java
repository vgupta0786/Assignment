package cleancode;

public class ThousandsConvertor extends HunderedsConvertor implements Convertor {

    private final String THOUDANDS = " thousand ";

    @Override
    public String numberToWord(int number) {
        String preWord=new TensConvertor().numberToWord(number / 1000);
        String postWord=(number % 1000 > 0) ? super.numberToWord(number % 1000) : "";
        return preWord + THOUDANDS + postWord;
    }

}
