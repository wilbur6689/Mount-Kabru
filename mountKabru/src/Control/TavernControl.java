package Control;



/**
 * Created by badgerwaves on 2/10/16.
 */
public class TavernControl {

  

public static String ownerResponse(int levelOfHero) {
    
    int respType = 0;
    int index;
    String[] ownerSaying = {"One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten", 
            "Eleven, Twelve, Thirteen, Fourteen, Fifteen, Sixteen, Seventeen, Eighteen, Nineteen, Twenty"}; 
     
    
     
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
    System.out.println(ownerResponse);
 
    return ownerResponse;
    
    


}


}
