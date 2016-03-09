package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 * Created by Badgero1234 on 1/28/16.
 */
public enum Item implements Serializable{

    stick("A scary looking Stick"),
    kukri("This is a short stubby looking sword, to be used for removeing your head"),
    battleAxe("This thing is sharp enough to kill you just looking at it"),
    scythe("I dont think this was used to harvest grain... just sayin"),
    leatherArmor("light weight, sturdy, and smells good, what more could you want?"),
    scaleMail("A little more protection for not a bad price"),
    carbonFiber("strong and light weight, also makes you look like batman"),
    dragonBoneArmor("By far the best armor on the market, just dont let smog see you wearing it"),
    healthPotion10("Heals you for 10 hitpoints"),
    healthPotion20("Heals you for 20 hitpoints"),
    healthPotion30("Heals you for 30 hitpoints"),
    healthPotion40("Heals you for 40 hitpoints"),
    manaPotion10("Restores 10 Mana Points"),
    manaPotion20("Restores 20 Mana Points"),
    manaPotion30("Restores 30 Mana Points"),
    manaPotion40("Restores 40 Mana Points");
    
    private final String description;
    private final int attackValue;
    private final int defenceValue;
    private final int costValue;
    private final int sellValue;
    private final int manaValue;
    private final int healthValue;




    Item(String description) {
        this.description = description;
        attackValue = 1;
        defenceValue = 1;
        costValue = 10;
        sellValue = 5;
        manaValue = 1;
        healthValue = 1;
    }


    public int getAttackValue() {
        return attackValue;
    }

   

    public int getDefenceValue() {
        return defenceValue;
    }


    public int getCostValue() {
        return costValue;
    }


    public int getSellValue() {
        return sellValue;
    }



    public int getManaValue() {
        return manaValue;
    }



    public int getHealthValue() {
        return healthValue;
    }





 

    @Override
    public String toString() {
        return "Item{" +
                ", attackValue=" + attackValue +
                ", defenceValue=" + defenceValue +
                ", costValue=" + costValue +
                ", sellValue=" + sellValue +
                ", manaValue=" + manaValue +
                ", healthValue=" + healthValue +
                '}';
    }
}
