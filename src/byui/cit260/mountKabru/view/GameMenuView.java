/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.control.InventoryControl;
import byui.cit260.mountKabru.model.Hero;
import byui.cit260.mountKabru.model.Location;
import mountkabru.MountKabru;


/**
 *
 * @author Phill
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
           super( "\n"
               + "\n|----------------------------------------|"
               + "\n|                                   ___  |"
               + "\n|                _                 /   \\ |"
               + "\n|             __|_|______         /     \\|"
               + "\n|   __       |      _ _  |    ___|       |"
               + "\n|  /  `_     |  _  |_|_| |   |   |       |"
               + "\n| |  _  |    | | | |_|_| |   |___|    _  |"
               + "\n|_|_|_|_|____|_|_|_______|___|_|_|___|_|_|"
               + "\n|                                        |"
               + "\n|    This here be the Town of Kabru      |"
               + "\n|                                        |"
               + "\n|----------------------------------------|"
               + "\n"
               + "\n"  + MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getName()
               + "\n"
               + "\n  A - go on an [A]dventure"
               + "\n  T - visit the [T]avern"
               + "\n  B - visit the [B]lacksmith"
               + "\n  P - Visit the [P]rint Shop"
               + "\n  C - [C]haracter stats"
               + "\n  I - [I]nventory "
               + "\n  G - [G]et Information from the Old Man"
               + "\n  H - please [H]elp!"
               + "\n  S - [S]ave Game"
               + "\n  Q - [Q]uit"
               + "\n--------------------------------------");
    }
    
    
    private String promptMessage;

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "A": // go kill stuff on an adventure
                this.goAdventure();
                break;
            case "T": // visit the tavern in town
                this.goTavern();
                break;
            case "B": // visit the blacksmith in town
                this.goBlacksmith();
                break;
            case "P": // visit the blacksmith in town
                this.goPrintShop();
                break;
            case "C": // visit the blacksmith in town
                this.goCharStats();
                break;
            case "I": // visit the blacksmith in town
                InventoryControl.viewInventory();
                break;
            case "G": // Get Information about the game
                this.goGameInfo();
                break;
            case "H": //help menu
                this.displayHelpMenu();
                break;
            case "S": //help menu
                this.saveGame();
                break;
            case "Q": //help menu
                this.quitGame();
                break;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    public void goAdventure() {
         
        //Show the player the map
         Location[][] locations = MountKabru.getCurrentGame().getWorld().getLocations();
         int rowCount = MountKabru.getCurrentGame().getWorld().getRowCount();
         int columnCount = MountKabru.getCurrentGame().getWorld().getColumnCount();
         
         
         this.console.println("This is the map of the world");
         
         
        for (int row = rowCount-1; row >= 0; row--) {
            
            this.console.print(" " + (row+1) + " ");
            for (int column = 0; column < columnCount; column++) {
                this.console.print("|");
                Location location = locations[row][column];
                boolean discovered = location.isDiscovered(); 
                if (discovered == true) {
                 this.console.print("---");
                 this.console.print("/\\");
                }
                else {
                 this.console.print("---");   
                 this.console.print("??");
                }
                this.console.print("---");
            }
        this.console.print("| \n");
        }
                
       this.console.println("   |   1    |   2    |   3    |   4    |   5    |   6    |   7    |   8    |"); 
         
       AdventureView adventureView = new AdventureView();
       adventureView.display();
    }

    public void goTavern() {
        
        //create the tavern view object
        TavernView tavernView = new TavernView();
        //display the tavern view
        tavernView.display();
    }

    public void goBlacksmith() {
        
        //create the tavern view object
        BlacksmithView blacksmithView = new BlacksmithView();
        //display the tavern view
        blacksmithView.display();
    }
    
    private void goPrintShop() {
        
        PrintReportView printShop = new PrintReportView();
        printShop.display();
    }
    
    private void goCharStats() {
        Hero hero = MountKabru.getCurrentGame().getHero();
        this.console.println(hero);
    }
    
    private void goGameInfo() {
        GameInfoView gameInfoView = new GameInfoView();
        
        gameInfoView.display();
        
    }
    
    public void displayHelpMenu() {
        
         // create helpHelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        //display the help menu view
        helpMenuView.display();
    }

    private void saveGame() {
        
       new SaveGameView().display();
        
    }
    
    private void quitGame() {
        System.exit(0);
    }

    

    

    

    

    
}
