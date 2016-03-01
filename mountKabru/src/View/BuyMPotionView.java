/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;



    /**
     *
     * @author Orson C Badger
     */
    public class BuyMPotionView {

        private final String buyMPotionMenu;

        public BuyMPotionView() {
            this.buyMPotionMenu = "\n"
                    + "\n--------------------------------------"
                    + "\n|  You straggle into the blacksmith  |"
                    + "\n|  hoping to make a deal...          |"
                    + "\n--------------------------------------"
                    + "\nB - [B]uy Mp Potion"
                    + "\n"
                    + "\nQ - Return to Tavern"
                    + "\n--------------------------------------";
        }

        void displayBuyMPotionView() {

            boolean done = false; //set flag to done

            do {
                //prompt for and get the players name
                String menuOption = this.getBuyMPotionOption();
                if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
                    return; //exit game

                //do the requested action and display the next view
                done = this.doAction(menuOption);

            } while (!done);
        }

        private String promptMessage;

        private String getBuyMPotionOption() {


            Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
            String value = ""; // Value to be Returned
            boolean valid = false; // Initialize to not valid

            while (!valid) { // Loop while an invalid value is enter
                System.out.println ("\n" + this.buyMPotionMenu);

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
                    System.out.println("\n*** HEY DINGBAT THAT WON'T WORK!");


            }
            return false;
        }

        private void buyFromTavernOwner() {
            System.out.println("\n***   SO you want a freaking potion for mana?    ***"
                    +          "\n***   You can't have one cause I dont like ya!   ***"
                    +          "\n***   Maybe when I have some I will like you!    ***");
        }


    }





