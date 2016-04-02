/**
 * Created by Badgero1234 on 3/29/16.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Item;
import mountkabru.MountKabru;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;

public class BuyFromSpellCaster extends View {

    public BuyFromSpellCaster() {
        super("\n"
                + "------------------------------------------------------------------"
                + "\n       -Spells Available to Purchase-                             "
                + "\n 1 - Roaring Winds    : 300g"
                + "\n 2 - Summon Demons    :1000g"
                + "\n 3 - Roaring Waters   :3000g"
                + "\n 4 - Hell Fire        :7000g"
                + "\n"
                + "\n----------------------------------------------------------------"
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
        } catch (NumberFormatException nf) {
            this.console.println("\n You must enter a value number");
        }

        switch (realNumber) {
            case 1: // Buy weapons and armor from the blacksmith
                this.buyRoaringWinds();
                break;
            case 2: // Sell your weapons or armor to the blacksmith
                this.buySummonDemons();
                break;
            case 3: // Buy weapons and armor from the blacksmith
                this.buyRoaringWaters();
                break;
            case 4: // Sell your weapons or armor to the blacksmith
                this.buyHellFire();
                break;

            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void buyRoaringWinds() {
        int cost = 300;
        int gold = MountKabru.getCurrentGame().getHero().getGold();

        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else {
            this.console.println("Sorry, you don't have enough gold.");
        }

        MountKabru.getCurrentGame().getHero().getInventory().setSpellSlot(Item.roaringWinds);

        int spellAttack = MountKabru.getCurrentGame().getHero().getInventory().getSpellSlot().getSpellAttackValue();
        MountKabru.getCurrentGame().getHero().setSpellAttack(spellAttack);
        this.console.println("Its been a pleasure to serve you"
                + "\nThank you for your Business ");

    }

    private void buySummonDemons() {
        int cost = 1000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();

        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else {
            this.console.println("Sorry, you don't have enough gold.");
        }

        MountKabru.getCurrentGame().getHero().getInventory().setSpellSlot(Item.summonDemons);
        int spellAttack = MountKabru.getCurrentGame().getHero().getInventory().getSpellSlot().getSpellAttackValue();
        MountKabru.getCurrentGame().getHero().setSpellAttack(spellAttack);
        //this.console.println(MountKabru.getHero().getAttack());
        this.console.println("Its been a pleasure to serve you"
                + "\nThank you for your Business ");

    }

    private void buyRoaringWaters() {
        int cost = 3000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();

        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else {
            this.console.println("Sorry, you don't have enough gold.");
        }

        MountKabru.getCurrentGame().getHero().getInventory().setSpellSlot(Item.roaringWaters);
        int spellAttack = MountKabru.getCurrentGame().getHero().getInventory().getSpellSlot().getSpellAttackValue();
        MountKabru.getCurrentGame().getHero().setSpellAttack(spellAttack);
        this.console.println("Its been a pleasure to serve you"
                + "\nThank you for your Business ");

    }

    private void buyHellFire() {
        int cost = 7000;
        int gold = MountKabru.getCurrentGame().getHero().getGold();

        if (gold > cost) {
            gold -= cost;
            MountKabru.getCurrentGame().getHero().setGold(gold);
        } else {
            this.console.println("Sorry, you don't have enough gold.");
        }
        MountKabru.getCurrentGame().getHero().getInventory().setSpellSlot(Item.hellFire);
        int spellAttack = MountKabru.getCurrentGame().getHero().getInventory().getSpellSlot().getSpellAttackValue();
        MountKabru.getCurrentGame().getHero().setSpellAttack(spellAttack);
        this.console.println("Its been a pleasure to serve you"
                + "\nThank you for your Business ");

    }

}
