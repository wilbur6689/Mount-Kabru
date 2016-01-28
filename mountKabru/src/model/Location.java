/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author wibur
 */
public class Location implements Serializable {
    
    private char row;
    private int column;
    private String areaExplored;

    public Location() {
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getAreaExplored() {
        return areaExplored;
    }

    public void setAreaExplored(String areaExplored) {
        this.areaExplored = areaExplored;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.row;
        hash = 29 * hash + this.column;
        hash = 29 * hash + Objects.hashCode(this.areaExplored);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return Objects.equals(this.areaExplored, other.areaExplored);
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", areaExplored=" + areaExplored + '}';
    }

    
    
    
    
}
