/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
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
                + "\n|  tavern. He streches his hand out      |"
                + "\n|  and says 'Give me a coin and I will   |"
                + "\n|  tell you something very useful...'    |"
                + "\n------------------------------------------"
                + "\n"
                + "\nA - [A]verage number of Hit Points for the monsters in the game"
                + "\nL - [L]ist of monsters from weakest to strongest "
                + "\nS - [S]ee your Stats "
                + "\nQ - [Q]uit"
                + "\n--------------------------------------");
    }

    private String promptMessage;

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "A": // Buy weapons and armor from the blacksmith
                this.avgMonsters();
                break;
            case "L": // Sell your weapons or armor to the blacksmith
                this.listMonsters();
                break;
            case "S": // Sell your weapons or armor to the blacksmith
                this.heroStats();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }

    private void avgMonsters() {

        Actor[] actors = MountKabru.getCurrentGame().getActors();
        
        int avgMonsterHP = GameControl.avgMonsterHP(actors);
        System.out.println("\nLast time I checked there is an average of " + avgMonsterHP + " Hit Points of all the monsters in the game");

    }

    private void listMonsters() {
        
        Actor[] actors = MountKabru.getCurrentGame().getActors();
        
        String names = GameControl.listOMonsters(actors);
        System.out.println("\n here is a list of all the monsters: " + names);
    }

    private void heroStats() {
        
        System.out.println("\nI dont know that, ask me something else");
    }
    
}
