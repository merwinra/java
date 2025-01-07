package java_tutorial.forrest_knight.inventory;

public abstract class Item {
    final private String name;
    private Integer quantity;

    public Item(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer number) {
        quantity = number;
    }

    public abstract String displayDetails();
}
