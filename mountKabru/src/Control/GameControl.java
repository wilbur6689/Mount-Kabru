/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Actor;
import model.Hero;
import model.Player;
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
    
    public static Hero createHero(String name, int attack) {
        
        
        if (name == null) {
            return null;
        }
        
        Hero hero = new Hero();
        hero.setName(name);
       
        
        MountKabru.setHero(hero); //save the hero
        
        
        return hero;
    }

    public static void createNewGame(Actor actor) {
        System.out.println("\n*** createNewGame function Called   ****");
    }
    
    
    
}
