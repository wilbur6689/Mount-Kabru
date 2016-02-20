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
public class NewCharView {
    
    private final String newCharMenu;
    
    public NewCharView() {
    this.newCharMenu = "\n"
                + "\n--------------------------------------"
                + "\n|      Create a New Character        |"
                + "\n--------------------------------------"
                + "\n1. If a large tree fell on you and you were trapped, would you:"
                + "\n    [ M ] push with all your might?"
                + "\n    [ W ] user your will to think it away?"
                + "\n"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    }
    
    void displayNewCharView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getNewCharMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getNewCharMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.newCharMenu);

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
            case "M": // create and start a new game
                this.nextQuestionMight();
                break;
            case "W": // load players game
                this.nextQuestionWill();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void nextQuestionMight() {
        // create gameMenuView object
        GameMenuView gameMenuView = new GameMenuView();
        
        //display the game Menu View 
        gameMenuView.displayGameMenuView();
    }

    private void nextQuestionWill() {
        
        //In the future we will add more questions that will add stuff to the char

        // create gameMenuView object
        GameMenuView gameMenuView = new GameMenuView();
        
        //display the game Menu View 
        gameMenuView.displayGameMenuView();
    }

    
}
