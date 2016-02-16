package Control;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class ActorControl {

	public static int  meleeDamage(int attack, int strength, int opponentDefense){



		if (attack <5 ||  attack>100) {
			return -1;
		}

		if (strength <2 || strength >100) {
			return -2;
		}

		if (opponentDefense <5 || strength>100) {
			return -3;
		}

		if (opponentDefense > 100) {
			return -4;
		}
                
                if (attack > 100){
                    return -4;
                }
                
                if (strength >100){
                    return - 4;
                }

		int meleeDamage =  attack + strength - opponentDefense;
			System.out.println(meleeDamage);
                        
		return  meleeDamage;

	}
}
