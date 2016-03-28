/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Item;
import mountkabru.MountKabru;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Phill
 */
public class SellToBlacksmithView extends View {

    public SellToBlacksmithView() {
        super("\n"
                + "\n----------------------------------------------------------------"
                + "\n|        You Current Weapon to sell:                           |"
                + "\n|" + MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getName() + "       " + MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getSellValue() + "|"
                + "\n|                                                              |"
                + "\n|                                                              |"
                + "\n|                                                              |"
                + "\n|              Your Current Armor to sell:                                            |"
                + "\n|" + MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getName() + "       " + MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getSellValue() + "|"
                + "\n|                                                              |"
                + "\n|                                                              |"
                + "\n|                                                              |"
                + "\n---------------------------------------------------------------"
                + "\n Please Enter the Number of the item you wish to sell"
                + "\n Your Gold = " + MountKabru.getCurrentGame().getHero().getGold()
                + "\nQ - [Q]uit"
                + "\n---------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        int realNumber = 0;

        try {
            realNumber = parseInt(value);
        } catch (NumberFormatException nf) {
            this.console.println("\n You must enter a value number");
        }

        switch (realNumber) {
            case 1: // sell weapons and armor from the blacksmith
                this.sellWeapon();
                break;
            case 2: // Sell your weapons or armor to the blacksmith
                this.sellArmor();
                break;


            default:
                this.console.println("\n*** Invalid selection *** Try again");


        }
        return false;
    }


    private void sellWeapon() {
        int sellValue = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getSellValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();

        if (gold > sellValue) {
            gold += sellValue;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else {
            MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.bareHands);
        }
        this.console.println("It has been a pleasure doing business with you, bring me more items you don't want.");

    }


    private void sellArmor() {
        int sellValue = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getSellValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();

        if (gold > sellValue) {
            gold += sellValue;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else {
            MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.clothes);
        }
        this.console.println("It has been a pleasure doing business with you, bring me more items you don't want.");
    }

}


    
    
    
    
    
    

