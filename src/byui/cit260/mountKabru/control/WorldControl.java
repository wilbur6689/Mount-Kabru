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
        RandomEvent[] randomEvent = createRandomEvent[];
        
        //assign the different scences to locations in the map
        assignRandomEventToLocations(map, randomEvent);
                
        return world;
    }

    static void moveActorToStartingLocation(World world) {
        System.out.println("*** Move Actor Function Called. ***");
        
    }
    
   
}
