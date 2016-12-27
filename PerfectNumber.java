package exercise5;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    public boolean isPerfectNumber(int number) {
        int sum = 0;
        for (Integer factors : factorFor(number)) {
            sum += factors.intValue();
        }
        return sum - number == number;
    }

    public boolean isFactor(int factor, int number) {
        return number % factor == 0;
    }

    public List<Integer> factorFor(int number) {
        int factor = 1;
        List<Integer> factors = new ArrayList<Integer>();
        factors.add(1);
        while (factor <= number / 2) {
            if (isFactor(factor, number)) {
                factors.add(number / factor);
            }
            factor++;
        }
        return factors;
    }

}
