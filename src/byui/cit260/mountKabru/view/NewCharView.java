/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.exceptions.GameControlException;
import byui.cit260.mountKabru.model.Hero;

/**
 *
 * @author Phill
 */
public class NewCharView extends View {
    
   
    public NewCharView() {
    super("what is your name, hero?"); 
    }
    
    private String addStats1 =  "\n"
                + "\n--------------------------------------"
                + "\n|      Create a New Character        |"
                + "\n--------------------------------------"
                + "\n1. If a large tree fell on you and you were trapped, would you:"
                + "\n    [ M ] push with all your might?"
                + "\n    [ W ] user your will to think it away?"
                + "\n"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    
    private String addStats2 =  "\n"
                + "\n--------------------------------------"
                + "\n|      Create a New Character        |"
                + "\n--------------------------------------"
                + "\n2. If you are hanging on the edge of a cliff, would you:                         " 
                + "\n    [ M ] Fall,knowing you're strong enough to not die"
                + "\n    [ W ] Use your will to drift to the top?"
                + "\n"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    
    private String addStats3 =  "\n"
                + "\n--------------------------------------"
                + "\n|      Create a New Character        |"
                + "\n--------------------------------------"
                + "\n3. If you are being enticed by delicious pastries, would you:                           " 
                + "\n    [ M ] Be a fatty, and eat all before your eyes?"
                + "\n    [ W ] Be a goody goody and not eat any at all?"
                + "\n"
                + "\nQ - Quit"
                + "\n--------------------------------------";
    
    
    
    @Override
    public boolean doAction(String heroName) {

        // ask questions
        this.displayMessage = this.addStats1;
        String answer1 = this.getInput().toUpperCase();
        
        
         
        this.displayMessage = this.addStats2;
        String answer2 = this.getInput().toUpperCase();
        
        
        
        this.displayMessage = this.addStats3;
        String answer3 = this.getInput().toUpperCase();
        
        //Need to set Hero Name, strength, Mana
        try { 
        GameControl.createHero(heroName, answer1, answer2, answer3);
        } 
        catch (GameControlException me) {
            this.console.println(me.getMessage());
            
        }
        // create and display game menu view
        // create gameMenuView object
        GameMenuView gameMenuView = new GameMenuView();        
        //display the game Menu view
        gameMenuView.display();

        return true;
    }
}
