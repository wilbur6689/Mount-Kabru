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
                    + "\nP - Fight in the [P]lains"
                    + "\n???"
                    + "\n???"
                    + "\n???"
                    + "\nQ - [Q]uit"
                    + "\n--------------------------------------";
        private String jungleMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\nP - Fight in the [P]lains"
                + "\nJ - Fight in the [J]ungle"
                + "\n???"
                + "\n???"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------";
        private String darkForestMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\nP - Fight in the [P]lains"
                + "\nJ - Fight in the [J]ungle"
                + "\nF - Fight in the dark [F]orest"
                + "\n???"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------";
        private String highMountainMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\nP - Fight in the [P]lains"
                + "\nJ - Fight in the [J]ungle"
                + "\nF - Fight in the dark [F]orest"
                + "\nM - Fight in the high [M]ountains"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------";

        void displayAdventureView() {

           boolean done = false; //set flag to done
           do {
              //prompt for and get the players name
              int userResponse = this.getUserInput();
              if (userResponse.toUpperCase().equals("Q"))  //Player wants to quit
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


        private boolean doAction(int choice) {


            int answer = this.getUserInput();
            if (answer <=10){
                this.promptMessage = plainsMenu;
            }
            else if (answer <= 20 ) {
               this.promptMessage = jungleMenu;
            }
            else if (answer <= 30) {
                this.promptMessage = darkForestMenu;
            }
            else if (answer <= 50) {
                this.promptMessage = highMountainMenu;
            }
            else {
                System.out.println("That won't work try again");
            }


            System.out.println();

            String menuOption = this.getUserInput()









            switch (choice) {
                case "P": // go kill stuff in the plains
                    this.plainsAdventure();
                    break;
                case "J": // go kill stuff in the jungle
                    this.jungleAdventure();
                    break;
                case "F": // go kill stuff in the forest
                    this.forestAdventure();
                    break;
                case "M": // go kill stuff in the mountains
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

        private
}
