package java_tutorial.forrest_knight.inventory;

public class Edible extends Item {
    final private Integer hungerSatiateValue;
    final private Integer healthReplenishValue;

    public Edible(String name, Integer quantity, Integer hungerSatiateValue, Integer healthReplenishValue) {
        super(name, quantity);
        this.hungerSatiateValue = hungerSatiateValue;
        this.healthReplenishValue = healthReplenishValue;
    }

    public Integer getHungerSatiateValue() {
        return hungerSatiateValue;
    }

    public Integer getHealthReplenishValue() {
        return healthReplenishValue;
    }

    @Override
    public String displayDetails() {
        return "Name: " + getName() + ", Quantity: " + getQuantity() + ", Hunger Satiated: " + getHungerSatiateValue() +
                ", Health Replenished: " + getHealthReplenishValue();
    }
}
