/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import byui.cit260.mountKabru.control.WorldControl;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author wibur
 */
public class Location implements Serializable {

    private String locationName;
    private Event[] events;
    private boolean discovered;
    private int row;
    private int column;

    public Location() {

    }

    public Location(String locationName, Event[] events, boolean discovered, int row, int column) {
        this.locationName = locationName;
        this.events = events;
        this.discovered = discovered;
        this.row = row;
        this.column = column;
    }


    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }

    public boolean isDiscovered() {
        return discovered;
    }

    public void setDiscovered(boolean discovered) {
        this.discovered = discovered;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }


    public void createEvents(Event x) {
        {
            Event[] event = new Event[WorldControl.EventType.values().length];

            Event townEvent = new Event("Town", "Town", "You return to Town!", "you look around for a place to shop");
            event[0] = townEvent;

            Event plainsGoldEvent = new Event("Gold", "plains", "You Found Gold!", "you found the motherload");
            event[1] = plainsGoldEvent;

            Event plainsMonsterEvent = new Event("Monster", "plains", "You Found a Monster!", "Prepare for Battle weakling");
            event[2] = plainsMonsterEvent;

            Event jungleGoldEvent = new Event("Gold", "Jungle", "You Found Gold!", "you found the motherload");
            event[3] = jungleGoldEvent;

            Event jungleMonsterEvent = new Event("Monster", "Jungle", "You Found a Monster!", "Prepare for Battle weakling");
            event[4] = jungleMonsterEvent;

            Event forestGoldEvent = new Event("Gold", "Forest", "You Found Gold!", "you found the motherload");
            event[5] = forestGoldEvent;

            Event forestMonsterEvent = new Event("Monster", "Forest", "You Found a Monster!", "Prepare for Battle weakling");
            event[6] = forestMonsterEvent;

            Event mountainGoldEvent = new Event("Gold", "Mountain", "You Found Gold!", "you found the motherload");
            event[7] = mountainGoldEvent;

            Event mountainMonsterEvent = new Event("Monster", "Mountain", "You Found a Monster!", "Prepare for Battle weakling");
            event[8] = mountainMonsterEvent;
        }
    }
}
