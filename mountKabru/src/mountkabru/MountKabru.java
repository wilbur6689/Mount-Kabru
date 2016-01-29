/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import model.*;

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
            barbus.setHeroClassType("Nurse Maid");
            barbus.setLevelOfHero(89);
            barbus.setExperience(325802);
            barbus.setStrength(67);
            barbus.setMana(5);

            System.out.println(barbus.toString());
        
        Game newGame = new Game();
            newGame.setMain("game23");

            System.out.println(newGame.toString());
        
        World newWorld = new World();
            newWorld.setRowCount('b');
            newWorld.setColumnCount(2);

            System.out.println(newWorld.toString());
        
        Location currentLocation = new Location();
            currentLocation.setRow('A');
            currentLocation.setColumn(4);
            currentLocation.setAreaExplored("A1, A2, A3");

            System.out.println(currentLocation.toString());

        Inventory item = new Inventory();
            item.setWeaponSlot("bertha");
            item.setArmorSlot("Breast Plate");
            item.setHealthPotionSlot(3);
            item.setManaPotionSlot(2);
            
            System.out.println(item.toString());
            
        Item sword = new Item();
            sword.setName("Long Sword");
            sword.setAttackValue(15);
            sword.setCostValue(1500);
            sword.setSellValue(750);
            sword.setDefenceValue(0);
            sword.setHealthValue(0);
            sword.setManaValue(0);
            
            System.out.println(sword.toString());
            
        User user101 = new User();
            user101.setName("Chris Harper");
            
            System.out.println(user101.toString());

            
            
        
            
            
            
        
        
        
        
        


        
        
        //create new object for each class
        //set values for each attribute
        //call toStrings() function and print out contents of new object
        
    }    
}
