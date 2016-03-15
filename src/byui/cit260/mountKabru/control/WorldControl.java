package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Event;
import byui.cit260.mountKabru.model.Location;
import byui.cit260.mountKabru.model.World;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class WorldControl {

    public static World createWorld() {
        
        World world = new World(4,8);
        
        //Create all the events for the game
        Event[] events = createEvents();
        
        //set all the events to each location in the world
        setEventsToLocations(world, events);
                
        return world;
    }


    private static void setEventsToLocations(World world, Event[] events) {
      
        int rowCount = world.getRowCount();
        int columnCount = world.getColumnCount(); 
        Location[][] locations = world.getLocations();
        
          for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
               locations[row][column].setEvents(events);
        
            }
            
          }

    }
    
  
    
    private static Event[] createEvents() {
        Event[] events = new Event[9];
        
        Event townEvent = new Event("Town", "Town", "You return to Town!", "you look around for a place to shop");
        events[0] = townEvent;
        
        Event plainsGoldEvent = new Event("Gold", "plains", "You Found Gold!", "you found the motherload");
        events[1] = plainsGoldEvent;
        
        Event plainsMonsterEvent = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling");
        events[2] = plainsMonsterEvent;
        
        Event jungleGoldEvent = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload");
        events[3] = jungleGoldEvent;
        
        Event jungleMonsterEvent = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling");
        events[4] = jungleMonsterEvent;
        
        Event forestGoldEvent = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload");
        events[5] = forestGoldEvent;
        
        Event forestMonsterEvent = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling");
        events[6] = forestMonsterEvent;
        
        Event mountainGoldEvent = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload");
        events[7] = mountainGoldEvent;
        
        Event mountainMonsterEvent = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling");
        events[8] = mountainMonsterEvent;
        
        
        
        return events;
    
    }
    
    
   
}
