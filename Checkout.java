package cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checkout {

    private List<Item> items;
    private List<Offer> offers;
    private PromotionUtil promotionProcessor;

    public Integer getFinalPrice(List<Item> items, List<Offer> offers) {
        List<Item> tempItemList = items;
        List<Offer> tempOfferList = offers;
        Integer tempBestOfferIndex = -1;
        Integer finalPrice = 0;
        Map<String, Object> processedItemMap = new HashMap<>();
        Offer tempBestOffer = null;
        while (tempItemList.size() > 0) {
            if (tempOfferList != null && offers.size() > -1) {
                tempBestOfferIndex = promotionProcessor.getBestOfferIndex(offers);
                if (tempBestOfferIndex > -1) {
                    processedItemMap = promotionProcessor.applyOffer(tempItemList,
                            tempOfferList.get(tempBestOfferIndex));
                    finalPrice += (Integer) processedItemMap
                            .get(PromotionConstant.CALCULATED_PRICE);
                    tempItemList = (List<Item>) processedItemMap
                            .get(PromotionConstant.UNPROCESSED_ITEM_LIST);
                }
                tempOfferList.remove(tempBestOfferIndex);
            } else {
                finalPrice = promotionProcessor.calculateCostAtBasePrice(tempItemList);
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
