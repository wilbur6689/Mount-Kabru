/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import java.util.Scanner;
import model.Player;


/**
 *
 * @author wibur
 */
public class StartProgramView {

    public void displayStartProgramView() {
        
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String playersName = this.getPlayersName();
          if (playersName.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(playersName);
          
       } while (!done);
    }
    
    private String getPlayersName() {
        /*

        While valid value has not been entered
          DISPLAY prompt Message
          GET The value entered from Keyboard
          Trim front and trailing blanks off of the name

          IF the length of the value is blank THEN
            DISPLAY "Invalid Value: The value cannot be blank"
            CONTINUE
          ENDIF

          BREAK

        ENDWHILE
        RETURN name

        */

        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.promptMessage);

          value = keyboard.nextLine(); //Get next line typed on keyboard
          value = value.trim(); // trim off leading and trailing blanks

          if (value.length() < 1){ //value is blank
            System.out.println("\n Invalid value: Value can not be blank");
            continue;
          }
          break; // end the loop

        }

      return value; // Return the value entered
    }

    private boolean doAction(String playersName) {
        /*doAction(playersName): boolean
            BEGIN
             if the length of the playersName < 2 then
             display “Invalid name: The name must be > 1 character”
             return false

             create Player with specified name
             if unsuccessful then
             display “Invalid name: The name is too short”
             return false
             display customized welcome message
             display mainMenuView
             return true
            END */
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: " 
                    + "The name must be greater than one character in length");
            return false;
        
        }
    
        // Call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccessful
            System. out.println("\nError creating the player.");
            return false;
        }

        this.displayNextView(player);
        
        return true;
    }
       
    private void displayNextView(Player player) {
        System.out.println("\n ====================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n ====================================="
                         );
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the main menu view
        mainMenuView.displayMainMenuView();
    }       

    
    
    private String promptMessage;
    
    
    public StartProgramView(){ 
        
        this.promptMessage = "\nPlease enter your name: ";
        
        //display the banner when view is created
        this.displayBanner();
 
    }
    

    public final void displayBanner() {
         
         
        System.out.println(
        "\n____________________________________________________"
        + "\n***************************************************"
        + "\n         ~~Welcome to Mount Kabru!!!!!~~"
        + "\n This game will challange your skills through "
        + "\n patience, knowledge, and a little bit of luck"  
        + "\n***************************************************"
        + "\n---------------------------------------------------" 
        );
    }

    
}
