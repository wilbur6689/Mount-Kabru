package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.exceptions.GameControlException;
import byui.cit260.mountKabru.model.Event;
import byui.cit260.mountKabru.model.Location;
import byui.cit260.mountKabru.model.World;
import mountkabru.MountKabru;

/**
 * Created by badgerwaves on 2/10/16.
 */
   public class WorldControl {

    public static World createWorld() throws GameControlException {
        
        World world = new World(4,8);
        
        //Create all the events for the game
        Event[][] events = EventControl.createEvents();
        
        //set all the events to each location in the world
        setEventsToLocations(world, events);
                
        return world;
    }
    
     
        


       public static void setEventsToLocations(World world, Event[][] events) {
      
       Location[][] locations = world.getLocations();
      
       //start point
        //locations[0][0].setEvent(events[EventType.townEvent.ordinal()][]);
        locations[0][0].setEvent(events[EventControl.EventType.plainsEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][1].setEvent(events[EventControl.EventType.plainsEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][2].setEvent(events[EventControl.EventType.plainsEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][3].setEvent(events[EventControl.EventType.plainsEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][4].setEvent(events[EventControl.EventType.plainsEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][5].setEvent(events[EventControl.EventType.plainsEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][6].setEvent(events[EventControl.EventType.plainsEvent.ordinal()][EventControl.pickRandomNumber()]);

        locations[1][0].setEvent(events[EventControl.EventType.jungleEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][1].setEvent(events[EventControl.EventType.jungleEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][2].setEvent(events[EventControl.EventType.jungleEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][3].setEvent(events[EventControl.EventType.jungleEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][4].setEvent(events[EventControl.EventType.jungleEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][5].setEvent(events[EventControl.EventType.jungleEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][6].setEvent(events[EventControl.EventType.jungleEvent.ordinal()][EventControl.pickRandomNumber()]);

        locations[2][0].setEvent(events[EventControl.EventType.forestEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][1].setEvent(events[EventControl.EventType.forestEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][2].setEvent(events[EventControl.EventType.forestEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][3].setEvent(events[EventControl.EventType.forestEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][4].setEvent(events[EventControl.EventType.forestEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][5].setEvent(events[EventControl.EventType.forestEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][6].setEvent(events[EventControl.EventType.forestEvent.ordinal()][EventControl.pickRandomNumber()]);
        
        locations[3][0].setEvent(events[EventControl.EventType.mountainEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][1].setEvent(events[EventControl.EventType.mountainEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][2].setEvent(events[EventControl.EventType.mountainEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][3].setEvent(events[EventControl.EventType.mountainEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][4].setEvent(events[EventControl.EventType.mountainEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][5].setEvent(events[EventControl.EventType.mountainEvent.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][6].setEvent(events[EventControl.EventType.mountainEvent.ordinal()][EventControl.pickRandomNumber()]);
        
        //MountKabru.getCurrentGame().getWorld().setLocations(locations);
    }

       public static Location getLocation(int row, int column){
           Location[][] location = MountKabru.getCurrentGame().getWorld().getLocations();
           row -= 1;
           column -= 1;
           return location[row][column];
       }

}

    
  
    
