package cleancode;

public class NumberToWordsFactory {

    public Convertor createinstance(int number) {

        OnesConvertor onesConvertor = new OnesConvertor();
        TensConvertor tensConvertor = new TensConvertor();

        return number >= 20 && number <= 30 ? tensConvertor : onesConvertor;
    }
}
