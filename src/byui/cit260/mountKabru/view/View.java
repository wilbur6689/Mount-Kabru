package byui.cit260.mountKabru.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import mountkabru.MountKabru;

public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard;
    protected final PrintWriter console;

    public View(String message) {
        this.displayMessage = message;
        
        keyboard = MountKabru.getInFile();
        console = MountKabru.getOutFile();
    }
    

    @Override
    public void display() {

        boolean done = false; //set flag to done
        do {
            //prompt for and get the players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) { //Player wants to quit
                return; //exit game 
            }

            //do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }


    public String getInput() {

        
        boolean valid = false; // Initialize to not valid
        String value = null; // Value to be Returned

        while (!valid) { // Loop while an invalid value is enter
            this.console.println("\n" + this.displayMessage);
            try {
            value = this.keyboard.readLine(); //Get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            } catch (Exception e) {
             this.console.println(e.getMessage());
         }

            if (value.length() < 1) { //value is blank
                this.console.println("\n Invalid value: Value can not be blank");
                continue;
            }
            break; // end the loop

        }
        return value;
    }



}
