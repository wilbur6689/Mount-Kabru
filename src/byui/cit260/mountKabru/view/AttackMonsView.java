/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.ActorControl;
import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.model.Location;

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
                + "\n|  You found a Monster!!!             |"
                + "\n|                                     |"
                + "\n|  Prepare to fight                   |"
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
        return false;
    }

    private void attackMonster() {
        int attack = -5;
        int strength = 23;
        int opponentDefense = 17; 
        try { 
        int result = ActorControl.meleeDamage(attack, strength, opponentDefense);
        this.console.println("\n*** You walk over to the monster      ***"
                         + "\n*** and punch him in the gut          ***"
                         + "\n*** You do " + result + " Damage    ***");
        
        } catch (ActorControlException me) {
            this.console.println(me.getMessage());
        }
        
        //reset the event for the currect location
        Location location = MountKabru.getCurrentGame().getHero().getCurrentLocation();
        
        
        
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
