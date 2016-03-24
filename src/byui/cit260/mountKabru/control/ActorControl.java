package byui.cit260.mountKabru.control;

import byui.cit260.mountKabru.exceptions.ActorControlException;
import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Hero;
import java.util.Arrays;

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
//    private int chanceToHit;
//    private int gold;
        
        //Create the list of Actors
        
        Actor[][] actors = new Actor[4][1];
       
            //plains MOnsters
            Actor[] plainsActors = new Actor[4];
            Actor gnome = new Actor("gnome", 8,4,3,2,7);
            plainsActors[0] = gnome;
            Actor banshee = new Actor("Banshee", 12,5,5,2,12 );
            plainsActors[1] = banshee;
            Actor evilRabbits = new Actor("EvilRabbits", 15,3,16,4,30);
            plainsActors[2] = evilRabbits;
            Actor wolves = new Actor("wolves", 9,3,6,6,15);
            plainsActors[3] = wolves;
        actors[0] = plainsActors;

            //Jungle Monsters
            Actor[] jungleActors = new Actor[4];
            Actor frogs = new Actor("Frogs", 20,5,15,3,45);
            jungleActors[0] = frogs;
            Actor manticore = new Actor("Manticore", 25,7,17,3,100);
            jungleActors[1] = manticore;
            Actor gators = new Actor("Gators", 30,8,18,3,37);
            jungleActors[2] = gators;
            Actor largeSpider = new Actor("Large Spider", 24,6,14,6,60);
            jungleActors[3] = largeSpider;
        actors[1] = jungleActors;

            //DarkForest Monsters
            Actor[] forestActors = new Actor[4];
            Actor werewolves = new Actor("Werewolves", 35,15,45,4,125);
            forestActors[6] = werewolves;
            Actor dryad = new Actor("Dryad", 40,25,55,5,250);
            forestActors[7] = dryad;
            Actor theUndead = new Actor("TheUndead", 50,34,67,7,650);
            forestActors[8] = theUndead;
            Actor centaurs = new Actor("Centaurs", 45,28,48,6,450);
            forestActors[8] = centaurs;
        actors[2] = forestActors;

            //HighMountain
            Actor[] mountainActors = new Actor[4];
            Actor dragon = new Actor("Dragon", 60,45,55,34,250);
            mountainActors[9] = dragon;
            Actor hydra = new Actor("Hydra", 70,67,100,34,9000);
            mountainActors[10] = hydra;
            Actor giant = new Actor("Giant", 150,75,46,34,40000);
            mountainActors[11] = giant;
            Actor master = new Actor("Master", 1,1,1,0,9999999);
            mountainActors[12] = master;
        actors[3] = mountainActors;
        
        
        return actors;
        
    }
    
    
    

    public static int avgMonsterHP(Actor[][] actors) throws ActorControlException {
        
        //needs to find the average of the player hitpoints.
       

        if (actors == null){
            throw new ActorControlException("The actors variable was null.");
        }
        
        int averageHP = 0;
        int totalHP = 0;

        for (Actor[][] actor : actors) {
            int hitPoints = actor.getHitPoints();
            if (hitPoints < 1 || hitPoints > 150) {
                throw new ActorControlException("The hitPoints was too large or too small of a number.");
            }
            
            totalHP += hitPoints; 
        }
        
        averageHP = totalHP / actors.length;
        
        return averageHP;
    }

    public static String listOMonsters(Actor[][] actors) throws ActorControlException {
        
        if (actors == null){
            throw new ActorControlException("The actors variable was null.");
        }
        
        // Here I am creating a new array that I will sort the names into to arrange them.
        String[] newNames = new String[actors.length];

        //This for statement is here to count the names from the array above into a list
        for (int i = 0; i < newNames.length;i++) {

            //newNames is the name of the array, Here I am telling the array to find the index of the name using the ge
            //getName function. After it is called it puts the name into the empty location in the newNames array.
            newNames[i] = actors[i].getName();
        }


        String names = "\n";
        // Here I am sorting the array of newNames alphabetically
        Arrays.sort(newNames);

        // This is where I am assigning the names a variable of "name" from the newNames array data-types
        for (String name : newNames)
            names += name + "\n";
        
        //I return the new names in the sorted order.
        return names;

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
    
    public enum ActorGroup {
        plainsActors,
        jungleActors,
        forestActors,
        mountainActors,
    }
}
