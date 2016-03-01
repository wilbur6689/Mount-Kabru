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
public class BlacksmithView {
    
    private final String blacksmithMenu;
    
    public BlacksmithView() {
    this.blacksmithMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You straggle into the blacksmith  |"
                + "\n|  hoping to make a deal...          |"
                + "\n--------------------------------------"
                + "\nB - [B]uy weapons and Armor"
                + "\nS - [S]ell weapongs and armor"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------";
    }
    
    void displayBlacksmithView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getBlacksmithMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getBlacksmithMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.blacksmithMenu);

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
            case "B": // Buy weapons and armor from the blacksmith
                this.buyFromBlacksmith();
                break;
            case "S": // Sell your weapons or armor to the blacksmith
                this.sellToBlacksmith();
                break;
                        
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void buyFromBlacksmith() {
        System.out.println("\n***   Sorry, I am just now stocking my shelves    ***"
                         + "\n***   with all the best weapons and armor I can   ***"
                         + "\n***   find. please come back later.               ***");
    }

    private void sellToBlacksmith() {
        System.out.println("\n***   Sorry, I would love to look at what you     ***"
                         + "\n***   you got but I am too busy stocking my       ***"
                         + "\n***   shelves, please come back later.            ***");
    }
}
