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
    private int experience;
    private int mana;
    private int attack;


    public Hero() {

    }

    public Hero(String heroName, String heroClassType, int levelOfHero, int experience, int mana, int attack) {
        this.heroName = heroName;
        this.heroClassType = heroClassType;
        this.levelOfHero = levelOfHero;
        this.experience = experience;
        this.mana = mana;
        this.attack = attack;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.heroClassType);
        hash = 29 * hash + this.levelOfHero;
        hash = 29 * hash + this.experience;
        hash = 29 * hash + this.mana;
        hash = 29 * hash + this.attack;
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
        if (this.attack != other.attack) {
            return false;
        }
        if (!Objects.equals(this.heroClassType, other.heroClassType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hero{" + "heroClassType=" + heroClassType + ", levelOfHero=" + levelOfHero + ", experience=" + experience + ", mana=" + mana + ", attack=" + attack + '}';
    }
    
    
}

