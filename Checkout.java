package cleancode;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toMap;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Checkout {

    private List<Promotion> promotions;

    public Checkout(Promotion... promotions) {
        this.promotions = asList(promotions);
    }

    public Integer calculateTotalPrice(Item... items) {
        asList(items).stream().forEach(item -> item.countItems(item.getItemCode()));

        Set<Item> uniqueItems = new HashSet<>(asList(items));

        Map<String, Promotion> itemPromotions = promotions.stream().collect(
                toMap(Promotion::getItemCode, promotion -> promotion));

        return uniqueItems.stream().collect(summingInt(item -> getItemPrice(itemPromotions, item)));

    }

    private Integer getItemPrice(Map<String, Promotion> itemPromotions, Item item) {
        return getItemPromotions(itemPromotions, item).getPrice(
                item.getItemQuantity(item.getItemCode()));
    }

    private Promotion getItemPromotions(Map<String, Promotion> itemPromotions, Item item) {
        return itemPromotions.get(item.getItemCode());

    }

}
