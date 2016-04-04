/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Item;
import static java.lang.Integer.parseInt;
import mountkabru.MountKabru;

/**
 *
 * @author wibur
 */
public class BuyArmorView extends View{

    public BuyArmorView() {
        super( "\n"
                + "\n--------------------------------------------------------------------------------------------"
                + "\n|                                                                           "
                + "\n|      __ ________ __                              "
                + "\n|     /  /        \\  \\      Armor:                    Cost:        Defense:"
                + "\n|    |  ||   __   ||  |     1. Thick Garment           300g         10"
                + "\n|    |__||  |  |  ||__|     2. Leather                 600g         20"
                + "\n|        |  |__|  |         3. Studded Leather         1000g        30"
                + "\n|         \\      /          4. Chain Mail              1500g        40"
                + "\n|        | \\    / |         5. Breast Plate            2000g        50"
                + "\n|        |  \\__/  |         6. Cuirasses               2500g        60"
                + "\n|        |  |  |  |         7. Scale Mail              3000g        70"
                + "\n|        |  |  |  |         8. Steel Half Plate        3500g        80"
                + "\n|        |__|  |__|         9. Steel Full Plate        4000g        90"
                + "\n|                           10. Carbon Fiber           5000g        100"
                + "\n|                           11. Diamond Half Plate     6000g        110"
                + "\n|                           12. Diamond Full Plate     7000g        120"
                + "\n|                           13. Dragon Bone            10000g       150"
                + "\n|"
                + "\n--------------------------------------------------------------------------------------------"
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
                this.buyThick();
                return true;
            case 2: // Sell your weapons or armor to the blacksmith
                this.buyLeather();
                return true;
            case 3: // Buy weapons and armor from the blacksmith
                this.buyStudded();
                return true;
            case 4: // Sell your weapons or armor to the blacksmith
                this.buyChain();
                return true;
            case 5: // Buy weapons and armor from the blacksmith
                this.buyBreastPlate();
                return true;
            case 6: // Sell your weapons or armor to the blacksmith
                this.buyCuirasses();
                return true;
            case 7: // Buy weapons and armor from the blacksmith
                this.buyScale();
                return true;
            case 8: // Sell your weapons or armor to the blacksmith
                this.buySteelHalf();
                return true;
            case 9: // Sell your weapons or armor to the blacksmith
                this.buySteelFull();
                return true;
            case 10: // Buy weapons and armor from the blacksmith
                this.buyCarbon();
                return true;
            case 11: // Sell your weapons or armor to the blacksmith
                this.buyDiamondHalf();
                return true;
            case 12: // Buy weapons and armor from the blacksmith
                this.buyDiamondFull();
                return true;
            case 13: // Sell your weapons or armor to the blacksmith
                this.buyDragonBone();
                return true;
                        
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
        
    }

    private void buyThick() {
        int cost = Item.thickGarment.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.thickGarment);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "
                        + "\n"
                        + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()
                        + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyLeather() {
        int cost = Item.leatherArmor.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.leatherArmor);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business " 
                        + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyStudded() {
        int cost = Item.studdedLeatherArmor.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.studdedLeatherArmor);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyChain() {
        int cost = Item.chainMail.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.chainMail);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyBreastPlate() {
        int cost = Item.breastPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.breastPlate);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyCuirasses() {
        int cost = Item.cuirasses.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.cuirasses);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyScale() {
        int cost = Item.scaleMail.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.scaleMail);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buySteelHalf() {
        int cost = Item.steelHalfPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.steelHalfPlate);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buySteelFull() {
        int cost = Item.steelFullPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.steelFullPlate);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }
    
    private void buyCarbon() {
        int cost = Item.carbonFiber.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.carbonFiber);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyDiamondHalf() {
        int cost = Item.diamondHalfPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.diamondHalfPlate);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyDiamondFull() {
        int cost = Item.diamondFullPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.diamondFullPlate);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }

    private void buyDragonBone() {
        int cost = Item.dragonBoneArmor.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setArmorSlot(Item.dragonBoneArmor);
        int defense = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getDefenseValue();

        MountKabru.getCurrentGame().getHero().setDefense(defense);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business "                        
                + "\n"                        
                + "\n Your attack is now:   " + MountKabru.getCurrentGame().getHero().getAttack()                        
                + "\n Your Defense is now:  " + MountKabru.getCurrentGame().getHero().getDefense());
    }
    
    
}
