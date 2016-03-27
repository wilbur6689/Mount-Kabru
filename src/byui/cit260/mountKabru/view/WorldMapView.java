/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;


/**
 *
 * @author wibur
 */
public class WorldMapView extends View {

    public WorldMapView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n   Which Location would you like to visit?      "
            + "\n   Please enter the two numbers together"
            + "\n                                                "
            + "\n                                                "
            + "\n         (11) - Return to town "
            + "\n  (12) - (18) - Plains "
            + "\n  (20) - (28) - Jungle"
            + "\n  (30) - (38) - Dark Forest"
            + "\n  (40) - (48) - High Mountain"
            + "\n"
            + "\n  (Q) - quit");
    }
    
    

    @Override
    public boolean doAction(String choice) {
        

        choice = choice.toUpperCase(); //convert choice to upper case

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
            case "M": // go kill stuff in the Mountains
                this.mountainAdventure();
                break;

            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void plainsAdventure() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void jungleAdventure() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void forestAdventure() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mountainAdventure() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
