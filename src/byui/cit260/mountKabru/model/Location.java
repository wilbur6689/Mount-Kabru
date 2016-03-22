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
    private Event event;
    private boolean discovered;
    private int row;
    private int column;

    public Location() {

    }

    public Location(String locationName, boolean discovered, int row, int column) {
        this.locationName = locationName;
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

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
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


    
}
