/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.WorldControl;
import byui.cit260.mountKabru.model.Event;
import byui.cit260.mountKabru.model.Location;
import byui.cit260.mountKabru.model.World;
import mountkabru.MountKabru;

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
                + "\nL - What is my [L]ocation?"
                + "\nX - Change location events...(FOR DEBUG ONLY)"
                + "\nR - [R]eturn back to Map"
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
            case "L": // use a potion
                this.curLocation();
                break;
            case "X": // use a potion
                this.changeLocation();
                break;
            case "R": // use a potion
                return true;
            
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

    private void curLocation() {
        String eventType = MountKabru.getCurrentGame().getHero().getCurrentLocation().getEvent().getEventType();
        String locationType = MountKabru.getCurrentGame().getHero().getCurrentLocation().getEvent().getLocationType();
        String eventName = MountKabru.getCurrentGame().getHero().getCurrentLocation().getEvent().getEventName();
        
        this.console.println("This is your event type: " + eventType
                        + "\n This is your location type: " + locationType
                        + "\n this is the event name: " + eventName);
                
    }

    private void changeLocation() {
        World world = MountKabru.getCurrentGame().getWorld();
        Location[][] locations = MountKabru.getCurrentGame().getWorld().getLocations();
        Event[][] events = new Event[locations.length][locations[0].length -1];
        
        for (int i=0;i<locations.length;i++) {
            for (int j=0;j<locations[i].length-1;j++) {
//                events[i][j] = locations[i][j].getEvent();
                System.out.println(locations[i][j].getEvent().getEventType());
            }
        }
        
        
        WorldControl.setEventsToLocations(world, events);
        
        
    }

    }
