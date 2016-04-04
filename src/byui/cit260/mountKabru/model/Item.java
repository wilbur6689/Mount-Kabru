package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 * Created by Badgero1234 on 1/28/16.
 */
public enum Item implements Serializable{

    
    bareHands("Bare Hands", "Easy, Cheap, and always avaliable", 8,0,0,0,0,0),
    stick("Stick", "A scary looking Stick",20,0,300,200,0,0),
    club("Club", "Heavier then a stick, hurts more too",30,0,600,500,0,0),
    dagger("Dagger","pointy and light for quick stabbing",40,0,1000,700,0,0),
    mace("Mace", "large bulky head makes peoples head hurt more",50,0,1500,1000,0,0),
    shortSword("Short Sword", "better then the dagger",60,0,2000,1300,0,0),
    kukri("Kukri", "This is a short stubby looking sword, to be used for removing your head",70,0,2500,1800,0,0),
    rapier("Rapier", "Swift, quick attack", 80,0,3000,2300,0,0),
    axe("Axe","Sharpened for cutting wood, and other stuff",90,0,3500,2800,0,0),
    longSword("Long Sword", "you can tell people it came from a Knight",100,0,4000,3000,0,0),
    claymore("Claymore","large and in Charge", 110,0,5000,3800,0,0),
    battleAxe("Battle Axe","This thing is sharp enough to kill you just looking at it", 120,0,6000,4500,0,0),
    scythe("Scythe","I dont think this was used to harvest grain... just saying",130,0,7000,5200,0,0),
    warHammer("War Hammer", "Swing it and stuff dies", 150,0,8000,6000,0,0),
    
    clothes("clothes","Plain, simple, and comfortable clothes", 0,5,0,0,0,0),
    thickGarment("Thick Garment","Thick and stuffy but better then clothes", 0,10,300,200,0,0),
    leatherArmor("leatherArmor","light weight, sturdy, and smells good, what more could you want?",0,20,600,500,0,0),
    studdedLeatherArmor("Studded Leather Armor","now your leather has pointy sharp things", 0,30,1000,700,0,0),
    chainMail("Chain Mail","start working of that fat kid, this is a little heavy", 0,40,1500,1000,0,0),
    breastPlate("clothes","Strong and comfortable protection from the front", 0,50,2000,1300,0,0),
    cuirasses("clothes","Strong and comfortable protection from the front", 0,60,2500,1800,0,0),
    scaleMail("scaleMail","A little more protection for not a bad price",0,70,3000,2300,0,0),
    steelHalfPlate("Steel Half Plate","Strong Steel, makes for great armor", 0,80,3500,2800,0,0),
    steelFullPlate("Steel Full Plate","Strong Steel, makes for great armor", 0,90,4000,3000,0,0),
    carbonFiber("carbonFiber","strong and light weight, also makes you look like batman",0,100,5000,3800,0,0),
    diamondHalfPlate("Diamond Half Plate","Diamonds are a adventures best friend", 0,110,6000,4500,0,0),
    diamondFullPlate("Diamond Full Plate","Diamonds are a adventures best friend", 0,120,7000,5200,0,0),
    dragonBoneArmor("Dragon Bone Armor","By far the best armor on the market, just dont let smog see you wearing it",0,130,8000,6000,0,0),
    
    
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
    private final int defenseValue;
    private final int costValue;
    private final int sellValue;
    private final int spellAttackValue;
    private final int healthValue;
    
    private Game game;

    private Item(String name, String description, int attackValue, int defenceValue, int costValue, int sellValue, int manaValue, int healthValue) {
        this.name = name;
        this.description = description;
        this.attackValue = attackValue;
        this.defenseValue = defenceValue;
        this.costValue = costValue;
        this.sellValue = sellValue;
        this.spellAttackValue = manaValue;
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

   

    public int getDefenseValue() {
        return defenseValue;
    }


    public int getCostValue() {
        return costValue;
    }


    public int getSellValue() {
        return sellValue;
    }



    public int getSpellAttackValue() {
        return spellAttackValue;
    }



    public int getHealthValue() {
        return healthValue;
    }





 
    @Override
    public String toString() {
        return "Item{" 
                + "description=" + description 
                + ", attackValue=" + attackValue 
                + ", defenceValue=" + defenseValue 
                + ", costValue=" + costValue 
                + ", sellValue=" + sellValue 
                + ", manaValue=" + spellAttackValue 
                + ", healthValue=" + healthValue 
                + ", game=" + game 
                + '}';
    }
    
}
