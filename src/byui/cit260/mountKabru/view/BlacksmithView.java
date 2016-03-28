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
public class BlacksmithView extends View {
    
    
    
    public BlacksmithView() {
           super( "\n"
                + "\n--------------------------------------"
                + "\n|  You straggle into the blacksmith  |"
                + "\n|  hoping to make a deal...          |"
                + "\n--------------------------------------"
                + "\nB - [B]uy weapons and Armor"
                + "\nS - [S]ell weapongs and armor"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------");
    }
    
    
    
    private String promptMessage;
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "B": // Buy weapons and armor from the blacksmith
                this.buyFromBlacksmith();
                break;
            case "S": // Sell your weapons or armor to the blacksmith
                this.sellToBlacksmith();
                break;
                        
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void buyFromBlacksmith() {
        BuyFromBlacksmithView buyFromBlacksmithView = new BuyFromBlacksmithView();
        
        buyFromBlacksmithView.display();
        
        
    }

    private void sellToBlacksmith() {
        SellToBlacksmithView sellToBlacksmith = new SellToBlacksmithView();
        
        sellToBlacksmith.display();
    }
}
