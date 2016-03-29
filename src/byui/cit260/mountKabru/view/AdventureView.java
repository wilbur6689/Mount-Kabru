/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

/**
 *
 * @author Phill
 */
public class AdventureView extends View {
    public AdventureView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n|  You wander out of town and try to   |"
                + "\n|  decide what to fight next...        |"
                + "\n----------------------------------------"
                + "\nS - [S]earch for a monster"
                + "\nP - use a [P]otion"
                + "\nC - [C]heck your stats"
                + "\nQ - [Q]uit back to town"
                + "\n--------------------------------------");
    }



    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "S": // go kill stuff in the Jungle
                this.searchForMonster();
                break;
            case "P": // use a potion
                this.usePotion();
                break;
            case "C": // view your inventory
                this.checkStats();
                break;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void searchForMonster() {
        
        //create the Attack Monster view object
        AttackMonsView attackMonsView = new AttackMonsView();
        //display the Attack Monster view
        attackMonsView.display();
    }

    private void usePotion() {
        this.console.println("\n*** you look into your potion pouch and  ***"
                         + "\n*** remember you dont have any potions   ***");
    }

    private void checkStats() {
        this.console.println("You ran the Check stats function");
    }

    }
