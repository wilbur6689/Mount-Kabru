/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.ActorControl;
import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.model.Actor;
import mountkabru.MountKabru;

/**
 *
 * @author wibur
 */
public class GameInfoView extends View {

    public GameInfoView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n|  You find an old beggar behind the     |"
                + "\n|  tavern. He stretches his hand out      |"
                + "\n|  and says 'Give me a coin and I will   |"
                + "\n|  tell you something very useful...'    |"
                + "\n------------------------------------------"
                + "\n"
                + "\nA - [A]verage number of Hit Points for the monsters in the game"
                + "\nL - [L]ist of Monsters Alphabetically "
                + "\nQ - [Q]uit"
                + "\n--------------------------------------");
    }

    private String promptMessage;

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": // Buy weapons and armor from the blacksmith
                try {
                    this.avgMonsters();
                } catch (ActorControlException e) {
                    e.printStackTrace();
                }
                break;
            case "L": // Sell your weapons or armor to the blacksmith
                try {
                    this.listMonsters();
                } catch (ActorControlException e) {
                    e.printStackTrace();
                }
                break;
           

            default:
                this.console.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }

    private void avgMonsters() throws ActorControlException {
        

        int avgMonsterHP = 0;
        try {
            avgMonsterHP = ActorControl.avgMonsterHP();
        } catch (ActorControlException e) {
            e.printStackTrace();
        }
        this.console.println("\nLast time I checked there is an average of " + avgMonsterHP + " Hit Points of all the monsters in the game");
    }

    private void listMonsters() throws ActorControlException {
        Actor[][] actors = MountKabru.getCurrentGame().getActors();
        String listOMonsters = null;
        try {
            listOMonsters = ActorControl.listOMonsters(actors);
        } catch (ActorControlException e) {
            e.printStackTrace();
        }
        this.console.println("\nHere you go! This is all of the monsterData that I have discovered. \n"
                + listOMonsters);
    }

    
    
}
