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
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void helpNewGame() {
        System.out.println("*** helpNewGame function called ***");
    }

    private void helpTown() {
        System.out.println("*** helpTown function called ***");
    }

    private void helpMonster() {
        System.out.println("*** helpMonster function called ***");
    }

    private void helpLevelingUp() {
        System.out.println("*** helpLeveingUp function called ***");
    }

    private void quitToMain() {
        System.out.println("*** returnToMain function called ***");
    }

    

}
