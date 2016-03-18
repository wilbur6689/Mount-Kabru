/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.Hero;
import byui.cit260.mountKabru.model.Player;
import byui.cit260.mountKabru.model.World;
import java.util.Arrays;
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
        }else if (answer1.equals("W")) {
            mana += 10;
        }else {
            return null;
        }
        
        //Caclulate Answer2
        
        if (answer2.equals("M")) {
            strength += 10;
        }else if (answer2.equals("W")) {
            mana += 10;
        }else {
           return null;
        }

        //Caclulate Answer3
        
        if (answer3.equals("M")) {
            strength += 10;
        }else if (answer3.equals("W")) {
            mana += 10;
        }else {
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
        }else if (mana == 30) {
            hero.setHeroClassType("Wizard");
        }else {
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
        

        World world = WorldControl.createWorld();
        game.setWorld(world);
       
    }

    public static Actor[] createActors() {
        
        //Create the list of Actors
        
        Actor[] actors = new Actor[13];
        /* Actor
        private String names;
        private int hitPoints;
        private int defence;
        private int attack;
        private int chanceToHit;
        private int gold;
        */
        //plains MOnsters
        Actor gnome = new Actor("gnome", 8,4,3,2,7);
        actors[0] = gnome;
        Actor banshee = new Actor("banshee", 12,5,5,2,12 );
        actors[1] = banshee;
        Actor evilRabbits = new Actor("evilRabbits", 15,3,16,4,30);
        actors[2] = evilRabbits;
        //Jungle Monsters
        Actor frogs = new Actor("frogs", 20,5,15,3,45);
        actors[3] = frogs;
        Actor manticore = new Actor("manticore", 25,7,17,3,100);
        actors[4] = manticore;
        Actor gators = new Actor("gators", 30,8,18,3,37);
        actors[5] = gators;
        //DarkForest Monsters
        Actor werewolves = new Actor("werewolves", 35,15,45,4,125);
        actors[6] = werewolves;
        Actor dryad = new Actor("dryad", 40,25,55,5,250);
        actors[7] = dryad;
        Actor theUndead = new Actor("theUndead", 50,34,67,7,650);
        actors[8] = theUndead;
        //HighMountain
        Actor dragon = new Actor("dragon", 60,45,55,34,250);
        actors[9] = dragon;
        Actor hydra = new Actor("hydra", 70,67,100,34,9000);
        actors[10] = hydra;
        Actor giant = new Actor("giant", 150,75,46,34,40000);
        actors[11] = giant;
        Actor master = new Actor("master", 1,1,1,0,9999999);
        actors[12] = master;

        
        
        return actors;
        
    }

    public static int avgMonsterHP(Actor[] actors) {
        
        //needs to find the average of the player hitpoints.
       

        if (actors == null){
            return -1;
        }
        
        int averageHP = 0;
        int totalHP = 0;

        for (Actor actor : actors) {
            int hitPoints = actor.getHitPoints();
            if (hitPoints < 1 || hitPoints > 150) {
                return -2;
            }
            
            totalHP += hitPoints; 
        }
        
        averageHP = totalHP / actors.length;
        
        return averageHP;
    }
    
    public static String listOMonsters(Actor[] actors) {
        
    
                
    }


    
    
    
    
    
    
}
