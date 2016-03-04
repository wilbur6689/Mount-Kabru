package byui.cit260.mountKabru.view;

import java.util.Scanner;

public abstract class View implements ViewInterface {

    protected String displayMessage;

    public View(String message) {
        this.displayMessage = message;
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

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        boolean valid = false; // Initialize to not valid
        String value = null; // Value to be Returned

        while (!valid) { // Loop while an invalid value is enter
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine(); //Get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\n Invalid value: Value can not be blank");
                continue;
            }
            break; // end the loop

        }
        return value;
    }



}
