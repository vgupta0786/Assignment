package cleancode;

public class HunderedsConvertor extends TensConvertor implements Convertor {

    private final String HUNDERED = " hundered ";

    @Override
    public String numberToWord(int number) {
        return super.numberToWord(number / 100) + HUNDERED + super.numberToWord(number % 100);
    }

}
