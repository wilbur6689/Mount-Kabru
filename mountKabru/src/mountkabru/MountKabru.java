/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import model.Actor;
import model.Hero;
import model.RandomEvent;

/**
 *
 * @author wibur
 */
public class MountKabru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Actor dummy = new Actor();
        dummy.setName("fred");
        dummy.setHitPoints(50);
        dummy.setAttack(15);
        dummy.setDefence(20);
        
        System.out.println(dummy.toString());
        
        RandomEvent plains = new RandomEvent();
        plains.setMonsterEvent("breadMan");
        plains.setWeirdEvent("mermaids");
        plains.setGoldEvent(500);
        plains.setBarKeeperEvent("welcome to Kabru");
        plains.setBossEvent("plains Boss");
        
        System.out.println (plains.toString());
        
        Hero barbus = new Hero();
        barbus.set
        
        //create new object for eahc class
        //set values for each attribute
        //call toStrings() function and print out contents of new object
        
    }    
}
