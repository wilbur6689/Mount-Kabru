/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.ActorControl;
import byui.cit260.mountKabru.control.EventControl;
import byui.cit260.mountKabru.control.WorldControl;
import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Event;
import byui.cit260.mountKabru.model.Location;
import byui.cit260.mountKabru.model.World;

import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Phill
 */
public class AttackMonsView extends View{
    
    
    
    public AttackMonsView() {
    super( "\n"
                + "\n---------------------------------------"
                + "\n|  You found a " + MountKabru.getCurrentGame().getHero().getFoundMonster().getName() + "    "
                + "\n|  "
                + "\n|  " 
                + "\n|  "
                + "\n|"
                + "\n|                                   "
                + "\n|  Prepare to fight                   "
                + "\n---------------------------------------"
                + "\nA - [A]ttack"
                + "\nD - [D]efend"
                + "\nC - [C]ast a spell"
                + "\nQ - [Q]uit back to searching"
                + "\n--------------------------------------");
    }
    
    
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        int currentMonsterHP = MountKabru.getCurrentGame().getHero().getFoundMonster().getCurrentHitPoints();
        
        
        switch (choice) {
            case "A": // attack the monster before he kills you
                this.attackMonster();
                break;
            case "D": // defend youself 
                this.defendYourself();
                break;
            case "C": // cast a spell 
                this.castSpell();
                break;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again");
             
                
             
                         
        }
        currentMonsterHP = MountKabru.getCurrentGame().getHero().getFoundMonster().getCurrentHitPoints();
        if (currentMonsterHP < 1) {
            return true;
        }
        
        return false;
    }

    private void attackMonster() {
        
        
        
        
        int attack = MountKabru.getCurrentGame().getHero().getAttack();
        int strength = MountKabru.getCurrentGame().getHero().getStrength();
        int opponentDefense = MountKabru.getCurrentGame().getHero().getFoundMonster().getDefence();
        int damageDoneToMonster = 0;
        
        try { 
         damageDoneToMonster = ActorControl.meleeDamage(attack, strength, opponentDefense);
        this.console.println("\n*** You walk over to the monster      ***"
                         + "\n*** and punch him in the gut          ***"
                         + "\n*** You do " + damageDoneToMonster + " Damage    ***");
        
        } catch (ActorControlException me) {
            this.console.println(me.getMessage());
        }
        
        int currentHP = MountKabru.getCurrentGame().getHero().getFoundMonster().getCurrentHitPoints();
        currentHP -= damageDoneToMonster;
        
        if (currentHP < 0){
            
           //say you killed the monster
           this.console.println("You defied all logic and were able to slay the monster.");
           
           //set XP
           int beforeXP = MountKabru.getCurrentGame().getHero().getExperience();
           int xpGained = MountKabru.getCurrentGame().getHero().getFoundMonster().getXpGained();
           int afterXP = beforeXP + xpGained;
           MountKabru.getCurrentGame().getHero().setExperience(afterXP);
                   
           //set Gold
           int beforeGold = MountKabru.getCurrentGame().getHero().getGold();
           int goldGained = MountKabru.getCurrentGame().getHero().getFoundMonster().getGold();
           int afterGold = beforeGold + goldGained;
           MountKabru.getCurrentGame().getHero().setGold(afterGold);
           MountKabru.getCurrentGame().getHero().getFoundMonster().setCurrentHitPoints(0);        
           
           //return back to the adventure view
            World world = MountKabru.getCurrentGame().getWorld();
        Location[][] locations = MountKabru.getCurrentGame().getWorld().getLocations();
        Event[][] events = EventControl.createEvents();
        
        for (int i=0;i<locations.length;i++) {
            for (int j=0;j<locations[i].length-1;j++) {
//                events[i][j] = locations[i][j].getEvent();
                //System.out.println(locations[i][j].getEvent().getEventType());
            }
        }
        
        
        WorldControl.setEventsToLocations(world, events);
            
        } else {
        MountKabru.getCurrentGame().getHero().getFoundMonster().setCurrentHitPoints(currentHP);
        
        this.console.println("The monster has this much life: " + currentHP);
        }
        
        
        
        
    }

    private void defendYourself() {
        this.console.println("\n*** You take a defensive stance, and gain nothing  ***");
    }

    private void castSpell() {
        int attack = 550;
        int mana = 30;
        int opponentDefense = 10;
        try {
        int result = ActorControl.spellDamage(attack, mana, opponentDefense);
        this.console.println("\n*** You walk over to the monster      ***"
                         + "\n*** and cast fireball                 ***"
                         + "\n*** You do " + result + " Damage    ***");
        
        } catch (ActorControlException me) {
            this.console.println(me.getMessage());
         }
    }

}
