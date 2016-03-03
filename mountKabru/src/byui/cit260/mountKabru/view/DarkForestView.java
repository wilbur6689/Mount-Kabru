/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class DarkForestView extends View {
    
   
    
    public DarkForestView() {
    super( "\n"
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
                + "\n--------------------------------------");
    }
    
   
    @Override
    public boolean doAction(String choice) {
        
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
        attackMonsView.display();
    }

    private void usePotion() {
        System.out.println("\n*** you look into your potion pouch and  ***"
                         + "\n*** remember you dont have any potions   ***");
    }

    private void viewInventory() {
        
        //create the Attack Monster view object
        InventoryView inventoryView = new InventoryView();
        //display the Attack Monster view
        inventoryView.display();
    }
}
