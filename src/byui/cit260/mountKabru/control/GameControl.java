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
    
    public static Hero createHero(String name, int attack, int mana) {
        
        
        if (name == null) {
            return null;
        }
        
        Hero hero = new Hero();
        
        hero.setHeroName(name);
        hero.setLevelOfHero(1);
        hero.setExperience(1);
        hero.setAttack(attack);
        hero.setMana(mana);
        
        if (attack == 30) {
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
        
        Item[] inventoryList = GameControl.createInventoryList();
        game.setItem(inventoryList);
        
        World world = WorldControl.createWorld();
        game.setWorld(world);
        
        WorldControl.moveActorToStartingLocation(world);
    }

    private static Item[] createInventoryList() {
        
        Item[] inventory = new Item[4];
        
        Item weapon = new Item();
        weapon.
        
        
        
        return inventory;
    }
    
    
    
    
    
}
