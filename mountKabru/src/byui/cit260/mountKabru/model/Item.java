package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 * Created by Badgero1234 on 1/28/16.
 */
public class Item implements Serializable{

    private String name;
    private int attackValue;
    private int defenceValue;
    private int costValue;
    private int sellValue;
    private int manaValue;
    private int healthValue;




    public Item() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getDefenceValue() {
        return defenceValue;
    }

    public void setDefenceValue(int defenceValue) {
        this.defenceValue = defenceValue;
    }

    public int getCostValue() {
        return costValue;
    }

    public void setCostValue(int costValue) {
        this.costValue = costValue;
    }

    public int getSellValue() {
        return sellValue;
    }

    public void setSellValue(int sellValue) {
        this.sellValue = sellValue;
    }

    public int getManaValue() {
        return manaValue;
    }

    public void setManaValue(int manaValue) {
        this.manaValue = manaValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (attackValue != item.attackValue) return false;
        if (defenceValue != item.defenceValue) return false;
        if (costValue != item.costValue) return false;
        if (sellValue != item.sellValue) return false;
        if (manaValue != item.manaValue) return false;
        if (healthValue != item.healthValue) return false;
        return name.equals(item.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + attackValue;
        result = 31 * result + defenceValue;
        result = 31 * result + costValue;
        result = 31 * result + sellValue;
        result = 31 * result + manaValue;
        result = 31 * result + healthValue;
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", attackValue=" + attackValue +
                ", defenceValue=" + defenceValue +
                ", costValue=" + costValue +
                ", sellValue=" + sellValue +
                ", manaValue=" + manaValue +
                ", healthValue=" + healthValue +
                '}';
    }
}
