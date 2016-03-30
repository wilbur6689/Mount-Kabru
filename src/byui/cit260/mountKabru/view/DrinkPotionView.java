/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import mountkabru.MountKabru;

/**
 *
 * @author wibur
 */
public class DrinkPotionView extends View {

    public DrinkPotionView() {
        super("\n"
            + "\n--------------------------------------"
            + "\n"
            + "\n    You look into your inventory to  "
            + "\n    find a potion to drink..."
            + "\n "
            + "\n    H. Drink your Health Potion"
            + "\n    M. Drink your Mana Potion"
            + "\n"
            + "\n--------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
       String choice = value.toUpperCase(); //convert choice to upper case

        switch (choice) {
            
            case "H": // view your inventory
                this.drinkHP();
                return true;
            case "M": // use a potion
                this.drinkMana();
                return true;

            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void drinkHP() {
        this.console.println("You called the drink a health potion function");
    }

    private void drinkMana() {
        this.console.println("You called the drink a Mana potion function");
    }
    
    
}
