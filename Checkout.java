package cleancode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checkout {

	private List<Item> items;
	private List<Offer> offers;

	public void addItem(Item item) {
		items.add(item);
	}

	public Integer getFinalPrice(List<Item> items, List<Offer> offers) {
		List<Item> tempItems = new ArrayList(items);
		List<Offer> tempOffers = new ArrayList(offers);
		Integer tempBestOfferIndex = -1;
		Integer finalPrice = 0;
		Integer minOfferPrice = -1;
		Map<String, Object> processedItemMap = new HashMap<>();
		while (tempItems.size() > 0) {

			if (tempOffers != null && tempOffers.size() > 0) {
				tempBestOfferIndex = PromotionUtil.getBestOfferIndex(tempOffers, minOfferPrice);
				processedItemMap = PromotionUtil.applyOffer(tempItems, tempOffers.get(tempBestOfferIndex));
				minOfferPrice = (Integer) processedItemMap.get(PromotionConstant.CALCULATED_PRICE);
				finalPrice += (Integer) processedItemMap.get(PromotionConstant.CALCULATED_PRICE);
				tempItems = (List<Item>) processedItemMap.get(PromotionConstant.UNPROCESSED_ITEM_LIST);
				tempOffers.remove(tempOffers.get(tempBestOfferIndex));
			} else {
				finalPrice += PromotionUtil.calculateCostAtBasePrice(tempItems);
				tempItems.clear();
			}
		}
		return finalPrice;
	}

	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}
}
