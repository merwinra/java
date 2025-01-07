package java_tutorial.forrest_knight.inventory;

public class Weapon extends Item {
    private Integer damageOutput;
    private Integer durability;

    public Weapon(String name, Integer quantity, Integer damageOutput, Integer durability) {
        super(name, quantity);
        this.damageOutput = damageOutput;
        this.durability = durability;
    }

    public Integer getDamageOutput() {
        return damageOutput;
    }

    public Integer getDurability() {
        return durability;
    }

    public void setDamageOutput(Integer damageOutput) {
        this.damageOutput = damageOutput;
    }

    public void setDurability(Integer durability) {
        this.durability = durability;
    }

    @Override
    public String displayDetails() {
        return "Name: " + getName() + ", Quantity: " + getQuantity() + ", Durability: " + getDurability() +
                ", Damage Output: " + getDamageOutput();
    }
}
