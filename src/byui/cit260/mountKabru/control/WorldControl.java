package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Event;
import byui.cit260.mountKabru.model.Location;
import byui.cit260.mountKabru.model.World;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class WorldControl {

    public World createWorld() {
        
        World world = new World(4,8);
        
        //Create all the events for the game
        Event[] events = createEvents();
        
        //set all the events to each location in the world
        setEventsToLocations(world, events);
                
        return world;
    }


    private static void setEventsToLocations(World world, Event[] events) {
      
        
        Location[][] locations = world.getLocations();
        
          for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setDiscovered(false);
        
        
        //Start Point
        locations[0][0].setEvents(events);
        locations[0][1].setEvents(events);
        locations[0][2].setEvents(events);
        locations[0][3].setEvents(events);
        locations[0][4].setEvents(events);
        locations[0][5].setEvents(events);        
        locations[0][6].setEvents(events);
        locations[0][7].setEvents(events[events.town]);
        locations[0][8].setEvents(events[events.town]);
        locations[0][9].setEvents(events[events.town]);
        
        
        
        
       
//        
//        for(int i = 0;i<locations.length;i++) {
//            for(int x=0;x<locations[i].length;x++) {
//                
//                //Location newLocation = new Location(String name, Event[] events, boolean discovered)
//                
//                Event[] events = new Event[2];
//                events[0] = new Event("Gold", "Get Rich", "you found the motherload");
//                events[1] = new Event("Monster", "You are going to die", "Boogeyman gotcha");
//                Location newLocation = new Location("location Name", events, false);
//                
//                locations[i][x] = newLocation;
//            }
//        }
//        
//        World.setLocations(locations);
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
