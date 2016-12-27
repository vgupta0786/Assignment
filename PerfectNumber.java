package exercise5;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    public boolean isPerfectNumber(int i) {
        return true;
    }

    public boolean isFactor(int factor, int number) {
        return number % factor == 0;
    }

    public List<Integer> factorFor(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        factors.add(1);
        return factors;
    }

}
