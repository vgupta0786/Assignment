package cleancode;

import java.util.Map;

public class ItemInfo {
    private Map<String, Integer> name;

    public Map<String, Integer> getName() {
        return name;
    }

    public void setName(Map<String, Integer> name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

}
