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
public class Actor implements Serializable{
    
    
    
    //class instance variables
    private String name;
    private int maxHitPoints;
    private int currentHitPoints;
    private int defense;
    private int attack;
    private int spellAttack;
    private int xpGained;
    private int gold;
    
    private Event[] randomEvent;
    private Game game;

    public Actor() {
        
    }

    public Actor(String name, int maxHitPoints, int currentHitPoints, int defence, int attack, int spellAttack, int xpGained, int gold) {
        this.name = name;
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = currentHitPoints;
        this.defense = defence;
        this.attack = attack;
        this.spellAttack = spellAttack;
        this.xpGained = xpGained;
        this.gold = gold;
    }

    

    
    
    public Event[] getRandomEvent() {
        return randomEvent;
    }

    public void setRandomEvent(Event[] randomEvent) {
        this.randomEvent = randomEvent;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpellAttack() {
        return spellAttack;
    }

    public void setSpellAttack(int spellAttack) {
        this.spellAttack = spellAttack;
    }
    

    public int getXpGained() {
        return xpGained;
    }

    public void setXpGained(int xpGained) {
        this.xpGained = xpGained;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.maxHitPoints;
        hash = 37 * hash + this.defense;
        hash = 37 * hash + this.attack;
        hash = 37 * hash + this.xpGained;
        hash = 37 * hash + this.gold;
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
        final Actor other = (Actor) obj;
        if (this.maxHitPoints != other.maxHitPoints) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.xpGained != other.xpGained) {
            return false;
        }
        if (this.gold != other.gold) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", maxHitPoints=" + maxHitPoints + ", currentHitPoints=" + currentHitPoints + ", defence=" + defense + ", attack=" + attack + ", chanceToHit=" + xpGained + ", gold=" + gold + '}';
    }

    
    
    
    
}
