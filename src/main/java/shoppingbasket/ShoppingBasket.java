package shoppingbasket;

import shoppingbasket.items.Item;

import java.util.ArrayList;

public class ShoppingBasket {
    ArrayList<Item> items;

    public ShoppingBasket(){
        this.items = new ArrayList<Item>();
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
}
