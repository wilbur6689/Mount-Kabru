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
public class InventoryView {
    
    private final String inventoryMenu;
    
    public InventoryView() {
    this.inventoryMenu = "\n"
                + "\n---------------------------------------"
                + "\n|  You look around for your backpack  |"
                + "\n|  and remember you forgot it back    |"
                + "\n|  in town.                           |"
                + "\n---------------------------------------"
                + "\nS - [S]mile at yourself"
                + "\nQ - [Q]uit back to serching"
                + "\n--------------------------------------";
    }
    
    void displayInventoryView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getInventoryMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getInventoryMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.inventoryMenu);

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
            case "S": // go kill stuff in the High Mountains
                this.smileAtYourself();
                break;
           
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void smileAtYourself() {
        System.out.println("\n*** you stare down at a pool of water and begin smiling  ***"
                         + "\n*** Boy, dont you look hansom!!                          ***");
    }
   
}
