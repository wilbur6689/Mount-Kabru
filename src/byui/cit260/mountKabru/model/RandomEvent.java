/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author wibur
 */
public class RandomEvent implements Serializable{
    
    //class instance variables
    private String monsterEvent;
    private String weirdEvent;
    private int goldEvent;
    
    
    private Actor actor;
    private Location location;

    public RandomEvent() {
    }

   
    
    

    
    
    
 

    @Override
    public String toString() {
        return "RandomEvent{" + "monsterEvent=" + monsterEvent + ", weirdEvent=" + weirdEvent + ", goldEvent=" + goldEvent + ", barKeeperEvent=" + barKeeperEvent + ", bossEvent=" + bossEvent + '}';
    }

    

    
    
    }
