/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import model.User;

/**
 *
 * @author wibur
 */
public class GameControl {

    public static User createPlayer(String playersName) {
        System.out.println("\n *** createPlayer function is working ***");
        return new User();
    }
    
}
