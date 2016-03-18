/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import mountkabru.MountKabru;



/**
 *
 * @author Phill
 */
public class MainMenuView extends View {
    
       public MainMenuView() {
                 super("\n   N - Start a new game"
                    + "\n   L - Load Game"
                    + "\n   S - Save Game"
                    + "\n   H - Get Help on how to play the game"
                    + "\n   Q - Quit"
                    + "\n------------------------------------------");}
    
    
    
    
        private String promptMessage;


        @Override
        public boolean doAction(String value) {

            value = value.toUpperCase(); //convert choice to upper case

            switch (value) {
                case "N": // create and start a new game
                    this.startNewGame();
                    break;
                case "L": // load players game
                    this.loadGame();
                    break;
                case "S": //save a players game
                    this.saveGame();
                    break;
                case "H": //help menu
                    this.displayHelpMenu();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");


            }
            return false;
        }

        private void startNewGame() {
            //Create a new game
            GameControl.createNewGame(MountKabru.getPlayer());
            
            // display next view
            NewCharView newCharView = new NewCharView();
            newCharView.display();
        }

        private void loadGame() {
            System.out.println("*** loadGame function called ***");
        }

        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }

        private void displayHelpMenu() {

            // create helpHelpMenuView object
            HelpMenuView helpMenuView = new HelpMenuView();

            //display the help menu view
            helpMenuView.display();
        }

    
    
}
