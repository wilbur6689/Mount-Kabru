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
public class PlainsView {
    
    private final String plainsMenu;
    
    public PlainsView() {
    this.plainsMenu = "\n"
                + "\n---------------------------------------"
                + "\n|  You jog outside of town a little   |"
                + "\n|  ways and find the plains. You Put  |"
                + "\n|  a mean look on your face           |"
                + "\n|                                     |"
                + "\n---------------------------------------"
                + "\nS - [S]earch for a monster"
                + "\nP - use a [P]otion"
                + "\nI - check your [I]nventory"
                + "\nQ - [Q]uit back to town"
                + "\n--------------------------------------";
    }
    
    void displayPlainsView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getPlainsMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getPlainsMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.plainsMenu);

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
            case "S": // go kill stuff in the Jungle
                this.searchForMonster();
                break;
            case "P": // use a potion
                this.usePotion();
                break;
            case "I": // view your inventory
                this.viewInventory();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void searchForMonster() {
        
        //create the Attack Monster View object
        AttackMonsView attackMonsView = new AttackMonsView();
        //display the Attack Monster View
        attackMonsView.displayAttackMonsView();
    }

    private void usePotion() {
        System.out.println("\n*** you look into your potion pouch and  ***"
                         + "\n*** remember you dont have any potions   ***");
    }

    private void viewInventory() {
        
        //create the Attack Monster View object
        InventoryView inventoryView = new InventoryView();
        //display the Attack Monster View
        inventoryView.displayInventoryView();
    }
}
