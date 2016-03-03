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
public class InventoryView extends View {
    

    
    public InventoryView() {
    super( "\n"
                + "\n---------------------------------------"
                + "\n|  You look around for your backpack  |"
                + "\n|  and remember you forgot it back    |"
                + "\n|  in town.                           |"
                + "\n---------------------------------------"
                + "\nS - [S]mile at yourself"
                + "\nQ - [Q]uit back to serching"
                + "\n--------------------------------------");
    }
    

    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "S": // go kill stuff in the High Mountains
                this.smileAtYourself();
                break;
           
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void smileAtYourself() {
        System.out.println("\n*** you stare down at a pool of water and begin smiling  ***"
                         + "\n*** Boy, dont you look hansom!!                          ***");
    }
   
}
