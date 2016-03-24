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
public class BuyHPotionView extends View {


    public BuyHPotionView() {
        super( "\n"
                + "\n--------------------------------------"
                + "\n|  So it will be a HP Potion eh?     |"
                + "\n|  We will see if I like ya enough   |"
                + "\n--------------------------------------"
                + "\nB - [B]uy Lvl 1-10 HP Potion"
                + "\n"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------");
    }

    

   
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "B": // Buy Potion From TavernOwner
                this.buyFromTavernOwner();
                break;


            default:
                this.console.println("\n*** Invalid selection *** Try again");


        }
        return false;
    }

    private void buyFromTavernOwner() {
        this.console.println("\n***   NOPE    ***"
                +          "\n***   NOPE   ***"
                +          "\n***   Please come back later.               ***");
    }


}
    

