/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Orson C Badger
 */
public class JungleView {
    
    private final String jungleMenu;
    
    public JungleView() {
    this.jungleMenu = "\n"
                + "\n-------------------------------------------------------------------------|"
                + "\n|  You run into a really dark forest like place                          |"
                + "\n|  the only difference is it is so dang hot and muggy                    |"
                + "\n|  the sweat begins to fall from your face. Why am I here?!              |"
                + "\n|  you grip your weapon preparing to be slaughtered at any given moment. |"
                + "\n-------------------------------------------------------------------------|"
                + "\n"
                + "\nM - Search for a [M]onster"
                + "\nP - Use [P]otion"
                + "\nI - Check [I]nventory"
                + "\nQ - [Q]uit back to town"
                + "\n--------------------------------------------------------------------------";
    }
    
    void displayJungleView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getJungleMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getJungleMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.jungleMenu);

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
            case "M": // go kill stuff in the Jungle
                this.searchForMonster();
                break;
            case "P": // use a potion
                this.usePotion();
                break;
            case "I": // view your inventory
                this.viewInventory();
                break;
            
            default:
                System.out.println("\n*** What ever you were trying to do failed epically! *** Try again");
                
                         
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
        System.out.println("\n*** you look into your potion pouch and    ***"
                         + "\n*** remember you don't have any potions.   ***");
    }

    private void viewInventory() {
        
        //create the Attack Monster View object
        InventoryView inventoryView = new InventoryView();
        //display the Attack Monster View
        inventoryView.displayInventoryView();
    }
}
