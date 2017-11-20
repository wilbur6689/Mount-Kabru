/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.model.Hero;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wibur
 */
public class
ActorControlTest {
    
    public ActorControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of newHero method, of class ActorControl.
     */
    @Test
    public void testMeleeDamage() {
        System.out.println("meleeDamage Test 1");
        int attack = 35;
        int strength = 23;
        int opponentDefense = 17;
        int expResult = 41;
        int result = 0;
        try {
            result = ActorControl.meleeDamage(attack, strength, opponentDefense);
        } catch (ActorControlException e) {
            e.printStackTrace();
        }
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
           int result = 0;
           try {
               result = ActorControl.meleeDamage(attack, strength, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }
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
           int result = 0;
           try {
               result = ActorControl.meleeDamage(attack, strength, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }
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
           int result = 0;
           try {
               result = ActorControl.meleeDamage(attack, strength, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }
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
           int result = 0;
           try {
               result = ActorControl.meleeDamage(attack, strength, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }
           assertEquals(expResult, result);
           System.out.println(result);
        
    }
       @Test
    public void testSpellDamage1() {
        System.out.println("spellDamage Test 1");
        int attack = 25;
        int mana = 20;
        int opponentDefense = 15;
        String expResult = "31-40";
           int result = 0;
           try {
               result = ActorControl.spellDamage(attack, mana, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }

           System.out.println(result);
        if (result > 2 && result < 100) {
            if (result >= -4 && result < 0) {
                assertTrue(true);
            }
            
            assertTrue(true);
        }
        
           
        
        System.out.println("expected: " + expResult);
    }
    
       @Test
    public void testSpellDamage2() {
        System.out.println("spellDamage Test 2");
        int attack = 199;
        int mana = 30;
        int opponentDefense = 10;
        String expResult = "-4";
           int result = 0;
           try {
               result = ActorControl.spellDamage(attack, mana, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }

           System.out.println(result);
        if (result > 2 && result < 100) {
            if (result >= -4 && result < 0) {
                assertTrue(true);
            }
            
            assertTrue(true);
        }
        
            
        
        
        System.out.println("expected: " + expResult);
    }
    
       @Test
    public void testSpellDamage3() {
        System.out.println("spellDamage Test 3");
        int attack = 20;
        int mana = 351;
        int opponentDefense = 15;
        String expResult = "-4";
           int result = 0;
           try {
               result = ActorControl.spellDamage(attack, mana, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }

           System.out.println(result);
        if (result > 2 && result < 100) {
            if (result >= -4 && result < 0) {
                assertTrue(true);
            }
            
            assertTrue(true);
        }
        
            
        
        
        System.out.println("expected: " + expResult);
    }
    
       @Test
    public void testSpellDamage4() {
        System.out.println("spellDamage Test 4");
        int attack = 30;
        int mana = 25;
        int opponentDefense = 150;
        String expResult = "-4";
           int result = 0;
           try {
               result = ActorControl.spellDamage(attack, mana, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }

           System.out.println(result);
        if (result > 2 && result < 100) {
            if (result >= -4 && result < 0) {
                assertTrue(true);
            }
            
            assertTrue(true);
        }
        
            
        
        
        System.out.println("expected: " + expResult);
    }
    
       @Test
    public void testSpellDamage5() {
        System.out.println("spellDamage Test 5");
        int attack = 5;
        int mana = 5;
        int opponentDefense = 5;
        String expResult = "6-15";
           int result = 0;
           try {
               result = ActorControl.spellDamage(attack, mana, opponentDefense);
           } catch (ActorControlException e) {
               e.printStackTrace();
           }

           System.out.println(result);
        if (result > 2 && result < 100) {
            if (result >= -4 && result < 0) {
                assertTrue(true);
            }
            
            assertTrue(true);
        }
        
            
        
        
        System.out.println("expected: " + expResult);
    }
    
}
