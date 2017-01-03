package cleancode;

import java.util.ArrayList;
import java.util.List;

public class CheckOut {

    private List<String> cart = new ArrayList<String>();

    public List<String> scanItem(String items) {
        for (String item : items.split(":")) {
            cart.add(item);
        }
        return cart;
    }

}
