/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class MainMenuView {
    
    private final String menu;
    
    public MainMenuView() {
    this.menu = "\n"
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
                + "\n------------------------------------------";
    }
    
    void displayMainMenuView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.menu);

          value = keyboard.nextLine(); //Get next line typed on keyboard
          value = value.trim(); // trim off leading and trailing blanks

          if (value.length() < 1){ //value is blank
            System.out.println("\n Invalid value: Value can not be blank");
            continue;
          }
          break; // end the loop

        }
      return value;
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
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
