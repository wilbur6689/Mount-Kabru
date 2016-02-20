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
public class HelpMenuView {
    private final String menu;
    
    public HelpMenuView() {
    this.menu = "\n"
                + "\n--------------------------------------"
                + "\n| Help Menu                          |"
                + "\n--------------------------------------"
                + "\nS - how to Start a new game"
                + "\nT - help with the town"
                + "\nM - help with fighting monsters"
                + "\nL - help with leveling up"
                + "\nR - return to main menu"
                + "\n--------------------------------------";
    }
    
    void displayHelpMenuView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.menu);

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
            case "R": //return to the main menu
                this.returnToMain();
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

    private void returnToMain() {
        System.out.println("*** returnToMain function called ***");
    }

    

}
