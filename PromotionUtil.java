package cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromotionUtil {
    public List<Offer> bestOffer;

    public Integer getBestOfferIndex(List<Offer> bestOffer) {
        int minPrice = bestOffer.get(0).getPrice();
        int bestIndex = 0;
        for (int i = 1; i < bestOffer.size(); i++) {
            if (bestOffer.get(i).getPrice() < minPrice) {
                minPrice = bestOffer.get(i).getPrice();
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    public Map<String, Object> applyOffer(List<Item> items, Offer offer) {
        Map<String, Object> map = null;
        map = summarizeOffer(items, offer);
        Integer price = 0;
        price = ((Integer) map.get(PromotionConstant.OFFER_SET_COUNT)) * offer.getPrice();
        map.put(PromotionConstant.CALCULATED_PRICE, price);
        return map;
    }

    public Integer calculateCostAtBasePrice(List<Item> tempItemList) {
        Integer calculatedPrice = 0;

        for (Item item : tempItemList) {
            calculatedPrice += item.getBasePrice();
        }
        return calculatedPrice;
    }

    private Map<String, Object> summarizeOffer(List<Item> items, Offer offer) {
        Map<String, Object> map = null;
        Integer offerSetCount = 0;
        do {
            map = removeOfferSet(items, offer);
            if ((Boolean) (map.get(PromotionConstant.IS_OFFER_APPLICABLE)))
                offerSetCount++;
        } while ((Boolean) (map.get(PromotionConstant.IS_OFFER_APPLICABLE)));
        map.put(PromotionConstant.OFFER_SET_COUNT, offerSetCount);
        if (offerSetCount > 0) {
            map.put(PromotionConstant.IS_OFFER_APPLICABLE, true);
        } else
            map.put(PromotionConstant.IS_OFFER_APPLICABLE, false);
        return map;
    }

    private Map<String, Object> removeOfferSet(List<Item> items, Offer offer) {
        List<Item> offerList = offer.getDiscountedItems();
        Boolean isOfferApplicable = true;
        if ((offerList.size() == 0 || items.size() == 0) || offerList.size() > items.size())
            isOfferApplicable = false;
        List<Item> tempItemList = items;
        if (isOfferApplicable) {
            for (int i = 0; i < offerList.size(); i++) {
                if (!tempItemList.remove(offerList.get(i))) {
                    isOfferApplicable = false;
                }
            }
        }
        if (isOfferApplicable) {
            items = tempItemList;
        }
        Map<String, Object> map = new HashMap<>();
        map.put(PromotionConstant.IS_OFFER_APPLICABLE, isOfferApplicable);
        map.put(PromotionConstant.UNPROCESSED_ITEM_LIST, items);
        return map;
    }
}
