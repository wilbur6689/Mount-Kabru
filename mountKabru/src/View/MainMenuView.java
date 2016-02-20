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
public class MainMenuView {
    
    private final String menu;
    
    public MainMenuView() {
    this.menu = "\n"
                + "\n--------------------------------------"
                + "\n| Main Menu                          |"
                + "\n--------------------------------------"
                + "\nN - Start a new game"
                + "\nL - Load Game"
                + "\nS - Save Game"
                + "\nH - Get Help on how to play the game"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    }
    
    void displayMainMenuView() {
          
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
          System.out.println ("\n" + this.promptMessage);

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

    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() Function Called ***");
        return true;
    }
    
}
