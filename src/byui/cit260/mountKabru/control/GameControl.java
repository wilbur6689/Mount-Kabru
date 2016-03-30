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
import mountkabru.MountKabru;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Integer.parseInt;
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

        
        
        
        Hero hero = new Hero();
        
        hero.setHeroName(name);
        hero.setLevelOfHero(1);
        hero.setXpToNextLevel(30);
        hero.setExperience(1);
        hero.setStrength(strength);
        hero.setMana(mana);
        hero.setMaxHitPoints(20);
        hero.setCurrentHitPoints(10);
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

    public static void saveGame(Game game, String fileName) throws GameControlException {

        String filePath = "saveGames\\" + fileName; 
            try(FileOutputStream fops = new FileOutputStream(filePath)){
                ObjectOutputStream output = new ObjectOutputStream(fops);

                output.writeObject(game); //write game to object File
            }

            catch(Exception e){
                throw new GameControlException(e.getMessage());
            }
        }


    public static void loadGame(String fileName) throws GameControlException {
         
        String filePath = "saveGames\\" + fileName;
        Game game = null;
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);

           game = (Game) input.readObject(); //read the game object from file
        }

        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }

        MountKabru.setCurrentGame(game);
    }





    public static void raiseTheLevel(){

        //get the class of the hero
        String heroClass = MountKabru.getCurrentGame().getHero().getHeroClassType();
        
        if (heroClass.equals("Warrior")) {
            
            //do stuff for warrior
            //get before stats (with getters) that you want to change(health, str,level)
            int beforeHealth = MountKabru.getCurrentGame().getHero().getMaxHitPoints();
            int beforeStrength = MountKabru.getCurrentGame().getHero().getStrength();
            int beforeLvlUp = MountKabru.getCurrentGame().getHero().getLevelOfHero();



            //add stuff and set them to new variables

            int afterHealth = beforeHealth + 50;
            int afterStrength = beforeStrength + 2;
            int afterLvlUp = beforeLvlUp + 1;
            //set the new variables to the hero stats with a "setter"

            MountKabru.getCurrentGame().getHero().setMaxHitPoints(afterHealth);
            MountKabru.getCurrentGame().getHero().setStrength(afterStrength);
            MountKabru.getCurrentGame().getHero().setLevelOfHero(afterLvlUp);
        }
        
        else if (heroClass.equals("Wizard")) {
            //do stuff for Wizard
            //get before stats (with getters) that you want to change(health, Mana,level)

            int beforeHealth = MountKabru.getCurrentGame().getHero().getMaxHitPoints();
            int beforeMana = MountKabru.getCurrentGame().getHero().getMana();
            int beforeLvlUp = MountKabru.getCurrentGame().getHero().getLevelOfHero();
            
            //add stuff and set them to new variables
            int afterHealth = beforeHealth + 50;
            int afterMana = beforeMana + 2;
            int afterLvlUp = beforeLvlUp + 1;

            //set the new variables to the hero stats with a "setter"

            MountKabru.getCurrentGame().getHero().setMaxHitPoints(afterHealth);
            MountKabru.getCurrentGame().getHero().setMana(afterMana);
            MountKabru.getCurrentGame().getHero().setLevelOfHero(afterLvlUp);
        }
        
        else {
            //do stuff for the Paladin
             //get before stats (with getters) that you want to change(health, Mana, and str,level)
             
            int beforeHealth = MountKabru.getCurrentGame().getHero().getMaxHitPoints();
            int beforeStrength = MountKabru.getCurrentGame().getHero().getStrength();
            int beforeMana = MountKabru.getCurrentGame().getHero().getMana();
            int beforeLvlUp = MountKabru.getCurrentGame().getHero().getLevelOfHero();
            //add stuff and set them to new variables
            
            int afterHealth = beforeHealth +50;
            int afterStrength = beforeStrength + 1;
            int afterMana = beforeMana +1;
            int afterLvlUp = beforeLvlUp +1;
            
            
            //set the new variables to the hero stats with a "setter"
            MountKabru.getCurrentGame().getHero().setMaxHitPoints(afterHealth);
            MountKabru.getCurrentGame().getHero().setStrength(afterStrength);
            MountKabru.getCurrentGame().getHero().setLevelOfHero(afterLvlUp);
            MountKabru.getCurrentGame().getHero().setMana(afterMana);
        }
        
        
        
        
        
        
        
        







    }



    }


    


