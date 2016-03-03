/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
           super( "\n"
                + "\n--------------------------------------"
                + "\n|  This here be the Town of Kabru    |"
                + "\n--------------------------------------"
                + "\nA - go on an [A]dventure"
                + "\nT - visit the [T]avern"
                + "\nB - visit the [B]lacksmith"
                + "\nH - please [H]elp!"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------");
    }
    
    
    
    private String promptMessage;

    @Override
    private boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "A": // go kill stuff on an adventure
                this.goAdventure();
                break;
            case "T": // visit the tavern in town
                this.goTavern();
                break;
            case "B": // visit the blacksmith in town
                this.goBlacksmith();
                break;
            case "H": //help menu
                this.displayHelpMenu();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void goAdventure() {
         // create adventure view object
        AdventureView adventureView = new AdventureView();
        
        //display the adventure view
        adventureView.displayAdventureView();
    }

    private void goTavern() {
        
        //create the tavern view object
        TavernView tavernView = new TavernView();
        //display the tavern view
        tavernView.display();
    }

    private void goBlacksmith() {
        
        //create the tavern view object
        BlacksmithView blacksmithView = new BlacksmithView();
        //display the tavern view
        blacksmithView.display();
    }

    private void displayHelpMenu() {
        
         // create helpHelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        //display the help menu view
        helpMenuView.displayHelpMenuView();
    }
}
