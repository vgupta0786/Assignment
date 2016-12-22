package exercise3;

/**
 * @author vgup77
 *
 */
public class FizzBuzz {

    /**
     * accepts integer and prints appropriate result
     * 
     * @param i
     */
    public void printResult(int number) {
        boolean multipleOf3 = (number % 3 == 0);
        boolean multipleOf5 = (number % 5 == 0);
        if (!multipleOf3 && !multipleOf5) {
            System.out.print(number);
        }
        StringBuilder result = new StringBuilder();
        if (multipleOf3) {
            result.append("Fizz");
        }
        if (multipleOf5) {
            result.append("Buzz");
        }
        System.out.print(result);
    }

}
