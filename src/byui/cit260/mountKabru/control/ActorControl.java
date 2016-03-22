package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.model.Hero;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class ActorControl {

    public Hero newHero(String heroName) {

        Hero hero = new Hero(heroName, "Warrior", 1, 100, 5, 5);

        return hero;
    }

    public static int meleeDamage(int attack, int strength, int opponentDefense) throws ActorControlException {

        if (attack < 5 || attack > 100) {
            if (attack > 100) {
                throw new ActorControlException("The attack was to large of a number.");
            }
            throw new ActorControlException("The attack was a negitive number.");
        }

        if (strength < 2 || strength > 100) {
            if (strength > 100) {
                throw new ActorControlException("The strength was to large of a number.");
            }
            throw new ActorControlException("The strength was a negitive number.");

        }

        if (opponentDefense < 5 || opponentDefense > 100) {
            if (opponentDefense > 100) {
                throw new ActorControlException("The opponentDefense was to large of a number.");
            }
            throw new ActorControlException("The opponentDefense was a negitive number.");
        }

        int meleeDamage = attack + strength - opponentDefense;
        System.out.println(meleeDamage);

        return meleeDamage;

    }

    public static int spellDamage(int attack, int mana, int opponentDefense) throws ActorControlException {

        if (attack < 5 || attack > 100) {
            if (attack > 100) {
                throw new ActorControlException("The attack was to large of a number.");
            }
            throw new ActorControlException("The attack was a negitive number.");
        }

        if (mana < 2 || mana > 100) {
            if (mana > 100) {
                throw new ActorControlException("The mana was to large of a number.");
            }
            throw new ActorControlException("The mana was a negitive number.");
        }

        if (opponentDefense < 5 || opponentDefense > 100) {
            if (opponentDefense > 100) {
                throw new ActorControlException("The opponentDefense was to large of a number.");
            }
            throw new ActorControlException("The opponentDefense was a negitive number.");
        }

        int manaDamage = (attack + mana - opponentDefense) + (int) (Math.random() * 10);

        return manaDamage;

    }
}
