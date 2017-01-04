package cleancode;

public class Checkout {

    public Integer calculateTotalPrice(String itemCode) {
        return "B".equals(itemCode) ? new Integer(30) : new Integer(50);
    }

}
