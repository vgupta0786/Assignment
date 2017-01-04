package cleancode;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.summingInt;

public class Checkout {

    public Integer calculateTotalPrice(Item... items) {
        return asList(items).stream().collect(summingInt(item -> item.getPrice()));
    }

}
