package exercise1;

import java.io.Serializable;

/**
 * class which decides game result
 * 
 * @author vgup77
 *
 */
public class GameResult implements Serializable {

    /**
     * serial version uid
     */
    private static final long serialVersionUID = -2294337582146480558L;

    /**
     * for string game result.
     */
    String result;

    /**
     * returns game result
     * 
     * @return
     */
    public String getResult() {
        return result;
    }

    /**
     * set game result
     * 
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GameResult [result=" + result + "]";
    }

}
