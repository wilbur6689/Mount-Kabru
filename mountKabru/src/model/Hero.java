package model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by badgerwaves on 1/26/16.
 */



public class Hero implements Serializable {

    private String heroClassType;
    private int levelOfHero;
    private int experience;
    private int mana;
    private int strength;


    public Hero() {

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
        return "Hero{" + "heroClassType=" + heroClassType + ", levelOfHero=" + levelOfHero + ", experience=" + experience + ", mana=" + mana + ", strength=" + strength + '}';
    }
    
    
}

