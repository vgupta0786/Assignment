package cleancode;

public class Item {

    private String itemCode;
    private Integer price;

    public Item(String itemCode, Integer price) {
        super();
        this.itemCode = itemCode;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

}
