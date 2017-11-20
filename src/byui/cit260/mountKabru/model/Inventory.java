
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
    private List<Item> items;
    private Hero hero;

    public Inventory(){
    }

    public Inventory(Item weaponSlot, Item armorSlot, Item spellSlot, Item healthPotionSlot, Item manaPotionSlot, List<Item> items, Hero hero) {
        this.weaponSlot = weaponSlot;
        this.armorSlot = armorSlot;
        this.spellSlot = spellSlot;
        this.healthPotionSlot = healthPotionSlot;
        this.manaPotionSlot = manaPotionSlot;
        this.items = items;
        this.hero = hero;
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

    public Item getSpellSlot() {
        return spellSlot;
    }

    public void setSpellSlot(Item spellSlot) {
        this.spellSlot = spellSlot;
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Inventory inventory = (Inventory) object;

        if (weaponSlot != null ? !weaponSlot.equals(inventory.weaponSlot) : inventory.weaponSlot != null) return false;
        if (armorSlot != null ? !armorSlot.equals(inventory.armorSlot) : inventory.armorSlot != null) return false;
        if (spellSlot != null ? !spellSlot.equals(inventory.spellSlot) : inventory.spellSlot != null) return false;
        if (healthPotionSlot != null ? !healthPotionSlot.equals(inventory.healthPotionSlot) : inventory.healthPotionSlot != null)
            return false;
        if (manaPotionSlot != null ? !manaPotionSlot.equals(inventory.manaPotionSlot) : inventory.manaPotionSlot != null)
            return false;
        if (items != null ? !items.equals(inventory.items) : inventory.items != null) return false;
        if (hero != null ? !hero.equals(inventory.hero) : inventory.hero != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (weaponSlot != null ? weaponSlot.hashCode() : 0);
        result = 31 * result + (armorSlot != null ? armorSlot.hashCode() : 0);
        result = 31 * result + (spellSlot != null ? spellSlot.hashCode() : 0);
        result = 31 * result + (healthPotionSlot != null ? healthPotionSlot.hashCode() : 0);
        result = 31 * result + (manaPotionSlot != null ? manaPotionSlot.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        result = 31 * result + (hero != null ? hero.hashCode() : 0);
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Inventory{" +
                "weaponSlot=" + weaponSlot +
                ", armorSlot=" + armorSlot +
                ", spellSlot=" + spellSlot +
                ", healthPotionSlot=" + healthPotionSlot +
                ", manaPotionSlot=" + manaPotionSlot +
                ", items=" + items +
                ", hero=" + hero +
                '}';
    }
}


    