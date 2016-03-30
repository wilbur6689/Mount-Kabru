package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 * Created by Badgero1234 on 1/28/16.
 */
public enum Item implements Serializable{

    
    bareHands("Bare Hands", "Easy, Cheap, and always avaliable", 5,0,0,0,0,0),
    stick("Stick", "A scary looking Stick",10,0,300,200,0,0),
    kukri("Kukri", "This is a short stubby looking sword, to be used for removing your head",40,0,1000,800,0,0),
    battleAxe("battleAxe","This thing is sharp enough to kill you just looking at it", 80,0,3000,2500,0,0),
    scythe("scythe","I dont think this was used to harvest grain... just saying",120,0,7000,5500,0,0),
    clothes("clothes","Plain, simple, and comfortable clothes", 0,5,0,0,0,0),
    leatherArmor("leatherArmor","light weight, sturdy, and smells good, what more could you want?",0,10,300,200,0,0),
    scaleMail("scaleMail","A little more protection for not a bad price",0,40,1000,800,0,0),
    carbonFiber("carbonFiber","strong and light weight, also makes you look like batman",0,80,3000,2500,0,0),
    dragonBoneArmor("dragonBoneArmor","By far the best armor on the market, just dont let smog see you wearing it",0,120,7000,5500,0,0),
    manaPotion10("manaPotion10","Restores 10 Mana Points",0,0,60,0,10,0),
    manaPotion20("manaPotion20","Restores 20 Mana Points",0,0,110,0,20,0),
    manaPotion30("manaPotion30","Restores 40 Mana Points",0,0,200,0,30,0),
    manaPotion40("manaPotion40","Restores 80 Mana Points",0,0,380,0,40,0),
    healthPotion10("healthPotion10","Heals you for 10 hitpoints",0,0,60,0,0,10),
    healthPotion20("healthPotion20","Heals you for 20 hitpoints",0,0,110,0,0,20),
    healthPotion30("healthPotion30","Heals you for 40 hitpoints",0,0,200,0,0,30),
    healthPotion40("healthPotion40","Heals you for 80 hitpoints",0,0,380,0,0,40),
    lameMagic("Lame Magic", "You dream of being able to cast a spell", 0,0,0,0,5,0),
    roaringWinds("Roaring Winds","releases winds of fury", 0,0,200,100,10,10),
    summonDemons("Summon Demons","you summoned the dead and now rule all, hah jk ", 0,0,1000,500,40,20),
    roaringWaters("Roaring Waters","releases waters of fury", 0,0,3000,1500,80,30),
    hellFire("Hell Fire","Ignites everything and kills it", 0,0,7000,3500,120,40);

    private final String name;
    private final String description;
    private final int attackValue;
    private final int defenceValue;
    private final int costValue;
    private final int sellValue;
    private final int manaValue;
    private final int healthValue;
    
    private Game game;

    private Item(String name, String description, int attackValue, int defenceValue, int costValue, int sellValue, int manaValue, int healthValue) {
        this.name = name;
        this.description = description;
        this.attackValue = attackValue;
        this.defenceValue = defenceValue;
        this.costValue = costValue;
        this.sellValue = sellValue;
        this.manaValue = manaValue;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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
        return "Item{" 
                + "description=" + description 
                + ", attackValue=" + attackValue 
                + ", defenceValue=" + defenceValue 
                + ", costValue=" + costValue 
                + ", sellValue=" + sellValue 
                + ", manaValue=" + manaValue 
                + ", healthValue=" + healthValue 
                + ", game=" + game 
                + '}';
    }
    
}
