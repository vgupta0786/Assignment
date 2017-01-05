package cleancode;

import java.util.List;

public class Offer {
    private List<Item> discountedItems;
    private Integer price;

    public List<Item> getDiscountedItems() {
        return discountedItems;
    }

    public void setDiscountedItems(List<Item> discountedItems) {
        this.discountedItems = discountedItems;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
