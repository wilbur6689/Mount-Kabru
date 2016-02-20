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
public class AttackMonsView {
    
    private final String attackMonsMenu;
    
    public AttackMonsView() {
    this.attackMonsMenu = "\n"
                + "\n---------------------------------------"
                + "\n|  You found a Monster!!!             |"
                + "\n|                                     |"
                + "\n|  Prepare to fight                   |"
                + "\n---------------------------------------"
                + "\nA - [A]ttack"
                + "\nD - [D]efend"
                + "\nC - [C]ast a spell"
                + "\nQ - [Q]uit back to searching"
                + "\n--------------------------------------";
    }
    
    void displayAttackMonsView() {
          
       boolean done = false; //set flag to done
       do {
          //prompt for and get the players name
          String menuOption = this.getAttackMonsMenuOption();
          if (menuOption.toUpperCase().equals("Q"))  //Player wants to quit
            return; //exit game 
          
          //do the requested action and display the next view
          done = this.doAction(menuOption);
          
       } while (!done);
    }
    
    private String promptMessage;

    private String getAttackMonsMenuOption() {
        
    
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // Value to be Returned
        boolean valid = false; // Initialize to not valid

        while (!valid) { // Loop while an invalid value is enter
          System.out.println ("\n" + this.attackMonsMenu);

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
            case "A": // attack the monster before he kills you
                this.attackMonster();
                break;
            case "D": // defend youself 
                this.defendYourself();
                break;
            case "C": // cast a spell 
                this.castSpell();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void attackMonster() {
        System.out.println("\n*** You slap the monster making him angry  ***");
    }

    private void defendYourself() {
        System.out.println("\n*** You take a defensive stance, and gain nothing  ***");
    }

    private void castSpell() {
        System.out.println("\n*** You begin to chant at the monster and he   ***"
                         + "\n*** askes you 'why are you singing, you sound  ***"
                         + "\n*** horrible?'                                 ***");
    }

}
