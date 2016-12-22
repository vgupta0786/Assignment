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
    public void printResult(int i) {
        if (i == 3)
            System.out.print("Fizz");
        else if(i==5)
            System.out.print("Buzz");
        else
            System.out.print(i);
    }

}
