/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wibur
 */
public class TavernControlTest {
    
    public TavernControlTest() {
    }

    /**
     * Test of ownerResponse method, of class TavernControl.
     */
    @Test
    public void testOwnerResponse() {
        System.out.println("ownerResponse");
        int levelOfHero = 4;
        String expResult = "";
        String result = TavernControl.ownerResponse(levelOfHero);
       
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
