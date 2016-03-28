/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.TavernControl;
import byui.cit260.mountKabru.exceptions.GameControlException;
import byui.cit260.mountKabru.exceptions.TavernControlException;
import byui.cit260.mountKabru.model.Item;
import static java.lang.Integer.parseInt;

import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Phill
 */
public class TavernView extends View{
    
   
    
    public TavernView() {
            super ("\n"
                + "\n--------------------------------------"
                + "\n|  You meander in the tavern looking |"
                + "\n|  as tough as you can.               |"  
                + "\n--------------------------------------"
                + "\nT - talk to the [T]avern owner    - Costs your dignity"
                + "\nS - get a room and [S]leep it off - Costs 250 Gold"
                + "\nH - buy a [H]ealth potion         - Costs 100 Gold"
                + "\nM - buy a [M]ana potion           - Costs 100 Gold"
                + "\nQ - return to town"
                + "\n--------------------------------------");}
    
    
    
    private String promptMessage;

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "T": // go talk to the tavern owner
                this.tavernOwner();
                break;
            case "S": // get a room in the tavern and sleep
                this.sleep();
                break;
            case "H": // buy a health potion
                this.buyHealthPotion();
                break;
            case "M": // buy a mana potion
                this.buyManaPotion();
                break;
                
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    
    
    
    
    
    
    
    
    private void tavernOwner() {
         String levelOfHeroString;
         int levelOfHero;
         try{
         
         this.console.println("What level are you, hero?");
         levelOfHeroString = this.keyboard.readLine();
         levelOfHero = parseInt(levelOfHeroString);

             String result = TavernControl.ownerResponse(levelOfHero);
             this.console.println("\n*** You walk over to the Tavern Owner ***"
                     + "\n*** and ask him for advise:           ***"
                     + "\n "
                     + "\n " + result);
         } catch (Exception e) {
             this.console.println(e.getMessage());
         }

    }
          
    private void sleep() {
        
        int maxHP = MountKabru.getCurrentGame().getHero().getMaxHitPoints();
        int goldBefore = MountKabru.getCurrentGame().getHero().getGold();
        Item[] items = MountKabru.getCurrentGame().getItems();
        String response;
        
        
        
        if (goldBefore < 250) {
            response = "\n Sorry you do not have enough gold";
            
        } else {
            int goldAfter = goldBefore - 250;
            MountKabru.getCurrentGame().getHero().setGold(goldAfter);
            response = "\n you sleep well and feel refreshed ";
            MountKabru.getCurrentGame().getHero().setCurrentHitPoints(maxHP);
        }
        
        this.console.println(response);
    }

    private void buyHealthPotion() {
        
        int hPotion = MountKabru.getCurrentGame().getHero().getInventory().getHealthPotionSlot().getHealthValue();
        
        if (hPotion == 10) {
            this.console.println("Sorry, but you already have a potion.");
        } else {
            MountKabru.getCurrentGame().getHero().getInventory().setHealthPotionSlot(Item.healthPotion10);
            this.console.println("Thank you for buying a health Potion");
        }
    }

    private void buyManaPotion() {
       

    }
}
