package byui.cit260.mountKabru.control;



/**
 * Created by badgerwaves on 2/10/16.
 */
public class TavernControl {

  

public static String ownerResponse(int levelOfHero) {
    
    int respType = 0;
    int index;
    String[] ownerSaying = {
        "Look around town before going out to explore"
        , "Always remember to check how much health you have"
        , "Always remember to check your inventory"
        , "Dont forget to upgrade your Weapon if you have the gold for it"
        , "Dont forget to upgrade your Armor if you have the gold for it"
        , "You can only fight in the jungle if your are level 10 or higher"
        , "You can only fight in the Dark Forest if your are level 20 or higher"
        , "You can only fight in the High Mountains if your are level 30 or higher"
        , "You can sleep in the tavern to restore your health"
        , "You can save your game in the main menu"
        , "There are dishes in the bath! I hate you, go clean them, Pay your tab off!"
        , "If I see a fish and it is gasping for breath who am I? YOU!!!"
        , "I HATE YOUR FACE! "
        , "Hey you, help an old man out, go jump off a bridge you hippy"
        , "One fish, Two Fish, Red Fish, Blue Fish. I hate your fish!"
        , "I don't Like you!!"
        , "I love the smell of roses!"
        , "BLAHHHHHHHHH! Who you looking at!?"
        , "I am an old timer. But not as stupid as you!"
        , "CheeseCake is good do you want some? TOO BAD! You cannot have any! IT'S all mine! HAHAHAHAHAHHAHAHAHAHAHAHAH"}; 
     
    
     
    if (levelOfHero < 1) {
       return "-1";
    } 

    if (levelOfHero > 50) {
        return "-2";    
    }
    
    //Finds out if the response will be usefull
    if (levelOfHero > 0 && levelOfHero < 10) {
        respType = 0;
    }
    
    //finds out if the response will be foolish
    else if (levelOfHero > 10 && levelOfHero < 50) {
        respType = 10;
    }
    
    
    index = (int) (Math.random() * 10 + respType);
    
    String ownerResponse = ownerSaying[index];
 
    return ownerResponse;
    
    


}


}
