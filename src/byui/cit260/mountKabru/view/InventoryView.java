/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.InventoryControl;

/**
 *
 * @author Phill
 */
public class InventoryView extends View {
    
    
   
    
    
    public InventoryView() {
    super( "\n"
                + "\n---------------------------------------"
                + "\n|  You look around at what you have   |"
                + "\n|  on hand...                         |"
                + "\n|                                     |"
                + "\n---------------------------------------"
                + "\nC - [C]heck Inventory"
                + "\nQ - [Q]uit back to serching"
                + "\n--------------------------------------");
    }
    

    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "C": // go kill stuff in the High Mountains
                this.checkInv();
                break;
           
            
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void checkInv() {
        
        String inventory[] = InventoryControl.viewInventory();
        String inventoryList = " ";
        for (int i=0; i<inventory.length;i++) {
            
        inventoryList += inventory[i];
        }
        
             this.console.println(inventoryList);
    }
   
}
