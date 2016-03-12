package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.RandomEvent;
import byui.cit260.mountKabru.model.World;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class WorldControl {

    public World createWorld() {
        
        World world = new World(20,20);
        
        //create a list of the different random Events in the game
        RandomEvent[] randomEvent = WorldControl.createRandomEvents();
        
        setWorldLocations();
                
        return world;
    }

  
    private static RandomEvent[] createRandomEvents() {
        RandomEvent[] randomEvents = new RandomEvent[20];
        
        RandomEvent goldEvent = new RandomEvent();
        randomEvents[0] = goldEvent;
        
        
        
        
        
        return randomEvent;
    
    }

    private void setWorldLocations() {
      
        Location[][] locations = world.getLocations();
        
        for(int i = 0;i<locations.length;i++) {
            for(int x=0;x<locations[i].length;x++) {
                
                //Location newLocation = new Location(String name, Event[] events, boolean discovered)
                
                event[] events = new Event[2];
                events[0] = new Event("Gold", "Get Rich", "you found the motherload");
                events[1] = new Event("Monster", "You are going to die", "Boogeyman gotcha");
                Location newLocation = new Location("location Name", events, false);
                
                locations[i][x] = newLocation;
            }
        }
        
        world.setLocations(locations);
    }
    
   
}
