package cleancode;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.summingInt;

import java.util.HashSet;
import java.util.Set;

public class Checkout {

    public Integer calculateTotalPrice(Item... items) {
        asList(items).stream().forEach(item -> item.countItems(item.getItemCode()));
        Set<Item> uniqueItems = new HashSet<>(asList(items));
        return uniqueItems.stream().collect(summingInt(item -> item.getPrice()));
    }

}
