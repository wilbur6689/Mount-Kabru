package byui.cit260.mountKabru.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by badgerwaves on 1/26/16.
 */



public class Hero extends Actor implements  Serializable  {

    private String heroName;
    private String heroClassType;
    private int levelOfHero;
    private int xpToNextLevel;
    private int experience;
    private int mana;
    private int strength;
 
    private Location currentLocation;
    private Actor foundMonster;
    private Player player;
    private Inventory inventory;

    
     

    public Hero() {
        
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Hero(String heroName, String heroClassType, int levelOfHero, int xpToNextLevel, int experience, int mana, int strength, Player player, Inventory inventory, String name, int currentHitPoints, int defence, int attack, int spellAttack, int xpGained, int gold) {
        super(name, currentHitPoints, defence, attack, spellAttack, xpGained, gold);
        this.heroName = heroName;
        this.heroClassType = heroClassType;
        this.levelOfHero = levelOfHero;
        this.xpToNextLevel = xpToNextLevel;
        this.experience = experience;
        this.mana = mana;
        this.strength = strength;
        this.player = player;
        this.inventory = inventory;
    }

    

    

    

    public Hero(String heroName, String heroClassType, int levelOfHero, int experience, int mana, int strength) {
        this.heroName = heroName;
        this.heroClassType = heroClassType;
        this.levelOfHero = levelOfHero;
        this.experience = experience;
        this.mana = mana;
        this.strength = strength;
    }

    
    public String getHeroName() {
        return heroName;
    }
    
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    
    public String getHeroClassType() {
        return heroClassType;
    }

    public void setHeroClassType(String heroClassType) {
        this.heroClassType = heroClassType;
    }

    public int getLevelOfHero() {
        return levelOfHero;
    }

    public void setLevelOfHero(int levelOfHero) {
        this.levelOfHero = levelOfHero;
    }

    public int getXpToNextLevel() {
        return xpToNextLevel;
    }

    public void setXpToNextLevel(int xpToNextLevel) {
        this.xpToNextLevel = xpToNextLevel;
    }
    
    

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
     public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Actor getFoundMonster() {
        return foundMonster;
    }

    public void setFoundMonster(Actor foundMonster) {
        this.foundMonster = foundMonster;
    }
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.heroClassType);
        hash = 29 * hash + this.levelOfHero;
        hash = 29 * hash + this.experience;
        hash = 29 * hash + this.mana;
        hash = 29 * hash + this.strength;
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
        final Hero other = (Hero) obj;
        if (this.levelOfHero != other.levelOfHero) {
            return false;
        }
        if (this.experience != other.experience) {
            return false;
        }
        if (this.mana != other.mana) {
            return false;
        }
        if (this.strength != other.strength) {
            return false;
        }
        if (!Objects.equals(this.heroClassType, other.heroClassType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Here is your Hero:{" + "\n Hero Name = " + heroName + "\n Hero Class Type = " + heroClassType + "\n Level of Your Hero = " + levelOfHero + "\n Experience = " + experience + "\n Mana = " + mana + "\n Strength = " + strength + '}';
    }
    
    
    
}

