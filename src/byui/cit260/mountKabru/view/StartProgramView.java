/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.model.Player;


/**
 *
 * @author wibur
 */
public class StartProgramView extends View {

    public StartProgramView() { 
            super("\n"
                + "\n" 
                + "\n______________________________________________________" 
                + "\n|****************************************************|" 
                + "\n|    88     888                __                    |" 
                + "\n|   88888  888888          ___/**\\             88    |"
                + "\n|    88888888888          /*******\\          88888   |"
                + "\n|   8888888888888        /*********\\       88888888  |"
                + "\n|                       /           \\                |"
                + "\n|             __       /             \\___            |"
                + "\n|            /  \\     /                  \\           |"
                + "\n|           /    \\___/                    \\          |"
                + "\n|       ___/                               \\______   |"
                + "\n|      /                                          \\__|"
                + "\n|     /       ~~Welcome to Mount Kabru!!!!!~~        |" 
                + "\n|    /  This game will challange your skills through |" 
                + "\n|   /   patience, knowledge, and a little bit of luck|"  
                + "\n|****************************************************|"
                + "\n|----------------------------------------------------|"
                + "\n"
                + "\n"
                + "\n Please enter your name: ");}
   
    @Override
    public boolean doAction(String playersName) {
        
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
        mainMenuView.display();
    }       

    
    
   
    
    

    public final void displayBanner() {
         
         
        System.out.println(
          "\n______________________________________________________"
        + "\n|****************************************************|"
        + "\n|    88     888                __                    |"
        + "\n|   88888  888888          ___/**i             88    |"
        + "\n|    88888888888          /*******i          88888   |"
        + "\n|   8888888888888        /*********i       88888888  |"
        + "\n|                       /           i                |"
        + "\n|             __       /             i___            |"
        + "\n|            /  i     /                  i           |"
        + "\n|           /    i___/                    i          |"
        + "\n|       ___/                               i______   |"
        + "\n|      /                                          i__|"
        + "\n|     /       ~~Welcome to Mount Kabru!!!!!~~        |"
        + "\n|    /  This game will challange your skills through |"
        + "\n|   /   patience, knowledge, and a little bit of luck|"  
        + "\n|****************************************************|"
        + "\n|----------------------------------------------------|" 
        );
    }

    
}
