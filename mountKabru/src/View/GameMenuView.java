/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class GameMenuView {
    
    private final String gameMenu;
    
    public GameMenuView() {
    this.gameMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  This here be the Town of Kabru    |"
                + "\n--------------------------------------"
                + "\nA - go on an [A]dventure"
                + "\nT - visit the [T]avern"
                + "\nB - visit the [B]lacksmith"
                + "\nH - please [H]elp!"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------";
    }
    
    void displayGameMenuView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getGameMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getGameMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.gameMenu);

          value = keyboard.nextLine(); //Get next line typed on keyboard
          value = value.trim(); // trim off leading and trailing blanks

          if (value.length() < 1){ //value is blank
            System.out.println("\n Invalid value: Value can not be blank");
            continue;
          }
          break; // end the loop

        }
      return value;
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
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
         // create adventure View object
        AdventureView adventureView = new AdventureView();
        
        //display the adventure View
        adventureView.displayAdventureView();
    }

    private void goTavern() {
        
        //create the tavern view object
        TavernView tavernView = new TavernView();
        //display the tavern view
        tavernView.displayTavernView();
    }

    private void goBlacksmith() {
        
        //create the tavern view object
        BlacksmithView blacksmithView = new BlacksmithView();
        //display the tavern view
        blacksmithView.displayBlacksmithView();
    }

    private void displayHelpMenu() {
        
         // create helpHelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        //display the help menu view
        helpMenuView.displayHelpMenuView();
    }
}
