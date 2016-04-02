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
                + "\nW - buy a [W]eapon"
                + "\nA - buy some [A]rmor"
                + "\nS - [S]ell to the Blacksmith"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------");
    }
    
    
    
    private String promptMessage;
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "W": // Buy weapons and armor from the blacksmith
                this.buyWeapon();
                return true;
            case "A": // Buy weapons and armor from the blacksmith
                this.buyArmor();
                return true;
            case "S": // Sell your weapons or armor to the blacksmith
                this.sellToBlacksmith();
                return true;
                        
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void buyWeapon() {
        BuyWeaponView buyWeapon = new BuyWeaponView();
        buyWeapon.display();
    }

    private void buyArmor() {
        BuyArmorView buyArmor = new BuyArmorView();
        buyArmor.display();
    }
    
    private void sellToBlacksmith() {
        SellToBlacksmithView sellToBlacksmith = new SellToBlacksmithView();
        
        sellToBlacksmith.display();
    }
}
