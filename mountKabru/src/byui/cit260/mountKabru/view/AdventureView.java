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
public class AdventureView extends View {
    public AdventureView() {
            super( "Hero what the heck is your level");
        }
    
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

       


        
            
        
       

        @Override
        public boolean doAction(int userResponse) {


            if (userResponse <=10){
                this.displayMessage = plainsMenu;
            }
            else if (userResponse <= 20 ) {
               this.displayMessage = jungleMenu;
            }
            else if (userResponse <= 30) {
                this.displayMessage = darkForestMenu;
            }
            else if (userResponse <= 50) {
                this.displayMessage = highMountainMenu;
            }
            else {
                System.out.println("That won't work try again");
            }



            int menuChoice = this.getInput();

            switch (menuChoice) {
                case : // go kill stuff in the plains
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
            //Create plains view object
            PlainsView plainsView = new PlainsView();

            //Display the plains view
            plainsView.display();
        }

        private void jungleAdventure() {
            //Create plains view object
            JungleView jungleView = new JungleView();

            //Display the plains view
            jungleView.display();
        }

        private void forestAdventure() {
            //Create plains view object
            DarkForestView darkForestView = new DarkForestView();

            //Display the plains view
            darkForestView.display();
        }

        private void mountainAdventure() {
            //Create plains view object
            HighMountainView highMountainView = new HighMountainView();

            //Display the plains view
            highMountainView.display();
        }

      
}
