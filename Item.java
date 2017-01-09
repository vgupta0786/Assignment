package cleancode;

import java.util.HashMap;
import java.util.Map;

public class Item {

	private String itemCode;
	private Integer basePrice;
	private Map<String, Integer> quantity = new HashMap<>();
	private Integer itemCount;

	public Item(String itemCode, Integer basePrice) {
		this.itemCode = itemCode;
		this.basePrice = basePrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public int getItemQuantity(String itemCode) {
		return quantity.get(itemCode);
	}

	public void countItems(String itemCode) {
		quantity.put(itemCode, quantity.getOrDefault(itemCode, 0) + 1);
	}

	public Map<String, Integer> getQuantity() {
		return quantity;
	}

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public Integer getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

}
