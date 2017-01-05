package cleancode;

public class Item {

    private String itemCode;
    private Integer basePrice;

    public Item(String itemCode, Integer basePrice) {
        this.itemCode = itemCode;
        this.basePrice = basePrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

}
