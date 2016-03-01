package control;

import model.Hero;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class ActorControl {

        public Hero newHero(String heroName) {
            
            Hero hero = new Hero(heroName, "Warrior", 1, 100, 5, 5);
            
            
            return hero;
        }
    
	public static int  meleeDamage(int attack, int strength, int opponentDefense){



		if (attack <5 ||  attack > 100) {
			if (attack > 100){
				return -4;
			}
			return -1;
		}
  
		if (strength <2 || strength >100) {
			if (strength > 100){
				return -4;
			}
			return -2;

		}

		if (opponentDefense <5 || opponentDefense>100) {
			if (opponentDefense > 100){
				return -4;
			}
			return -3;
		}


		int meleeDamage =  attack + strength - opponentDefense;
			System.out.println(meleeDamage);
                        
		return  meleeDamage;

	}
        
        public static int  spellDamage(int attack, int mana, int opponentDefense){



		if (attack <5 ||  attack > 100) {
			if (attack > 100){
				return -4;
			}
			return -1;
		}

		if (mana <2 || mana >100) {
			if (mana > 100){
				return -4;
			}
			return -2;

		}

		if (opponentDefense <5 || opponentDefense>100) {
			if (opponentDefense > 100){
				return -4;
			}
			return -3;
		}


		int manaDamage = (attack + mana - opponentDefense) + (int) (Math.random() * 10);
			
                        
		return  manaDamage;

	}
}
