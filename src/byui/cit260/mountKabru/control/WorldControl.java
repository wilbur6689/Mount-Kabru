package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Event;
import byui.cit260.mountKabru.model.Location;
import byui.cit260.mountKabru.model.World;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class WorldControl {

    public World createWorld() {
        
        World world = new World(20,20);
        
        createEvents();
        setWorldLocations();
                
        return world;
    }


    private static void setWorldLocations(World world) {
      
        
        Location[][] locations = world.getLocations();
        
        
        //Start Point
        locations[0][0].setLocations(locations[LocationType]);
        locations[0][1].setLocations
        locations[0][2].setLocations
        locations[0][3].setLocations
        locations[0][4].setLocations
        locations[0][5].setLocations        
        locations[0][6].setLocations
        locations[0][7].setLocations
        locations[0][8].setLocations
        locations[0][9].setLocations
        
        
        
        
       
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
        Event[] events = new Event[8];
        
        Event plainsGoldEvent = new Event("Gold", "You Found Gold!", "you found the motherload");
        events[0] = plainsGoldEvent;
        
        Event plainsMonsterEvent = new Event("Monster", "You Found a Monster!", "Prepare for Battle weakling");
        events[1] = plainsMonsterEvent;
        
        Event jungleGoldEvent = new Event("Gold", "You Found Gold!", "you found the motherload");
        events[2] = jungleGoldEvent;
        
        Event jungleMonsterEvent = new Event("Monster", "You Found a Monster!", "Prepare for Battle weakling");
        events[3] = jungleMonsterEvent;
        
        Event forestGoldEvent = new Event("Gold", "You Found Gold!", "you found the motherload");
        events[4] = forestGoldEvent;
        
        Event forestMonsterEvent = new Event("Monster", "You Found a Monster!", "Prepare for Battle weakling");
        events[5] = forestMonsterEvent;
        
        Event mountainGoldEvent = new Event("Gold", "You Found Gold!", "you found the motherload");
        events[6] = mountainGoldEvent;
        
        Event mountainMonsterEvent = new Event("Monster", "You Found a Monster!", "Prepare for Battle weakling");
        events[7] = mountainMonsterEvent;
        
        
        return events;
    
    }
    
   
}
