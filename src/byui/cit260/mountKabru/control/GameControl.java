/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.Hero;
import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Item;
import byui.cit260.mountKabru.model.Player;
import byui.cit260.mountKabru.model.World;
import mountkabru.MountKabru;

/**
 *
 * @author wibur
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
       
        
        MountKabru.setPlayer(player); //save the player
        
        
        return player;
    }
    
    public static Hero createHero(String name, String answer1, String answer2, String answer3) {
        
         if (name == null) {
            return null;
        }
         
        int strength = 0;
        int mana = 0;
        
        //calculate Answer1
         
        if (answer1.equals("M")) {
            strength += 10;
        }
        else if (answer1.equals("W")) {
            mana += 10;
        }
        else {
            return null;
        }
        
        //Caclulate Answer2
        
        if (answer2.equals("M")) {
            strength += 10;
        }
        else if (answer2.equals("W")) {
            mana += 10;
        }
        else {
           return null;
        }

        //Caclulate Answer3
        
        if (answer3.equals("M")) {
            strength += 10;
        }
        else if (answer3.equals("W")) {
            mana += 10;
        }
        else {
           return null;
        }

        Hero hero = new Hero();
        
        hero.setHeroName(name);
        hero.setLevelOfHero(1);
        hero.setExperience(1);
        hero.setStrength(strength);
        hero.setMana(mana);
        
        if (strength == 30) {
            hero.setHeroClassType("Warrior");
        } 
        else if (mana == 30) {
            hero.setHeroClassType("Wizard");
        }
        else {
            hero.setHeroClassType("Paladin");
        }
        
        
     
        MountKabru.getCurrentGame().setHero(hero);
        
        return hero;
    }
    

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        MountKabru.setCurrentGame(game);
        
        game.setPlayer(player);
        
        //create a list of monsters
        Actor[] actors = GameControl.createActors();
        game.setActors(actors);
        
        //Create reandomEvents for the game
        
        World world = WorldControl.createWorld();
        game.setWorld(world);
        
        WorldControl.moveActorToStartingLocation(world);
    }

    private static Actor[] createActors() {
        
        //Create the list of Actors
        
        Actor[] actors = new Actor[13];
        
        Actor gnome = new Actor("Gnome", 8,4,3,2,7);
        actors[0] = gnome;
        
        
        
        return actors;
        
    }

    
    
    
    
    
    
}
