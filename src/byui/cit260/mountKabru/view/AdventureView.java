/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

/**
 *
 * @author Phill
 */
public class AdventureView extends View {
    public AdventureView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\n(P) - Fight in the Plains"
                + "\n(J) - Fight in the Jungle"
                + "\n(F) - Fight in the dark Forest"
                + "\n(M) - Fight in the high Mountains"
                + "\n(Q) - [Q]uit"
                + "\n--------------------------------------");
    }



    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "P": // go kill stuff in the Jungle
                this.plainsAdventure();
                break;
            case "J": // use a potion
                this.jungleAdventure();
                break;
            case "F": // view your inventory
                this.forestAdventure();
                break;
            case "M": // view your inventory
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



/*private String plainsMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\n(P) - Fight in the Plains"
                + "\n???"
                + "\n???"
                + "\n???"
                + "\n(Q) - Quit"
                + "\n--------------------------------------";
        
        private String jungleMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\n(P) - Fight in the Plains"
                + "\n(J) - Fight in the Jungle"
                + "\n???"
                + "\n???"
                + "\n(Q) - Quit"
                + "\n--------------------------------------";
        
        private String darkForestMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\n(P) - Fight in the Plains"
                + "\n(J) - Fight in the Jungle"
                + "\n(F) - Fight in the Dark Forest"
                + "\n???"
                + "\n(Q) - [Q]uit"
                + "\n--------------------------------------";*/


