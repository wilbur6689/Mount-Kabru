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
public class TavernView {
    
    private final String tavernMenu;
    
    public TavernView() {
    this.tavernMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You meander in the tavern looking |"
                + "\n|  as tough as you can.               |"  
                + "\n--------------------------------------"
                + "\nT - talk to the [T]avern owner"
                + "\nS - get a room and [S]leep is off"
                + "\nH - buy a [H]ealth potion"
                + "\nM - buy a [M]ana potion"
                + "\nQ - return to town"
                + "\n--------------------------------------";
    }
    
    void displayTavernView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getTavernMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getTavernMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.tavernMenu);

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
            case "T": // go talk to the tavern owner
                this.tavernOwner();
                break;
            case "S": // get a room in the tavern and sleep
                this.sleep();
                break;
            case "H": // buy a health potion
                this.buyHealthPotion();
                break;
            case "M": // buy a mana potion
                this.buyManaPotion();
                break;
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void tavernOwner() {
        System.out.println("\n*** I dont know you, get away from me peasant ***");
    }

    private void sleep() {
        System.out.println("\n*** you sleep well and feel refreshed ***");
    }

    private void buyHealthPotion() {
        System.out.println("\n *** Sorry, we are all out of health potions right now, come back later");
    }

    private void buyManaPotion() {
        System.out.println("\n *** Sorry, we are all out of mana potions right now, come back later");
    }
}
