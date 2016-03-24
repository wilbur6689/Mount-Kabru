/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;
import java.util.Objects;

import java.io.Serializable;

/**
 *
 * @author wibur
 */
public class Game implements Serializable{
    
    private String main;
    private Player player;
    private World world;
    
    private Item[] items;
    private Actor[][] actors;
    private Hero hero;
  
    

    public Game() {
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
    
    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    
    public Actor[][] getActors() {
        return actors;
    }

    public void setActors(Actor[][] actors) {
        this.actors = actors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.main);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.main, other.main)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "main=" + main + '}';
    }
    
    
   
}
