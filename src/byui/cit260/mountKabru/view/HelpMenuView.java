/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class HelpMenuView extends View {

    
    public HelpMenuView() {
           super( "\n"
                + "\n--------------------------------------"
                + "\n| Help Menu                          |"
                + "\n--------------------------------------"
                + "\nS - how to Start a new game"
                + "\nT - help with the town"
                + "\nM - help with fighting monsters"
                + "\nL - help with leveling up"
                + "\nQ - Quit to main menu"
                + "\n--------------------------------------");
    }
    
    
    
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "S": // create and start a new game
                this.helpNewGame();
                break;
            case "T": // load players game
                this.helpTown();
                break;
            case "M": //save a players game
                this.helpMonster();
                break;
            case "L": //help menu
                this.helpLevelingUp();
                break;
            case "Q": //return to the main menu
                this.quitToMain();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void helpNewGame() {
        this.console.println("*** To start a new game: When you are at the MainMenu Select New Game. "
                           + "\n This will allow you to create a Hero and fight through the land of Kabru. "
                           + "\n But be careful, monsters will be in your way the whole time. ***");
    }

    private void helpTown() {
        this.console.println("*** Town Purpose: The whole purpose of the town is to give you a place "
                           + "\n to chill and be merry, after all who wants to fight monsters all of the "
                           + "\n time? You can go to the tavern you can get a drink and just relax talk "
                           + "\n to the tavern owner but be warned he does not like experienced adventurers."
                           + "\n If you get bored of that, go talk to the blacksmith and buy some armor and "
                           + "\n weaponry to help you adventure as you fight those pesky monsters. ***");
    }

    private void helpMonster() {
        this.console.println("*** Follow the on screen commands, but be warned if you do not have enough "
                           + "\n health and you die! it is GAME OVER!!!! Use potions to alleviate this "
                           + "\n possiblity, BE PREPARED! ***");
    }

    private void helpLevelingUp() {
        this.console.println("*** As you adventure and kill monsters you realize that you gain expereience"
                           + "\n based on what they have given you in exp points. You can reach level 50 and"
                           + "\n no higher. SO GO KILL SOME MONSTERS! ***");
    }

    private void quitToMain() {
        this.console.println("*** This allows you to quit to the main menu. Save and Load games here. ***");
    }

    

}
