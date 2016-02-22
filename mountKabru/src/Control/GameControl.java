/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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
    
}
