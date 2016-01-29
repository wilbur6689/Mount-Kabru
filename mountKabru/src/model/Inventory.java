package model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by badgerwaves on 1/27/16.
 */
public class Inventory implements Serializable {

    private String weaponSlot;
    private String armorSlot;
    private int heathPotionSlot;
    private int manaPotionSlot;

    public Inventory(){

    }

    public String getWeaponSlot() {
        return weaponSlot;
    }

    public void setWeaponSlot(String weaponSlot) {
        this.weaponSlot = weaponSlot;
    }

    public String getArmorSlot() {
        return armorSlot;
    }

    public void setArmorSlot(String armorSlot) {
        this.armorSlot = armorSlot;
    }

    public int getPotion1Slot() {
        return heathPotionSlot;
    }

    public void setPotion1Slot(int potion1Slot) {
        this.heathPotionSlot = potion1Slot;
    }

    public int getPotion2Slot() {
        return manaPotionSlot;
    }

    public void setPotion2Slot(int potion2Slot) {
        this.manaPotionSlot = manaPotionSlot;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.weaponSlot);
        hash = 17 * hash + Objects.hashCode(this.armorSlot);
        hash = 17 * hash + this.heathPotionSlot;
        hash = 17 * hash + this.manaPotionSlot;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (this.heathPotionSlot != other.heathPotionSlot) {
            return false;
        }
        if (this.manaPotionSlot != other.manaPotionSlot) {
            return false;
        }
        if (!Objects.equals(this.weaponSlot, other.weaponSlot)) {
            return false;
        }
        return Objects.equals(this.armorSlot, other.armorSlot);
    }

    @Override
    public String toString() {
        return "Inventory{" + "weaponSlot=" + weaponSlot + ", armorSlot=" + armorSlot + ", potion1Slot=" + heathPotionSlot + ", potion2Slot=" + manaPotionSlot + '}';
    }
    
    
    
    

}
