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

        World world = new World(4, 8);

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
        locations[0][0].setEvent(events[EventControl.EventType.plainsEvent1.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][1].setEvent(events[EventControl.EventType.plainsEvent2.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][2].setEvent(events[EventControl.EventType.plainsEvent3.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][3].setEvent(events[EventControl.EventType.plainsEvent4.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][4].setEvent(events[EventControl.EventType.plainsEvent5.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][5].setEvent(events[EventControl.EventType.plainsEvent6.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][6].setEvent(events[EventControl.EventType.plainsEvent7.ordinal()][EventControl.pickRandomNumber()]);
        locations[0][7].setEvent(events[EventControl.EventType.plainsEvent8.ordinal()][EventControl.pickRandomNumber()]);

        locations[1][0].setEvent(events[EventControl.EventType.jungleEvent1.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][1].setEvent(events[EventControl.EventType.jungleEvent2.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][2].setEvent(events[EventControl.EventType.jungleEvent3.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][3].setEvent(events[EventControl.EventType.jungleEvent4.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][4].setEvent(events[EventControl.EventType.jungleEvent5.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][5].setEvent(events[EventControl.EventType.jungleEvent6.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][6].setEvent(events[EventControl.EventType.jungleEvent7.ordinal()][EventControl.pickRandomNumber()]);
        locations[1][7].setEvent(events[EventControl.EventType.jungleEvent8.ordinal()][EventControl.pickRandomNumber()]);

        locations[2][0].setEvent(events[EventControl.EventType.forestEvent1.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][1].setEvent(events[EventControl.EventType.forestEvent2.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][2].setEvent(events[EventControl.EventType.forestEvent3.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][3].setEvent(events[EventControl.EventType.forestEvent4.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][4].setEvent(events[EventControl.EventType.forestEvent5.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][5].setEvent(events[EventControl.EventType.forestEvent6.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][6].setEvent(events[EventControl.EventType.forestEvent7.ordinal()][EventControl.pickRandomNumber()]);
        locations[2][7].setEvent(events[EventControl.EventType.forestEvent8.ordinal()][EventControl.pickRandomNumber()]);

        locations[3][0].setEvent(events[EventControl.EventType.mountainEvent1.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][1].setEvent(events[EventControl.EventType.mountainEvent2.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][2].setEvent(events[EventControl.EventType.mountainEvent3.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][3].setEvent(events[EventControl.EventType.mountainEvent4.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][4].setEvent(events[EventControl.EventType.mountainEvent5.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][5].setEvent(events[EventControl.EventType.mountainEvent6.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][6].setEvent(events[EventControl.EventType.mountainEvent7.ordinal()][EventControl.pickRandomNumber()]);
        locations[3][7].setEvent(events[EventControl.EventType.mountainEvent8.ordinal()][EventControl.pickRandomNumber()]);

        //MountKabru.getCurrentGame().getWorld().setLocations(locations);
    }

    public static Location getLocation(int row, int column) {
        Location[][] location = MountKabru.getCurrentGame().getWorld().getLocations();
        row -= 1;
        column -= 1;
        return location[row][column];
    }

}
