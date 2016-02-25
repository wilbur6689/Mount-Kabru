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
public class AdventureView {
    
    
        private String plainsMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\n(1) - Fight in the Plains"
                + "\n???"
                + "\n???"
                + "\n???"
                + "\n(0) - Quit"
                + "\n--------------------------------------";
        
        private String jungleMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\n(1) - Fight in the Plains"
                + "\n(2) - Fight in the Jungle"
                + "\n???"
                + "\n???"
                + "\n(0) - Quit"
                + "\n--------------------------------------";
        
        private String darkForestMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\n(1) - Fight in the Plains"
                + "\n(2) - Fight in the Jungle"
                + "\n(3) - Fight in the dark Forest"
                + "\n???"
                + "\n(0) - [Q]uit"
                + "\n--------------------------------------";
        private String highMountainMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\n(1) - Fight in the Plains"
                + "\n(2) - Fight in the Jungle"
                + "\n(3) - Fight in the dark Forest"
                + "\n(4) - Fight in the high Mountains"
                + "\n(0) - [Q]uit"
                + "\n--------------------------------------";

        void displayAdventureView() {

           boolean done = false; //set flag to done
           do {
              //prompt for and get the players input
              int userResponse = this.getUserInput();
              if (userResponse == 0)  //Player wants to quit
                return; //exit game

              //do the requested action and display the next view
              done = this.doAction(userResponse);

           } while (!done);
        }


        private String promptMessage;

        public AdventureView() {
            this.promptMessage = "Hero what the heck is your level";
        }
            
        
        private int getUserInput() {


            Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
            int value = 0; // Value to be Returned
            boolean valid = false; // Initialize to not valid

                while (!valid) { // Loop while an invalid value is enter
                  System.out.println ("\n" + this.promptMessage);

                  value = keyboard.nextInt(); //Get next line typed on keyboard




                  break; // end the loop

                }
          return value;
        }


        private boolean doAction(int userResponse) {


            if (userResponse <=10){
                this.promptMessage = plainsMenu;
            }
            else if (userResponse <= 20 ) {
               this.promptMessage = jungleMenu;
            }
            else if (userResponse <= 30) {
                this.promptMessage = darkForestMenu;
            }
            else if (userResponse <= 50) {
                this.promptMessage = highMountainMenu;
            }
            else {
                System.out.println("That won't work try again");
            }


            
            int menuChoice = this.getUserInput();

            switch (menuChoice) {
                case 1: // go kill stuff in the plains
                    this.plainsAdventure();
                    break;
                case 2: // go kill stuff in the jungle
                    this.jungleAdventure();
                    break;
                case 3: // go kill stuff in the forest
                    this.forestAdventure();
                    break;
                case 4: // go kill stuff in the mountains
                    this.mountainAdventure();
                    break;

                default:
                    System.out.println("\n*** Invalid selection *** Try again");


            }
            return false;
        }

        private void plainsAdventure() {
            //Create plains View object
            PlainsView plainsView = new PlainsView();

            //Display the plains view
            plainsView.displayPlainsView();
        }

        private void jungleAdventure() {
            //Create plains View object
            JungleView jungleView = new JungleView();

            //Display the plains view
            jungleView.displayJungleView();
        }

        private void forestAdventure() {
            //Create plains View object
            DarkForestView darkForestView = new DarkForestView();

            //Display the plains view
            darkForestView.displayForestView();
        }

        private void mountainAdventure() {
            //Create plains View object
            HighMountainView highMountainView = new HighMountainView();

            //Display the plains view
            highMountainView.displayMountainView();
        }

      
}
