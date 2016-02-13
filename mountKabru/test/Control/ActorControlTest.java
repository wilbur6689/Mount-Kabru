/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Badgero1234
 */
public class ActorControlTest {
    
    public ActorControlTest() {
    }

    /**
     * Test of meleeDamage method, of class ActorControl.
     */
    @Test
    public void testMeleeDamage() {
        System.out.println("meleeDamage Test 1");
        int attack = 35;
        int strength = 23;
        int opponentDefense = 17;
        int expResult = 41;
        int result = ActorControl.meleeDamage(attack, strength, opponentDefense);
        assertEquals(expResult, result);
        System.out.println(result);
    }
    
       @Test
    public void testMeleeDamage2() {
        System.out.println("meleeDamage Test 2");
        int attack = -14;
        int strength = 23;
        int opponentDefense = 90;
        int expResult = -1;
        int result = ActorControl.meleeDamage(attack, strength, opponentDefense);
        assertEquals(expResult, result);
           System.out.println(result);
    }
    
       @Test
    public void testMeleeDamage3() {
        System.out.println("meleeDamage Test 3");
        int attack = 55;
        int strength = -1;
        int opponentDefense = 34;
        int expResult = -2;
        int result = ActorControl.meleeDamage(attack, strength, opponentDefense);
        assertEquals(expResult, result);
           System.out.println(result);
    }
    
       @Test
    public void testMeleeDamage4() {
        System.out.println("meleeDamage Test 4");
        int attack = 20;
        int strength = 4;
        int opponentDefense = 1-5;
        int expResult = -3;
        int result = ActorControl.meleeDamage(attack, strength, opponentDefense);
        assertEquals(expResult, result);
           System.out.println(result);
    }
       @Test
    public void testMeleeDamage5() {
        System.out.println("meleeDamage Test 5");
        int attack = 345;
        int strength = 666;
        int opponentDefense = 233;
        int expResult = -4;
        int result = ActorControl.meleeDamage(attack, strength, opponentDefense);
        assertEquals(expResult, result);
           System.out.println(result);
        
    }
    
}
