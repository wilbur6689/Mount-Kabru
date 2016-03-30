package byui.cit260.mountKabru.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by badgerwaves on 1/27/16.
 */
public class Inventory implements Serializable {

    private Item weaponSlot;
    private Item armorSlot;
    private Item spellSlot;
    private Item healthPotionSlot;
    private Item manaPotionSlot;
    
    private Hero hero;

    public Inventory(){
    }

    public Inventory(Item weaponSlot, Item armorSlot, Item spellSlot, Item healthPotionSlot, Item manaPotionSlot, Hero hero) {
        this.weaponSlot = weaponSlot;
        this.armorSlot = armorSlot;
        this.spellSlot = spellSlot;
        this.healthPotionSlot = healthPotionSlot;
        this.manaPotionSlot = manaPotionSlot;

    }



    public Item getSpellSlot() {
        return spellSlot;
    }

    public void setSpellSlot(Item spellSlot) {
        this.spellSlot = spellSlot;
    }

    public Item getWeaponSlot() {
        return weaponSlot;
    }

    public void setWeaponSlot(Item weaponSlot) {
        this.weaponSlot = weaponSlot;
    }

    public Item getArmorSlot() {
        return armorSlot;
    }

    public void setArmorSlot(Item armorSlot) {
        this.armorSlot = armorSlot;
    }

    public Item getHealthPotionSlot() {
        return healthPotionSlot;
    }

    public void setHealthPotionSlot(Item healthPotionSlot) {
        this.healthPotionSlot = healthPotionSlot;
    }

    public Item getManaPotionSlot() {
        return manaPotionSlot;
    }

    public void setManaPotionSlot(Item manaPotionSlot) {
        this.manaPotionSlot = manaPotionSlot;
    }
    

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.weaponSlot);
        hash = 37 * hash + Objects.hashCode(this.armorSlot);
        hash = 37 * hash + Objects.hashCode(this.healthPotionSlot);
        hash = 37 * hash + Objects.hashCode(this.manaPotionSlot);
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
        if (this.weaponSlot != other.weaponSlot) {
            return false;
        }
        if (this.armorSlot != other.armorSlot) {
            return false;
        }
        if (this.healthPotionSlot != other.healthPotionSlot) {
            return false;
        }
        if (this.manaPotionSlot != other.manaPotionSlot) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Inventory{" + "weaponSlot=" + weaponSlot + ", armorSlot=" + armorSlot + ", healthPotionSlot=" + healthPotionSlot + ", manaPotionSlot=" + manaPotionSlot + '}';
    }
    
    

}


    