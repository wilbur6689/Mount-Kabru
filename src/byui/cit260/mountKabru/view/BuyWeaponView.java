/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Item;
import static java.lang.Integer.parseInt;
import mountkabru.MountKabru;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;

/**
 *
 * @author wibur
 */
public class BuyWeaponView extends View{

    public BuyWeaponView() {
        super( "\n"
                + "\n--------------------------------------------------------------------------------------------"
                + "\n|                                                                           "
                + "\n|    / \\                                                 "
                + "\n|    | |     Weapons:             Cost:       Attack:             "
                + "\n|    | |     1. Stick             300g        20    "
                + "\n|    | |     2. Club              600g        30   "
                + "\n|    | |     3. Dagger            1000g       40    "
                + "\n|    |_|     4. Mace              1500g       50    "
                + "\n|   < _ >    5. Short Sword       2000g       60             "
                + "\n|    {_}     6. Kukri             2500g       70      "
                + "\n|            7. Rapier            3000g       80"
                + "\n|     _      8. Axe               3500g       90"
                + "\n|    { }     9. Long Sword        4000g       100"
                + "\n|    { }     10. Claymore         5000g       110"
                + "\n|    { }     11. Battle Axe       6000g       120"
                + "\n|    { }     12. Scythe           7000g       130"
                + "\n|   /| |\\    13. War Hammer      10000g       150"
                + "\n|   \\|_|/                     "
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
                this.buyStick();
                break;
            case 2: // Sell your weapons or armor to the blacksmith
                this.buyClub();
                break;
            case 3: // Buy weapons and armor from the blacksmith
                this.buyDagger();
                break;
            case 4: // Sell your weapons or armor to the blacksmith
                this.buyMace();
                break;
            case 5: // Buy weapons and armor from the blacksmith
                this.buyShortSword();
                break;
            case 6: // Sell your weapons or armor to the blacksmith
                this.buyKukri();
                break;
            case 7: // Buy weapons and armor from the blacksmith
                this.buyRapier();
                break;
            case 8: // Sell your weapons or armor to the blacksmith
                this.buyAxe();
            case 9: // Sell your weapons or armor to the blacksmith
                this.buyLongSword();
                break;
            case 10: // Buy weapons and armor from the blacksmith
                this.buyClaymore();
                break;
            case 11: // Sell your weapons or armor to the blacksmith
                this.buyBattleAxe();
                break;
            case 12: // Buy weapons and armor from the blacksmith
                this.buyScythe();
                break;
            case 13: // Sell your weapons or armor to the blacksmith
                this.buyWarHammer();
                break;
                        
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
        
    }

    private void buyStick() {
        int cost = Item.stick.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.stick);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyClub() {
        int cost = Item.club.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.club);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyDagger() {
        int cost = Item.dagger.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.dagger);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyMace() {
        int cost = Item.mace.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.mace);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyShortSword() {
        int cost = Item.shortSword.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.shortSword);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyKukri() {
        int cost = Item.kukri.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.kukri);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyRapier() {
        int cost = Item.rapier.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.rapier);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyAxe() {
        int cost = Item.axe.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.axe);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyLongSword() {
        int cost = Item.longSword.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.longSword);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyClaymore() {
        int cost = Item.claymore.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.claymore);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyBattleAxe() {
        int cost = Item.battleAxe.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.battleAxe);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }
    
    private void buyScythe() {
        int cost = Item.scythe.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.scythe);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }

    private void buyWarHammer() {
        int cost = Item.warHammer.getCostValue();
        int gold = MountKabru.getCurrentGame().getHero().getGold();
        
        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else { this.console.println("Sorry, you dont have enough gold.");}
        
        MountKabru.getCurrentGame().getHero().getInventory().setWeaponSlot(Item.warHammer);
        int attack = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getAttackValue();

        MountKabru.getCurrentGame().getHero().setAttack(attack);
        this.console.println("Its been a pleasure to serve you"
                        + "\nThank you for your Business ");
    }
    
    
}
