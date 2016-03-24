package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Item;
import mountkabru.MountKabru;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class InventoryControl {
    
    
    public static Inventory createInventory() {
        
        
        Inventory inventory = new Inventory(Item.bareHands, Item.clothes, null, null);
        
        
         MountKabru.getCurrentGame().getHero().setInventory(inventory);
        
        return inventory;
    }
    
    public static void viewInventory() {
        
        String weapon = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getName();
        String armor = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getName();
        String health = MountKabru.getCurrentGame().getHero().getInventory().getHealthPotionSlot().getName();
        String mana = MountKabru.getCurrentGame().getHero().getInventory().getManaPotionSlot().getName();
        
        System.out.println("Here is your Inventory "
                        + "\n Weapon        = " + weapon
                        + "\n Armor         = " + armor
                        + "\n Health Potion = " + health
                        + "\n Mana Potion   = " + mana
                        + "\n");
    }
    
}
