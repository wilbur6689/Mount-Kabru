/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wibur
 */
public class TavernControlTest {
    
    public TavernControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ownerResponse method, of class TavernControl.
     */
    @Test
    public void testOwnerResponse() {
        System.out.println("ownerResponse");
        int levelOfHero = 4;
        String expResult = "";
        String result = null;
        try {
            result = TavernControl.ownerResponse(levelOfHero);
        } catch (Exception e) {
            e.printStackTrace();
        }

        boolean found = false;
        String[] testSaying = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
        
        
        for (int  i=0; i < testSaying.length; i++) {
            if (result.equals(testSaying[i])) {
                found = true;
                break;
            }
            
        }
        System.out.println(result);
        if (found) {
            assertTrue(found);
        }
        
        else {
            fail ("you have failed");
        }
        
    }
    
}
