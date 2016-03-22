/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Item;
import mountkabru.MountKabru;

/**
 *
 * @author Phill
 */
public class BuyFromBlacksmithView extends View {
    
    public BuyFromBlacksmithView() {
           super( "\n"
                + "\n--------------------------------------"
                + "\n|  What would you like to buy?        |"
                + "\n|                                     |"
                + "\n--------------------------------------"
                + "\nS - [S]word"
                + "\nA - [A]rmor"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "S": // Buy weapons and armor from the blacksmith
                this.buyWeapon();
                break;
            case "A": // Sell your weapons or armor to the blacksmith
                this.buyArmor();
                break;
                        
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void buyWeapon() {
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.kukri);
        
        System.out.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
             
             
    }

    private void buyArmor() {
         MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.scaleMail);
         
         System.out.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }
}
