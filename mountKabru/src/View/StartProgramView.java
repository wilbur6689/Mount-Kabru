/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

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
          if (playersName.toUpperCase().equals("Q"))  //User wants to quit
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
        System.out.println("\n**** doAction() called ***");
        return true;
        }
    

    
       
           
//To change body of generated methods, choose Tools | Templates.
    
    
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
        + "\n         ~~Welcome to Mount Kabru!!!!!~~           "  
        + "\n***************************************************"
        + "\n---------------------------------------------------" 
        );
    }
}
