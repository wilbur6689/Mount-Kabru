/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class AdventureView {
    
    private final String adventureMenu;
    
    public AdventureView() {
    this.adventureMenu = "\n"
                + "\n--------------------------------------"
                + "\n|  You wander out of town and try to |"
                + "\n|  decide where to fight next...     |"
                + "\n--------------------------------------"
                + "\nP - Fight in the [P]lains"
                + "\nJ - Fight in the [J]ungle"
                + "\nF - Fight in the dark [F]orest"
                + "\nM - Fight in the high [M]ountains"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------";
    }
    
    void displayAdventureView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getAdventureMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getAdventureMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.adventureMenu);

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
            case "P": // go kill stuff in the plains
                this.plainsAdventure();
                break;
            case "J": // go kill stuff in the jungle
                this.jungleAdventure();
                break;
            case "F": // go kill stuff in the forest
                this.forestAdventure();
                break;
            case "M": // go kill stuff in the mountains
                this.mountainAdventure();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void plainsAdventure() {
        //Create plains View object
        PlainsView plainsView = new PlainsView();
                
        //Display the plains view
        plainsView.displayPlainsView();
    }

    private void jungleAdventure() {
        //Create plains View object
        JungleView jungleView = new JungleView();
                
        //Display the plains view
        jungleView.displayJungleView();
    }

    private void forestAdventure() {
        //Create plains View object
        DarkForestView darkForestView = new DarkForestView();
                
        //Display the plains view
        darkForestView.displayForestView();
    }

    private void mountainAdventure() {
        //Create plains View object
        HighMountainView highMountainView = new HighMountainView();
                
        //Display the plains view
        highMountainView.displayMountainView();
    }
}
