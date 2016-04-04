/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.ActorControl;
import byui.cit260.mountKabru.control.EventControl;
import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.control.WorldControl;
import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.model.Event;
import byui.cit260.mountKabru.model.Location;
import byui.cit260.mountKabru.model.World;

import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Phill
 */
public class AttackMonsView extends View {

    public AttackMonsView() {
        super("\n"
                + "\n---------------------------------------"
                + "\n|  You found " + MountKabru.getCurrentGame().getHero().getFoundMonster().getName() + "    "
                + "\n|  "
                + "\n|  it has this much life: " + MountKabru.getCurrentGame().getHero().getFoundMonster().getCurrentHitPoints()
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
                if (MountKabru.getCurrentGame().isEndOfGame()){
                    return true;
                }
                
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
        int opponentDefense = MountKabru.getCurrentGame().getHero().getFoundMonster().getDefense();
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

        if (currentHP < 0) {

            //say you killed the monster
            this.console.println("You defied all logic and were able to slay the monster.");

            //set XP
            int beforeXP = MountKabru.getCurrentGame().getHero().getExperience();
            int xpGained = MountKabru.getCurrentGame().getHero().getFoundMonster().getXpGained();
            int afterXP = beforeXP + xpGained;
            MountKabru.getCurrentGame().getHero().setExperience(afterXP);
            int xpToNextLevel = MountKabru.getCurrentGame().getHero().getXpToNextLevel();

            if (afterXP > xpToNextLevel) {
                GameControl.raiseTheLevel();
                this.console.println("\nYou have worked hard and Gained a Level!!!"
                                   + "\n you are now level: " + MountKabru.getCurrentGame().getHero().getLevelOfHero());
            }

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

            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations[i].length - 1; j++) {
//                events[i][j] = locations[i][j].getEvent();
                    //System.out.println(locations[i][j].getEvent().getEventType());
                }
            }

            WorldControl.setEventsToLocations(world, events);

        } else {
            MountKabru.getCurrentGame().getHero().getFoundMonster().setCurrentHitPoints(currentHP);
            this.console.println("The monster has this much life: " + currentHP);
            
            //Monster attacks you back
            
            int monsAttack = MountKabru.getCurrentGame().getHero().getFoundMonster().getAttack();
            int spellAttack = MountKabru.getCurrentGame().getHero().getFoundMonster().getSpellAttack();
            int playerDef = MountKabru.getCurrentGame().getHero().getDefense();
            int beforeHP = MountKabru.getCurrentGame().getHero().getCurrentHitPoints();
            
            int monsDamage = ActorControl.monsterAttack(spellAttack, monsAttack, playerDef);
            int afterHP = beforeHP - monsDamage;
            
            this.console.println("\n--------------------------------------------------"
                               + "\n               You were attacked!!!"
                               + "\n--------------------------------------------------"
                               + "\n"
                               + "\n  the " + MountKabru.getCurrentGame().getHero().getFoundMonster().getName()
                               + "\n  hit you for " + monsDamage + " Damage!"
                               + "\n  "
                               + "\n  You now have " + afterHP + " Hit Points");
            
            
            if (afterHP <1) {
                //hero dies and its GAME OVER
                //load the Main Menu
                MountKabru.getCurrentGame().setEndOfGame(true);
                this.console.println("\n"
                        + "\n ---------------------------------------------------------------------"
                        + "\n"
                        + "\n   You are fighting bravely but your weapon is getting heavy..."
                        + "\n"
                        + "\n   You try to catch your breath...      "
                        + "\n   "
                        + "\n   you slowly loose your sight and feel something bash you in the head..."
                        + "\n"
                        + "\n   Sorry, you died"
                        + "\n                                    _"
                        + "\n                                   { }" 
                        + "\n                                   { }"
                        + "\n                                 __{ }__"
                        + "\n                                 \\_____/"
                        + "\n         __                        | |   "
                        + "\n        /  \\                       | | "
                        + "\n       /    \\____ ________         | |         ______"
                        + "\n   ___/__/\\     |    |____\\        | |        /   _0 \\ "
                        + "\n  /_____/  \\____|_________/Mmn~    |_|    ~nmM\\____0_/"
                        + "\n");
                
                return;
            }
            
            MountKabru.getCurrentGame().getHero().setCurrentHitPoints(afterHP);
            
            
        }

    }

    private void defendYourself() {
        this.console.println("\n*** You take a defensive stance, and gain nothing  ***");
    }

    private void castSpell() {

        int spellAttack = MountKabru.getCurrentGame().getHero().getSpellAttack();
        int mana = MountKabru.getCurrentGame().getHero().getMana();
        int opponentDefense = MountKabru.getCurrentGame().getHero().getFoundMonster().getDefense();
        int damageDoneToMonster = 0;

        try {
            damageDoneToMonster = ActorControl.spellDamage(spellAttack, mana, opponentDefense);
            this.console.println("\n*** You Cast a spell at the       ***"
                    + "\n*** monster          ***"
                    + "\n*** You do " + damageDoneToMonster + " Damage    ***");

        } catch (ActorControlException me) {
            this.console.println(me.getMessage());
        }

        int currentHP = MountKabru.getCurrentGame().getHero().getFoundMonster().getCurrentHitPoints();
        currentHP -= damageDoneToMonster;

        if (currentHP < 0) {

            //say you killed the monster
            this.console.println("You defied all logic and were able to slay the monster.");

            //set XP
            int beforeXP = MountKabru.getCurrentGame().getHero().getExperience();
            int xpGained = MountKabru.getCurrentGame().getHero().getFoundMonster().getXpGained();
            int afterXP = beforeXP + xpGained;

            MountKabru.getCurrentGame().getHero().setExperience(afterXP);
            int xpToNextLevel = MountKabru.getCurrentGame().getHero().getXpToNextLevel();
            if (afterXP > xpToNextLevel) {
                GameControl.raiseTheLevel();
                this.console.println("\nYou have worked hard and Gained a Level!!!"
                                   + "\n you are now level: " + MountKabru.getCurrentGame().getHero().getLevelOfHero());
                       
            }

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

            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations[i].length - 1; j++) {
//                events[i][j] = locations[i][j].getEvent();
                    //System.out.println(locations[i][j].getEvent().getEventType());
                }
            }

            WorldControl.setEventsToLocations(world, events);

        } else {
            MountKabru.getCurrentGame().getHero().getFoundMonster().setCurrentHitPoints(currentHP);

            this.console.println("The monster has this much life: " + currentHP);
            
            //Monster attacks you back
            
            int monsAttack = MountKabru.getCurrentGame().getHero().getFoundMonster().getAttack();
            int monsSpellAttack = MountKabru.getCurrentGame().getHero().getFoundMonster().getSpellAttack();
            int playerDef = MountKabru.getCurrentGame().getHero().getDefense();
            int beforeHP = MountKabru.getCurrentGame().getHero().getCurrentHitPoints();
            
            int monsDamage = ActorControl.monsterAttack(monsSpellAttack, monsAttack, playerDef);
            int afterHP = beforeHP - monsDamage;
            
            this.console.println("\n--------------------------------------------------"
                               + "\n               You were attacked!!!"
                               + "\n--------------------------------------------------"
                               + "\n"
                               + "\n  the " + MountKabru.getCurrentGame().getHero().getFoundMonster().getName()
                               + "\n  hit you for " + monsDamage + " Damage!"
                               + "\n  "
                               + "\n  You now have " + afterHP + " Hit Points");
            
            
            if (afterHP <1) {
                //hero dies and its GAME OVER
                //load the Main Menu
                MountKabru.getCurrentGame().setEndOfGame(true);
                this.console.println("\n"
                        + "\n ---------------------------------------------------------------------"
                        + "\n"
                        + "\n   You are fighting bravely but your weapon is getting heavy..."
                        + "\n"
                        + "\n   You try to catch your breath...      "
                        + "\n   "
                        + "\n   you slowly loose your sight and feel something bash you in the head..."
                        + "\n"
                        + "\n   Sorry, you died"
                        + "\n                                    _"
                        + "\n                                   { }" 
                        + "\n                                   { }"
                        + "\n                                 __{ }__"
                        + "\n                                 \\_____/"
                        + "\n         __                        | |   "
                        + "\n        /  \\                       | | "
                        + "\n       /    \\____ ________         | |         ______"
                        + "\n   ___/__/\\     |    |____\\        | |        /   _0 \\ "
                        + "\n  /_____/  \\____|_________/Mmn~    |_|    ~nmM\\____0_/"
                        + "\n");
                
                return;
            }
            
            MountKabru.getCurrentGame().getHero().setCurrentHitPoints(afterHP);
        }

    }

}
