package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Item;
import mountkabru.MountKabru;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class InventoryControl {
    
    
    public static Inventory createInventory() {
        
        
        Inventory inventory = new Inventory(Item.bareHands, Item.clothes, Item.healthPotion10 , Item.manaPotion10);
        
        
         MountKabru.getCurrentGame().getHero().setInventory(inventory);
         int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();
         int defense = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getDefenceValue();
         MountKabru.getCurrentGame().getHero().setAttack(attack);
         MountKabru.getCurrentGame().getHero().setDefence(defense);
         
         
        
        return inventory;
    }
    
    public static String[] viewInventory() {
        
        String[] inventory = new String[4];
        
        inventory[0] = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getName();
        inventory[1] = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getName();
        inventory[2] = MountKabru.getCurrentGame().getHero().getInventory().getHealthPotionSlot().getName();
        inventory[3] = MountKabru.getCurrentGame().getHero().getInventory().getManaPotionSlot().getName();
        
        return inventory;
    }
    
    
}
