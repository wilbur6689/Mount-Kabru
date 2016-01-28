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
public class World implements Serializable {
    
    private char rowCount;
    private byte columnCount;

    public World() {
    }

    public char getRowCount() {
        return rowCount;
    }

    public void setRowCount(char rowCount) {
        this.rowCount = rowCount;
    }

    public byte getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(byte columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.rowCount;
        hash = 67 * hash + this.columnCount;
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
        return this.columnCount == other.columnCount;
    }

    @Override
    public String toString() {
        return "World{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    
    
}
