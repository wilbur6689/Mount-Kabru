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
public class MainMenuView extends View {
    
       public MainMenuView() {
                 super("\n"
                    + "\n|----------------------------------------|"
                    + "\n|                                   ___  |"
                    + "\n|                _                 /   i |"
                    + "\n|             __|_|______         /     i|"
                    + "\n|   __       |      _ _  |    ___|       |"
                    + "\n|  /  `_     |  _  |_|_| |   |   |       |"
                    + "\n| |  _  |    | | | |_|_| |   |___|    _  |"
                    + "\n|_|_|_|_|____|_|_|_______|___|_|_|___|_|_|"
                    + "\n|                                        |"
                    + "\n|             ~~~Main Menu~~~            |"
                    + "\n|                                        |"
                    + "\n|----------------------------------------|"
                    + "\n   N - Start a new game"
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


            //Create newCharView object
            NewCharView newCharView = new NewCharView();

            //Display the newCharView
            newCharView.displayNewCharView();
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
            helpMenuView.displayHelpMenuView();
        }

    
    
}
