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
      
       Location[][] locations = world.getLocations();
       
       //start point
        locations[0][0].setEvent(events[EventType.townEvent.ordinal()]);
        locations[0][1].setEvent(events[EventType.plainsMonsterEvent.ordinal()]);
        locations[0][2].setEvent(events[EventType.plainsMonsterEvent.ordinal()]);
        locations[0][3].setEvent(events[EventType.plainsMonsterEvent.ordinal()]);
        locations[0][4].setEvent(events[EventType.plainsMonsterEvent.ordinal()]);
        locations[0][5].setEvent(events[EventType.plainsMonsterEvent.ordinal()]);
        locations[0][6].setEvent(events[EventType.plainsMonsterEvent.ordinal()]);

        locations[1][0].setEvent(events[EventType.jungleMonsterEvent.ordinal()]);
        locations[1][1].setEvent(events[EventType.jungleMonsterEvent.ordinal()]);
        locations[1][2].setEvent(events[EventType.jungleMonsterEvent.ordinal()]);
        locations[1][3].setEvent(events[EventType.jungleMonsterEvent.ordinal()]);
        locations[1][4].setEvent(events[EventType.jungleMonsterEvent.ordinal()]);
        locations[1][5].setEvent(events[EventType.jungleMonsterEvent.ordinal()]);
        locations[1][6].setEvent(events[EventType.jungleMonsterEvent.ordinal()]);

        locations[2][0].setEvent(events[EventType.forestMonsterEvent.ordinal()]);
        locations[2][1].setEvent(events[EventType.forestMonsterEvent.ordinal()]);
        locations[2][2].setEvent(events[EventType.forestMonsterEvent.ordinal()]);
        locations[2][3].setEvent(events[EventType.forestMonsterEvent.ordinal()]);
        locations[2][4].setEvent(events[EventType.forestMonsterEvent.ordinal()]);
        locations[2][5].setEvent(events[EventType.forestMonsterEvent.ordinal()]);
        locations[2][6].setEvent(events[EventType.forestMonsterEvent.ordinal()]);
        
        locations[3][0].setEvent(events[EventType.mountainMonsterEvent.ordinal()]);
        locations[3][1].setEvent(events[EventType.mountainMonsterEvent.ordinal()]);
        locations[3][2].setEvent(events[EventType.mountainMonsterEvent.ordinal()]);
        locations[3][3].setEvent(events[EventType.mountainMonsterEvent.ordinal()]);
        locations[3][4].setEvent(events[EventType.mountainMonsterEvent.ordinal()]);
        locations[3][5].setEvent(events[EventType.mountainMonsterEvent.ordinal()]);
        locations[3][6].setEvent(events[EventType.mountainMonsterEvent.ordinal()]);




    }



 private static Event[] createEvents() {
        Event[] events = new Event[EventType.values().length];

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

    public enum EventType {
        townEvent,
        plainsGoldEvent,
        plainsMonsterEvent,
        jungleGoldEvent,
        jungleMonsterEvent,
        forestGoldEvent,
        forestMonsterEvent,
        mountainGoldEvent,
        mountainMonsterEvent,

    }


}

    
  
    
