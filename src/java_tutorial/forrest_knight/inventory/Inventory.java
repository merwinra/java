package java_tutorial.forrest_knight.inventory;

import java.util.ArrayList;

public class Inventory {
    final private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInventory() {
        for (Item item : items) {
            System.out.println(item.displayDetails());
        }
    }
}
