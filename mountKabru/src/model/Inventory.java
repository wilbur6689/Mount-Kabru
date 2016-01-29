package model;

import java.io.Serializable;

/**
 * Created by badgerwaves on 1/27/16.
 */
public class Inventory implements Serializable {

    private int weaponSlot;
    private int armorSlot;
    private int potion1Slot;
    private int potion2Slot;

    public Inventory(){

    }


    public int getWeaponSlot() {
        return weaponSlot;
    }

    public void setWeaponSlot(int weaponSlot) {
        this.weaponSlot = weaponSlot;
    }

    public int getArmorSlot() {
        return armorSlot;
    }

    public void setArmorSlot(int armorSlot) {
        this.armorSlot = armorSlot;
    }

    public int getPotion1Slot() {
        return potion1Slot;
    }

    public void setPotion1Slot(int potion1Slot) {
        this.potion1Slot = potion1Slot;
    }

    public int getPotion2Slot() {
        return potion2Slot;
    }

    public void setPotion2Slot(int potion2Slot) {
        this.potion2Slot = potion2Slot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inventory inventory = (Inventory) o;

        if (weaponSlot != inventory.weaponSlot) return false;
        if (armorSlot != inventory.armorSlot) return false;
        if (potion1Slot != inventory.potion1Slot) return false;
        return potion2Slot == inventory.potion2Slot;

    }

    @Override
    public int hashCode() {
        int result = weaponSlot;
        result = 31 * result + armorSlot;
        result = 31 * result + potion1Slot;
        result = 31 * result + potion2Slot;
        return result;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "weaponSlot=" + weaponSlot +
                ", armorSlot=" + armorSlot +
                ", potion1Slot=" + potion1Slot +
                ", potion2Slot=" + potion2Slot +
                '}';
    }
}
