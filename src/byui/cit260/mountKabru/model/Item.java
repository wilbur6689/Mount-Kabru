package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 * Created by Badgero1234 on 1/28/16.
 */
public enum Item implements Serializable{

    stick("A scary looking Stick",10,0,300,200,0,0),
    kukri("This is a short stubby looking sword, to be used for removeing your head",20,0,1000,800,0,0),
    battleAxe("This thing is sharp enough to kill you just looking at it", 30,0,3000,2500,0,0),
    scythe("I dont think this was used to harvest grain... just sayin",40,0,7000,5500,0,0),
    leatherArmor("light weight, sturdy, and smells good, what more could you want?",0,10,300,200,0,0),
    scaleMail("A little more protection for not a bad price",0,20,1000,800,0,0),
    carbonFiber("strong and light weight, also makes you look like batman",0,30,3000,2500,0,0),
    dragonBoneArmor("By far the best armor on the market, just dont let smog see you wearing it",0,40,7000,5500,0,0),
    manaPotion10("Restores 10 Mana Points",0,0,60,0,10,0),
    manaPotion20("Restores 20 Mana Points",0,0,110,0,20,0),
    manaPotion30("Restores 40 Mana Points",0,0,200,0,30,0),
    manaPotion40("Restores 80 Mana Points",0,0,380,0,40,0),
    healthPotion10("Heals you for 10 hitpoints",0,0,60,0,0,10),
    healthPotion20("Heals you for 20 hitpoints",0,0,110,0,0,20),
    healthPotion30("Heals you for 40 hitpoints",0,0,200,0,0,30),
    healthPotion40("Heals you for 80 hitpoints",0,0,380,0,0,40);
    
    
    private final String description;
    private final int attackValue;
    private final int defenceValue;
    private final int costValue;
    private final int sellValue;
    private final int manaValue;
    private final int healthValue;
    
    private Game game;

    private Item(String description, int attackValue, int defenceValue, int costValue, int sellValue, int manaValue, int healthValue) {
        this.description = description;
        this.attackValue = attackValue;
        this.defenceValue = defenceValue;
        this.costValue = costValue;
        this.sellValue = sellValue;
        this.manaValue = manaValue;
        this.healthValue = healthValue;
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
