/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;

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
                + "\nT - [T]otal number of monsters in the game"
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
            case "T": // Buy weapons and armor from the blacksmith
                this.totalMonsters();
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

    private void totalMonsters() {

        int totalMons = GameControl.totalMons();
        System.out.println("\nLast time I checked there were " + totalMons + " Different Types of monsters in this world.");

    }

    private void listMonsters() {
        
        System.out.println("\nI dont know that, ask me something else");
    }

    private void heroStats() {
        
        System.out.println("\nI dont know that, ask me something else");
    }
    
}
