/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import java.util.Scanner;
import model.Hero;

/**
 *
 * @author Phill
 */
public class NewCharView {
    
    private String promptMessage;
    private String addStats =  "\n"
                + "\n--------------------------------------"
                + "\n|      Create a New Character        |"
                + "\n--------------------------------------"
                + "\n1. If a large tree fell on you and you were trapped, would you:"
                + "\n    [ M ] push with all your might?"
                + "\n    [ W ] user your will to think it away?"
                + "\n"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    
    
    public NewCharView() {
    this.promptMessage = "what is your name, hero?"; 
    }
    
    void displayNewCharView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getUserInput();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    

    private String getUserInput() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println (this.promptMessage);

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

    private boolean doAction(String heroName) {
        
        // create Hero
        
        Hero hero = new Hero(heroName, "Warrior", 1, 100, 5, 5);
        
        // ask questions
        this.promptMessage = this.addStats;
        String answer = this.getUserInput().toUpperCase();
        
        if (answer.equals("M")) {
            hero.setStrength(10);
        }
        else if (answer.equals("W")) {
            hero.setMana(10);
        }
        else {
            System.out.println("You entered an invalid responce, please try again");
            return false;
        }
         
        
        GameControl.createNewGame(hero);
        
        // create and display game menu view
        // create gameMenuView object
        GameMenuView gameMenuView = new GameMenuView();
        
        //display the game Menu View 
        gameMenuView.displayGameMenuView();

       
        return false;
    }

    

    
}
