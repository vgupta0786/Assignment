package cleancode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CheckoutShould {

    private Checkout checkout;
    List<Item> itemList;
    List<Offer> offerList;

    private Item itemA, itemB, itemC, itemD;

    @Before
    public void setUp() {
        checkout = new Checkout();
        itemList = new ArrayList<>();
        itemA = new Item("A", 50);
        itemB = new Item("B", 30);
        itemC = new Item("C", 20);
        itemD = new Item("D", 15);

        offerList = new ArrayList<>();

        List<Item> discountedItems = new ArrayList<>();
        discountedItems.add(itemA);
        discountedItems.add(itemA);
        discountedItems.add(itemA);
        Offer offer = new Offer();
        offer.setDiscountedItems(discountedItems);
        offer.setPrice(130);
        offerList.add(offer);

        discountedItems = new ArrayList<>();
        discountedItems.add(itemB);
        discountedItems.add(itemB);
        offer = new Offer();
        offer.setDiscountedItems(discountedItems);
        offer.setPrice(45);
        offerList.add(offer);

        discountedItems = new ArrayList<>();
        discountedItems.add(itemA);
        discountedItems.add(itemB);
        offer = new Offer();
        offer.setDiscountedItems(discountedItems);
        offer.setPrice(70);
        offerList.add(offer);

        discountedItems = new ArrayList<>();
        discountedItems.add(itemB);
        discountedItems.add(itemC);
        offer = new Offer();
        offer.setDiscountedItems(discountedItems);
        offer.setPrice(45);
        offerList.add(offer);
    }

    @Test
    public void print_50_when_A_is_passed() {
        itemList.add(itemA);
        assertEquals(new Integer(50), checkout.getFinalPrice(itemList, offerList));
    }

    @Test
    public void print_30_when_B_is_passed() {
        itemList.add(itemB);
        assertEquals(new Integer(30), checkout.getFinalPrice(itemList, offerList));
    }

    @Test
    public void print_70_when_A_and_B_both_passed() {
        itemList.add(itemA);
        itemList.add(itemB);
        assertEquals(new Integer(70), checkout.getFinalPrice(itemList, offerList));
    }

    @Test
    public void print_130_when_A_items_are_passed_thrice() {
        itemList.add(itemA);
        itemList.add(itemA);
        itemList.add(itemA);
        assertEquals(new Integer(130), checkout.getFinalPrice(itemList, offerList));
    }

    @Test
    public void print_45_when_B_items_are_passed_twice() {
        itemList.add(itemB);
        itemList.add(itemB);
        assertEquals(new Integer(45), checkout.getFinalPrice(itemList, offerList));
    }

    @Test
    public void print_180_when_A_items_are_passed_4_times() {
        itemList.add(itemA);
        itemList.add(itemA);
        itemList.add(itemA);
        itemList.add(itemA);
        assertEquals(new Integer(180), checkout.getFinalPrice(itemList, offerList));
    }

    @Test
    public void print_190_when_3A_and_2B_are_passed() {
        itemList.add(itemA);
        itemList.add(itemA);
        itemList.add(itemA);
        itemList.add(itemB);
        itemList.add(itemB);
        assertEquals(new Integer(190), checkout.getFinalPrice(itemList, offerList));
    }

    @Test
    public void print_215_when_items_are_passed_in_DABABA_sequence() {
        itemList.add(itemD);
        itemList.add(itemA);
        itemList.add(itemB);
        itemList.add(itemA);
        itemList.add(itemB);
        itemList.add(itemA);
        assertEquals(new Integer(215), checkout.getFinalPrice(itemList, offerList));
    }

    @Test
    public void print_70_when_items_A_and_B_are_passed() {
        itemList.add(itemA);
        itemList.add(itemB);
        assertEquals(new Integer(70), checkout.getFinalPrice(itemList, offerList));
    }

}
