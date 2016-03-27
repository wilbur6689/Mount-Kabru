/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import static java.lang.Integer.parseInt;


/**
 *
 * @author wibur
 */
public class WorldMapView extends View {

    public WorldMapView() {
        super("\n"
            + "\n--------------------------------------------------------"
            + "\n   Which Location would you like to visit?         "
            + "\n   "
            + "\n   Choose your number from the ranges below"
            + "\n   "
            + "\n         (11) - Return to town "
            + "\n  (12) - (18) - Plains "
            + "\n  (21) - (28) - Jungle"
            + "\n  (31) - (38) - Dark Forest"
            + "\n  (41) - (48) - High Mountain"
            + "\n"
            + "\n  (Q) - quit");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        

        choice = choice.toUpperCase(); //convert choice to upper case
        
        int location = parseInt(choice);
        
        if (location < 12) {
            this.returnToTown(location);
        } else if (location < 19) {
            this.plainsAdventure(location);
        } else if (location < 29) {
            this.jungleAdventure(location);
        } else if (location < 39) {
            this.forestAdventure(location);
        } else {
            this.mountainAdventure(location);
        }
        
        
        return false;
    }

    private void returnToTown(int location){
        this.console.println("you called the town function");
    }
    
    private void plainsAdventure(int location) {
        this.console.println("you called the plains function");
    }

    private void jungleAdventure(int location) {
        this.console.println("you called the jungle function");
    }

    private void forestAdventure(int location) {
        this.console.println("you called the forest function");
    }

    private void mountainAdventure(int location) {
        this.console.println("you called the mountain function");
    }

}
