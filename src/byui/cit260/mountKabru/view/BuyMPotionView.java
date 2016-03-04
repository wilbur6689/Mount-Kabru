/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

    /**
     *
     * @author Orson C Badger
     */
    public class BuyMPotionView extends View{

    

        public BuyMPotionView() {
           super( "\n"
                    + "\n--------------------------------------"
                    + "\n|  You straggle into the blacksmith  |"
                    + "\n|  hoping to make a deal...          |"
                    + "\n--------------------------------------"
                    + "\nB - [B]uy Mp Potion"
                    + "\n"
                    + "\nQ - Return to Tavern"
                    + "\n--------------------------------------");}

        

        
        @Override
        public boolean doAction(String choice) {

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





