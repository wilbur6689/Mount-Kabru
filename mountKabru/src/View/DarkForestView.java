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
public class DarkForestView {
    
    private final String forestMenu;
    
    public DarkForestView() {
    this.forestMenu = "\n"
                + "\n---------------------------------------"
                + "\n|  You sprint outside of town a long  |"
                + "\n|  ways and find the Forest. You Put  |"
                + "\n|  a mean look on your face           |"
                + "\n|                                     |"
                + "\n---------------------------------------"
                + "\nS - [S]earch for a monster"
                + "\nP - use a [P]otion"
                + "\nI - check your [I]nventory"
                + "\nQ - [Q]uit back to town"
                + "\n--------------------------------------";
    }
    
    void displayForestView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getForestMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getForestMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.forestMenu);

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
            case "S": // go kill stuff in the forest
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
        
        //create the Attack Monster view object
        AttackMonsView attackMonsView = new AttackMonsView();
        //display the Attack Monster view
        attackMonsView.displayAttackMonsView();
    }

    private void usePotion() {
        System.out.println("\n*** you look into your potion pouch and  ***"
                         + "\n*** remember you dont have any potions   ***");
    }

    private void viewInventory() {
        
        //create the Attack Monster view object
        InventoryView inventoryView = new InventoryView();
        //display the Attack Monster view
        inventoryView.displayInventoryView();
    }
}
