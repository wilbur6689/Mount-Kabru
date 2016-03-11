package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.RandomEvent;
import byui.cit260.mountKabru.model.World;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class WorldControl {

    public static World createWorld() {
        
        World world = new World(20,20);
        
        //create a list of the different random Events in the game
        RandomEvent[] randomEvent = WorldControl.createRandomEvents();
        
        //assign the different scences to locations in the map
        assignRandomEventToLocations(world, randomEvent);
                
        return world;
    }

    static void moveActorToStartingLocation(World world) {
        System.out.println("*** Move Actor Function Called. ***");
        
    }

    private static RandomEvent[] createRandomEvents() {
        RandomEvent[] randomEvents = new RandomEvent[20];
        
        RandomEvent goldEvent = new RandomEvent();
        randomEvents[0] = goldEvent;
        
        
        
        
        
        return randomEvent;
    
    }

    private static void assignRandomEventToLocations(World world, RandomEvent[] randomEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
