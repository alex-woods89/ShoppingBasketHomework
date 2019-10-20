package shoppingbasket;

import shoppingbasket.items.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingBasket {
    ArrayList<Item> items;
    ArrayList<Item> discountedItems;

    public ShoppingBasket(){
        this.items = new ArrayList<Item>();
        this.discountedItems = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getItemsCount() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int index) {
        items.remove(index);
    }

    public void removeAllItems() {
        items.clear();
    }

    public double getTotalValue() {
        double total = 0;
        for(Item item : items){
          total += item.getValue();
        }
        return total;
    }

    public ArrayList<Item> createUniqueArray() {
        ArrayList<Item> uniqueArray = new ArrayList<Item>();
        for (Item item : items) {
            if (!uniqueArray.contains(item)) {
                uniqueArray.add(item);

            }
        }
        return items = uniqueArray;
    }

    public ArrayList<Item> getDiscountedItems(){
        return this.discountedItems;
    }

    public double getTotalAfterDiscount() {
        double total = 0;
        for(Item item : discountedItems){
            total += item.getValue();
        }
        return total;
    }
}
