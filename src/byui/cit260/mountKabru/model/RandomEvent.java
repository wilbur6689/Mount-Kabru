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
public class RandomEvent implements Serializable{
    
    //class instance variables
    private String monsterEvent;
    private String weirdEvent;
    private int goldEvent;
    private String barKeeperEvent;
    private String bossEvent;
    
    private Actor actor;
    private Location location;

    public RandomEvent() {
    }

    

    
    
    public String getMonsterEvent() {
        return monsterEvent;
    }

    public void setMonsterEvent(String monsterEvent) {
        this.monsterEvent = monsterEvent;
    }

    public String getWeirdEvent() {
        return weirdEvent;
    }

    public void setWeirdEvent(String weirdEvent) {
        this.weirdEvent = weirdEvent;
    }

    public int getGoldEvent() {
        return goldEvent;
    }

    public void setGoldEvent(int goldEvent) {
        this.goldEvent = goldEvent;
    }

    public String getBarKeeperEvent() {
        return barKeeperEvent;
    }

    public void setBarKeeperEvent(String barKeeperEvent) {
        this.barKeeperEvent = barKeeperEvent;
    }

    public String getBossEvent() {
        return bossEvent;
    }

    public void setBossEvent(String bossEvent) {
        this.bossEvent = bossEvent;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.monsterEvent);
        hash = 37 * hash + Objects.hashCode(this.weirdEvent);
        hash = 37 * hash + Objects.hashCode(this.goldEvent);
        hash = 37 * hash + Objects.hashCode(this.barKeeperEvent);
        hash = 37 * hash + Objects.hashCode(this.bossEvent);
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
        final RandomEvent other = (RandomEvent) obj;
        if (!Objects.equals(this.monsterEvent, other.monsterEvent)) {
            return false;
        }
        if (!Objects.equals(this.weirdEvent, other.weirdEvent)) {
            return false;
        }
        if (!Objects.equals(this.goldEvent, other.goldEvent)) {
            return false;
        }
        if (!Objects.equals(this.barKeeperEvent, other.barKeeperEvent)) {
            return false;
        }
        return Objects.equals(this.bossEvent, other.bossEvent);
    }

    @Override
    public String toString() {
        return "RandomEvent{" + "monsterEvent=" + monsterEvent + ", weirdEvent=" + weirdEvent + ", goldEvent=" + goldEvent + ", barKeeperEvent=" + barKeeperEvent + ", bossEvent=" + bossEvent + '}';
    }

    

    
    
    }
