package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Hero;
import java.util.Arrays;
import mountkabru.MountKabru;

/**
 * Created by badgerwaves on 2/10/16.
 */
public class ActorControl {

    public Hero newHero(String heroName) {

        Hero hero = new Hero(heroName, "Warrior", 1, 100, 5, 5);

        return hero;
    }

    public static Actor[][] createActors() {


//        private String name;
//    private int hitPoints;
//    private int defence;
//    private int attack;
//    private int spellAttack;
//    private int chanceToHit;
//    private int gold;


        //Create the list of Actors
        Actor[][] actors = new Actor[4][1];

        //plains Monsters
        Actor[] plainsActors = new Actor[4];
        Actor gnome = new Actor("Naughty Gnomes", 45, 8, 4, 0, 3, 2, 7);
        plainsActors[0] = gnome;
        Actor banshee = new Actor("Banshees", 50, 12, 5, 0, 5, 2, 12);
        plainsActors[1] = banshee;
        Actor evilRabbits = new Actor("EvilRabbits", 60, 15, 3, 0, 16, 4, 30);
        plainsActors[2] = evilRabbits;
        Actor wolves = new Actor("Wolves", 60, 9, 6, 0, 6, 6, 40);
        plainsActors[3] = wolves;
        actors[0] = plainsActors;

        //Jungle Monsters
        Actor[] jungleActors = new Actor[4];
        Actor frogs = new Actor("Frogs", 100, 20, 5, 0, 15, 3, 45);
        jungleActors[0] = frogs;
        Actor manticore = new Actor("Manticores", 150, 25, 7, 0, 17, 3, 100);
        jungleActors[1] = manticore;
        Actor gators = new Actor("Gators", 200, 30, 8, 0, 18, 3, 37);
        jungleActors[2] = gators;
        Actor largeSpider = new Actor("Large Spiders", 240, 24, 10, 0, 14, 6, 60);
        jungleActors[3] = largeSpider;
        actors[1] = jungleActors;

        //DarkForest Monsters
        Actor[] forestActors = new Actor[4];
        Actor werewolves = new Actor("Werewolves", 450, 35, 15, 0, 45, 4, 125);
        forestActors[0] = werewolves;
        Actor dryad = new Actor("Group Dryads", 500, 40, 25, 0, 55, 5, 250);
        forestActors[1] = dryad;
        Actor theUndead = new Actor("The Undead", 600, 50, 34, 0, 67, 7, 650);
        forestActors[2] = theUndead;
        Actor centaurs = new Actor("Centaurs", 550, 45, 28, 0, 48, 6, 450);
        forestActors[3] = centaurs;
        actors[2] = forestActors;

        //HighMountain
        Actor[] mountainActors = new Actor[4];
        Actor dragon = new Actor("a Dragon", 2500, 160, 145, 0, 55, 34, 2500);
        mountainActors[0] = dragon;
        Actor hydra = new Actor("a Hydra", 3500, 170, 167, 0, 100, 34, 9000);
        mountainActors[1] = hydra;
        Actor giant = new Actor("a Giant", 1500, 250, 185, 0, 46, 34, 1500);
        mountainActors[2] = giant;
        Actor master = new Actor("The Master", 1, 1, 1, 0, 1, 0, -20000);
        mountainActors[3] = master;
        actors[3] = mountainActors;

        return actors;

    }

    public static int avgMonsterHP() throws ActorControlException {

        //needs to find the average of the player hitpoints.
        Actor[][] actors1 = MountKabru.getCurrentGame().getActors();

        if (actors1 == null) {
            throw new ActorControlException("The actors variable was null.");
        }

        int averageHP = 0;
        int totalHP = 0;

        Actor[] plainsActors = actors1[ActorControl.ActorGroup.plainsActors.ordinal()];

        for (Actor actors : plainsActors) {
            int plainsHitPoints = actors.getMaxHitPoints();
            if (plainsHitPoints < 1 || plainsHitPoints > 150) {
                throw new ActorControlException("The hitPoints was too large or too small of a number.");
            }

            totalHP += plainsHitPoints;
        }

        Actor[] jungleActors = actors1[ActorControl.ActorGroup.plainsActors.ordinal()];

        for (Actor actors : jungleActors) {
            int jungleHitPoints = actors.getMaxHitPoints();
            if (jungleHitPoints < 1 || jungleHitPoints > 150) {
                throw new ActorControlException("The hitPoints was too large or too small of a number.");
            }

            totalHP += jungleHitPoints;
        }

        Actor[] forestActors = actors1[ActorControl.ActorGroup.plainsActors.ordinal()];

        for (Actor actors : forestActors) {
            int forestHitPoints = actors.getMaxHitPoints();
            if (forestHitPoints < 1 || forestHitPoints > 150) {
                throw new ActorControlException("The hitPoints was too large or too small of a number.");
            }

            totalHP += forestHitPoints;
        }

        Actor[] mountainActors = actors1[ActorControl.ActorGroup.plainsActors.ordinal()];

        for (Actor actors : mountainActors) {
            int mountainHitPoints = actors.getMaxHitPoints();
            if (mountainHitPoints < 1 || mountainHitPoints > 150) {
                throw new ActorControlException("The hitPoints was too large or too small of a number.");
            }

            totalHP += mountainHitPoints;
        }

        averageHP = totalHP / plainsActors.length;

        return averageHP;
    }

    public static String listOMonsters(Actor[][] actors) throws ActorControlException {

        if (actors == null) {
            throw new ActorControlException("The actors variable was null.");
        }

        // Here I am creating a new array that I will sort the names into to arrange them.
        Actor[] plainsActors = actors[ActorGroup.plainsActors.ordinal()];
        Actor[] jungleActors = actors[ActorGroup.jungleActors.ordinal()];
        Actor[] forestActors = actors[ActorGroup.forestActors.ordinal()];
        Actor[] mountainActors = actors[ActorGroup.mountainActors.ordinal()];

        String[] arrayOfNames = new String[16];
        int i = 0;
        for (Actor actorNames : plainsActors) {

            String singleActorName = actorNames.getName();

            arrayOfNames[i] = singleActorName;
            i++;
        }

        i = 4;
        for (Actor actorNames : jungleActors) {

            String singleActorName = actorNames.getName();

            arrayOfNames[i] = singleActorName;
            i++;
        }

        i = 8;
        for (Actor actorNames : forestActors) {

            String singleActorName = actorNames.getName();

            arrayOfNames[i] = singleActorName;
            i++;
        }

        i = 12;
        for (Actor actorNames : mountainActors) {

            String singleActorName = actorNames.getName();

            arrayOfNames[i] = singleActorName;
            i++;
        }

        String names = "\n";
        // Here I am sorting the array of newNames alphabetically
        Arrays.sort(arrayOfNames);

        // This is where I am assigning the names a variable of "name" from the newNames array data-types
        for (String name : arrayOfNames) {
            names += name + "\n";
        }

        //I return the new names in the sorted order.
        return names;

    }

    public static int meleeDamage(int attack, int strength, int opponentDefense) throws ActorControlException {

        if (attack < 0 || attack > 5000) {
            if (attack > 100) {
                throw new ActorControlException("The attack was to large of a number.");
            }
            throw new ActorControlException("The attack was a negative number.");
        }

        if (strength < 0 || strength > 100) {
            if (strength > 100) {
                throw new ActorControlException("The strength was to large of a number.");
            }
            throw new ActorControlException("The strength was a negative number.");

        }

        if (opponentDefense < 1 || opponentDefense > 100) {
            if (opponentDefense > 100) {
                throw new ActorControlException("The opponentDefense was to large of a number.");
            }
            throw new ActorControlException("The opponentDefense was a negative number.");
        }

        int meleeDamage = attack + strength - opponentDefense + (int) (Math.random() * 10);
        
        if (meleeDamage < 0) {
            meleeDamage = 0;
        }

        return meleeDamage;

    }

    public static int spellDamage(int spellAttack, int mana, int opponentDefense) throws ActorControlException {

        if (spellAttack < 0 || spellAttack > 200) {
            if (spellAttack > 100) {
                throw new ActorControlException("The attack was to large of a number.");
            }
            throw new ActorControlException("The attack was a negitive number.");
        }

        if (mana < 0 || mana > 200) {
            if (mana > 100) {
                throw new ActorControlException("The mana was to large of a number.");
            }
            throw new ActorControlException("The mana was a negitive number.");
        }

        if (opponentDefense < 0 || opponentDefense > 200) {
            if (opponentDefense > 100) {
                throw new ActorControlException("The opponentDefense was to large of a number.");
            }
            throw new ActorControlException("The opponentDefense was a negitive number.");
        }

        int manaDamage = (spellAttack + mana - opponentDefense) + (int) (Math.random() * 10);

        if (manaDamage < 0) {
            manaDamage = 0;
        }
        return manaDamage;

    }

    public static int monsterAttack(int attack, int opponentDefense) {
        int monsterDamage = attack - opponentDefense + (int) (Math.random() * 10);
        if (monsterDamage < 0) {
            monsterDamage = 0;
        }
        return monsterDamage;
    }
    
    public static int pickRandomMonster() {
        
        int numberReturn;
        int randomNumber = (int) (Math.random() * 10);
        
        
        
        if (randomNumber < 3) {
            numberReturn = 0;
        } else if (randomNumber < 6) {
            numberReturn = 1;
        } else if (randomNumber < 8) {
            numberReturn = 2;
        } else {
            numberReturn = 3;
        }
        
        return numberReturn;
    }

    public enum ActorGroup {
        plainsActors,
        jungleActors,
        forestActors,
        mountainActors,
    }
}
