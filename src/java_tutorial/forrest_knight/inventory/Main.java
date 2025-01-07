package java_tutorial.forrest_knight.inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

//        Item item1 = new Item("Stick", 2);
//        Item item2 = new Item("Dirt", 32);

        Weapon weapon1 = new Weapon("Sword", 1, 30,100);

        Edible food1 = new Edible("Apple", 5, 5, 10);

//        inventory.addItem(item1);
//        inventory.addItem(item2);
        inventory.addItem(weapon1);
        inventory.addItem(food1);

        inventory.displayInventory();
    }
}
