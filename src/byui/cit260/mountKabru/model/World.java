/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author wibur
 */
public class World implements Serializable {
    
    private int rowCount;
    private int columnCount;
    private Location[][] locations;
    
    public World() {
    }

    public World(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The numbe of rows and columns must be > Zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;   
        this.locations = new Location[rowCount][columnCount];
       
            for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setDiscovered(false);
                
                //assign the Location object to the current position in the array
                locations[row][column] = location;
            }
        }
        

        
    }
    


    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }


    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.rowCount;
        hash = 97 * hash + this.columnCount;
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
        final World other = (World) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "World{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    

    
    
    
    
}

    
    