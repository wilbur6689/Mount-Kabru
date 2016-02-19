/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
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
