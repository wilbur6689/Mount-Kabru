/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.model.Location;
import static java.lang.Integer.parseInt;
import mountkabru.MountKabru;


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
    public boolean doAction(String value) {
        
        String choice = value.toUpperCase(); //convert choice to upper case
        String[] valueArray = choice.split(" ");
        int row;
        int column;
        
        try {
            row = Integer.parseInt(valueArray[0]);
            column = Integer.parseInt(valueArray[1]);
        } catch (NumberFormatException nfe) {
            ErrorView.display("World Map View", "You entered the wrong number");
            return false;
        }
        
        if ((row < 1 || row > 4) || (column < 1 || column > 8)) {
        ErrorView.display("World Map View", "You have entered in the wrong number please try again.");
        return false;
        }

        
        
        
        
        
        return false;
    }

    private void returnToTown(){
        this.console.println("you called the town function");
    }
    
    private void Adventure(int location) {
        AdventureView adventureView = new AdventureView();
        adventureView.display();
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
