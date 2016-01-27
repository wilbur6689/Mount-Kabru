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
}
