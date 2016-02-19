/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import model.User;
import mountkabru.MountKabru;

/**
 *
 * @author wibur
 */
public class GameControl {

    public static User createUser(String name) {
        
        
        if (name == null) {
            return null;
        }
        
        User user = new User();
        user.setName(name);
        
        MountKabru.setUser(user); //save the player
        
        
        return user;
    }
    
}
