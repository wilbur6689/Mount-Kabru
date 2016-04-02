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
                break;
            case 2: // Sell your weapons or armor to the blacksmith
                this.buyLeather();
                break;
            case 3: // Buy weapons and armor from the blacksmith
                this.buyStudded();
                break;
            case 4: // Sell your weapons or armor to the blacksmith
                this.buyChain();
                break;
            case 5: // Buy weapons and armor from the blacksmith
                this.buyBreastPlate();
                break;
            case 6: // Sell your weapons or armor to the blacksmith
                this.buyCuirasses();
                break;
            case 7: // Buy weapons and armor from the blacksmith
                this.buyScale();
                break;
            case 8: // Sell your weapons or armor to the blacksmith
                this.buySteelHalf();
            case 9: // Sell your weapons or armor to the blacksmith
                this.buySteelFull();
                break;
            case 10: // Buy weapons and armor from the blacksmith
                this.buyCarbon();
                break;
            case 11: // Sell your weapons or armor to the blacksmith
                this.buyDiamondHalf();
                break;
            case 12: // Buy weapons and armor from the blacksmith
                this.buyDiamondFull();
                break;
            case 13: // Sell your weapons or armor to the blacksmith
                this.buyDragonBone();
                break;
                        
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
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.thickGarment);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyLeather() {
        int cost = Item.leatherArmor.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.leatherArmor);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyStudded() {
        int cost = Item.studdedLeatherArmor.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.studdedLeatherArmor);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyChain() {
        int cost = Item.chainMail.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.chainMail);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyBreastPlate() {
        int cost = Item.breastPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.breastPlate);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyCuirasses() {
        int cost = Item.cuirasses.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.cuirasses);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyScale() {
        int cost = Item.scaleMail.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.scaleMail);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buySteelHalf() {
        int cost = Item.steelHalfPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.steelHalfPlate);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buySteelFull() {
        int cost = Item.steelFullPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.steelFullPlate);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }
    
    private void buyCarbon() {
        int cost = Item.carbonFiber.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.carbonFiber);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyDiamondHalf() {
        int cost = Item.diamondHalfPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.diamondHalfPlate);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyDiamondFull() {
        int cost = Item.diamondFullPlate.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.diamondFullPlate);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyDragonBone() {
        int cost = Item.dragonBoneArmor.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.dragonBoneArmor);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }
    
    
}
