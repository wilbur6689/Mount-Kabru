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
public class BuyFromBlacksmithView extends View {
    
    public BuyFromBlacksmithView() {
           super( "\n"
                + "\n----------------------------------------------------------------"
                + "\n|                                                              |"
                + "\n|    / \\                   __ ________ __                      |"
                + "\n|    | |    Weapons:      /  /        \\  \\      Armor:         |"
                + "\n|    | |  1. Stick        |  |   __   |  |    5. Leather       |"
                + "\n|    | |  2. Kukri        |__|  |  |  |__|    6. Scale Mail    |"
                + "\n|    | |  3. Battle Axe      |  |__|  |       7. Carbon Fiber  |"
                + "\n|    |_|  4. Scythe           \\      /        8. Dragon Bone   |"
                + "\n|   < _ >                    | \\    / |                        |"
                + "\n|    {_}                     |  \\__/  |                        |"
                + "\n|                            |  |  |  |                        |"
                + "\n---------------------------------------------------------------"
                + "\n Please Enter the Number of the item you wish to purchase"
                + "\n Your Gold = " + MountKabru.getCurrentGame().getHero().getGold()
                + "\nQ - [Q]uit"
                + "\n---------------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        int realNumber = 0; 
        
        try {
        realNumber = parseInt(value);
        } catch(NumberFormatException nf) {
            this.console.println("\n You must enter a value number");
        }
        
        switch (realNumber) {
            case 1: // Buy weapons and armor from the blacksmith
                this.buyStick();
                break;
            case 2: // Sell your weapons or armor to the blacksmith
                this.buyKukri();
                break;
            case 3: // Buy weapons and armor from the blacksmith
                this.buyAxe();
                break;
            case 4: // Sell your weapons or armor to the blacksmith
                this.buyScythe();
                break;
            case 5: // Buy weapons and armor from the blacksmith
                this.buyLeather();
                break;
            case 6: // Sell your weapons or armor to the blacksmith
                this.buyScaleMail();
                break;
            case 7: // Buy weapons and armor from the blacksmith
                this.buyFiber();
                break;
            case 8: // Sell your weapons or armor to the blacksmith
                this.buyBone();
                break;
                        
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }


    private void buyStick() {
        int cost = 300;
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.stick);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
        
           
        
    }

    private void buyKukri() {
        int cost = 1000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.kukri);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
        
        
    }

    private void buyAxe() {
        int cost = 3000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.battleAxe);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
        
        
    }

    private void buyScythe() {
        int cost = 7000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.scythe);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
        
        
    }

    private void buyLeather() {
        int cost = 300;
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.leatherArmor);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
        
         
    }

    private void buyScaleMail() {
        int cost = 1000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.scaleMail);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
        
        
    }

    private void buyFiber() {
        int cost = 3000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.carbonFiber);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
        
        
    }

    private void buyBone() {
        int cost = 7000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.dragonBoneArmor);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
        
        
    }
}
