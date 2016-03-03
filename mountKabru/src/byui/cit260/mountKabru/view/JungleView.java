/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import java.util.Scanner;

/**
 *
 * @author Orson C Badger
 */
public class JungleView extends View{
    
    
    
    public JungleView() {
    super ( "\n"
                + "\n-------------------------------------------------------------------------|"
                + "\n|  You run into a really dark forest like place                          |"
                + "\n|  the only difference is it is so dang hot and muggy                    |"
                + "\n|  the sweat begins to fall from your face. Why am I here?!              |"
                + "\n|  you grip your weapon preparing to be slaughtered at any given moment. |"
                + "\n-------------------------------------------------------------------------|"
                + "\n"
                + "\nS - [S]earch for a monster"
                + "\nP - Use [P]otion"
                + "\nI - Check [I]nventory"
                + "\nQ - [Q]uit back to town"
                + "\n--------------------------------------------------------------------------");
    }
    
    
    @Override
    public boolean doAction(String choice) {
        
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
                System.out.println("\n*** What ever you were trying to do failed epically! *** Try again");
                
           
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
        System.out.println("\n*** you look into your potion pouch and    ***"
                         + "\n*** remember you don't have any potions.   ***");
    }

    private void viewInventory() {
        
        //create the Attack Monster view object
        InventoryView inventoryView = new InventoryView();
        //display the Attack Monster view
        inventoryView.display();
    }
}
