package exercise2;

/**
 * <h1>Perfect Number Check!</h1>
 * <p>
 * This class provides the method to find out whether a number is perfect or not
 * <p>
 * 
 * 
 * @author vgup77
 *
 */
public class PerfectNumCheck {

    /**
     * This method checks whether a number is perfect or not
     * 
     * @param number
     *            This is the parameter to perfectNumberCheck method
     * @return boolean This returns true/false based on whether a number is perfect or not
     */
    public static boolean perfectNumberCheck(final int number) {
        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
        }
        if (number != 0 && temp == number)
            return true;

        return false;
    }
}
