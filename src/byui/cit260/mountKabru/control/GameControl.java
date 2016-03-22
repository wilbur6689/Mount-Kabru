/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import static byui.cit260.mountKabru.control.InventoryControl.createInventory;
import byui.cit260.mountKabru.exceptions.GameControlException;
import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.Hero;
import byui.cit260.mountKabru.model.Inventory;
import byui.cit260.mountKabru.model.Player;
import byui.cit260.mountKabru.model.World;
import mountkabru.MountKabru;

import java.util.Arrays;


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
    
    public static Hero createHero(String name, String answer1, String answer2, String answer3) throws GameControlException {
        
         if (name == null){
            throw new GameControlException("The name variable was null.");
        }
         
         if (answer1 == null){
            throw new GameControlException("The first Answer was null.");
        }
         if (answer2 == null){
            throw new GameControlException("The second Answer was null.");
        }
         if (answer3 == null){
            throw new GameControlException("The third Answer was null.");
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

        //(String heroName, String heroClassType, 
        //int levelOfHero, int experience, int mana, 
        //int strength, Player player, Inventory inventory, 
        //String name, int hitPoints, int defence, int attack, 
        //int chanceToHit, int gold) {
        
        
        Hero hero = new Hero();
        
        hero.setHeroName(name);
        hero.setLevelOfHero(1);
        hero.setExperience(1);
        hero.setStrength(strength);
        hero.setMana(mana);
        hero.setHitPoints(20);
        hero.setGold(10000);
        
        if (strength == 30) {
            hero.setHeroClassType("Warrior");
        }else if (mana == 30) {
            hero.setHeroClassType("Wizard");
        }else {
            hero.setHeroClassType("Paladin");
        }
        
        
        
        MountKabru.getCurrentGame().setHero(hero);
        
        Inventory inventory = createInventory();
        MountKabru.getCurrentGame().getHero().setInventory(inventory);
        
        return hero;
    }
    

    public static void createNewGame(Player player) throws GameControlException{
        
        if (player == null){
            throw new GameControlException("The player variable was null.");
        }
        
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
        Actor banshee = new Actor("Banshee", 12,5,5,2,12 );
        actors[1] = banshee;
        Actor evilRabbits = new Actor("EvilRabbits", 15,3,16,4,30);
        actors[2] = evilRabbits;
        //Jungle Monsters
        Actor frogs = new Actor("Frogs", 20,5,15,3,45);
        actors[3] = frogs;
        Actor manticore = new Actor("Manticore", 25,7,17,3,100);
        actors[4] = manticore;
        Actor gators = new Actor("Gators", 30,8,18,3,37);
        actors[5] = gators;
        //DarkForest Monsters
        Actor werewolves = new Actor("Werewolves", 35,15,45,4,125);
        actors[6] = werewolves;
        Actor dryad = new Actor("Dryad", 40,25,55,5,250);
        actors[7] = dryad;
        Actor theUndead = new Actor("TheUndead", 50,34,67,7,650);
        actors[8] = theUndead;
        //HighMountain
        Actor dragon = new Actor("Dragon", 60,45,55,34,250);
        actors[9] = dragon;
        Actor hydra = new Actor("Hydra", 70,67,100,34,9000);
        actors[10] = hydra;
        Actor giant = new Actor("Giant", 150,75,46,34,40000);
        actors[11] = giant;
        Actor master = new Actor("Master", 1,1,1,0,9999999);
        actors[12] = master;

        
        
        return actors;
        
    }

    public static int avgMonsterHP(Actor[] actors) throws GameControlException {
        
        //needs to find the average of the player hitpoints.
       

        if (actors == null){
            throw new GameControlException("The actors variable was null.");
        }
        
        int averageHP = 0;
        int totalHP = 0;

        for (Actor actor : actors) {
            int hitPoints = actor.getHitPoints();
            if (hitPoints < 1 || hitPoints > 150) {
                throw new GameControlException("The hitPoints was too large or too small of a number.");
            }
            
            totalHP += hitPoints; 
        }
        
        averageHP = totalHP / actors.length;
        
        return averageHP;
    }

    public static String listOMonsters(Actor[] actors) throws GameControlException {
        
        if (actors == null){
            throw new GameControlException("The actors variable was null.");
        }
        
        // Here I am creating a new array that I will sort the names into to arrange them.
        String[] newNames = new String[actors.length];

        //This for statement is here to count the names from the array above into a list
        for (int i = 0; i < newNames.length;i++) {

            //newNames is the name of the array, Here I am telling the array to find the index of the name using the ge
            //getName function. After it is called it puts the name into the empty location in the newNames array.
            newNames[i] = actors[i].getName();
        }


        String names = "\n";
        // Here I am sorting the array of newNames alphabetically
        Arrays.sort(newNames);

        // This is where I am assigning the names a variable of "name" from the newNames array data-types
        for (String name : newNames)
            names += name + "\n";
        
        //I return the new names in the sorted order.
        return names;

    }
    
   

}
