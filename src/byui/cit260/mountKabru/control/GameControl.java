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
import byui.cit260.mountKabru.view.ErrorView;
import static java.lang.Integer.parseInt;
import mountkabru.MountKabru;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;


/**
 *
 * @author wibur
 */
public class GameControl {

    public static Player createPlayer(String name) throws GameControlException {
        
        
        if (name == null) {
            throw new GameControlException("The name variable was null.");
        }
        
        Player player = new Player();
        player.setName(name);
        MountKabru.setPlayer(player); //save the player  
        return player;
    }
    
    public static Hero createHero(String name, String answer1, String answer2, String answer3, String startingGold) throws GameControlException {
        
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
         
         
        int startGold = 0; 
        int strength = 0;
        int mana = 0;
        
        
        try {
        startGold = parseInt(startingGold);
        } catch(NumberFormatException nf) {
            ErrorView.display("GameControl", "Error is in startingGold. You must enter a value number");
        }
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
        hero.setGold(startGold);
        
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
        Actor[][] actors = ActorControl.createActors();
        game.setActors(actors);
        

        World world = WorldControl.createWorld();
        game.setWorld(world);
        
         
       
    }

    public static void saveGame(Game game, String filePath)

        throws GameControlException {

            try(FileOutputStream fops = new FileOutputStream(filePath)){
                ObjectOutputStream output = new ObjectOutputStream(fops);

                output.writeObject(game); //write game to object File
            }

            catch(Exception e){
                throw new GameControlException(e.getMessage());
            }
        }


    public static void getSavedGame(String filePath)
        throws GameControlException {
         Game game = null;
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);

           game = (Game) input.readObject();
        }

        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }

        MountKabru.setCurrentGame(game);
    }

    }


    


