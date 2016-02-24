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
public class BuyHPotionView {

    private final String buyHPotionMenu;

    public BuyHPotionView() {
        this.buyHPotionMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  The Tavern owner looks at you with a smug face  |"
                + "\n|  hoping to make a deal?                          |"
                + "\n--------------------------------------"
                + "\nB - [B]uy Lvl 1-10 HP Potion"
                + "\n"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------";
    }

    void displayBuyHPotionView() {

        boolean done = false; //set flag to done
        do {
            //prompt for and get the players name
            String menuOption = this.getBuyHPotionOption();
            if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
                return; //exit game

            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String promptMessage;

    private String getBuyHPotionOption() {


        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
            System.out.println ("\n" + this.buyHPotionMenu);

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
            case "B": // Buy Potion From TavernOwner
                this.buyFromTavernOwner();
                break;


            default:
                System.out.println("\n*** Invalid selection *** Try again");


        }
        return false;
    }

    private void buyFromTavernOwner() {
        System.out.println("\n***   NOPE    ***"
                +          "\n***   NOPE   ***"
                +          "\n***   Please come back later.               ***");
    }


}
    

