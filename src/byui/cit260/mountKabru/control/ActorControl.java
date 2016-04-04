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
        Actor[][] actors = new Actor[32][1];
    //Plains Actors
        Actor giantAnt = new Actor("Giant Ants"     , 30, 30, 5, 5, 0, 3, 7);
        Actor gnome = new Actor("Naughty Gnomes"    , 35, 35, 5, 7, 0, 3, 8);
        Actor gremlins = new Actor("Gremlins"       , 40, 40, 5, 9, 0, 4, 12);
        Actor wolves = new Actor("Wolves"           , 45, 45, 10, 11, 0, 5, 15);
        Actor evilRabbits = new Actor("EvilRabbits" , 50, 50, 10, 13, 0, 6, 20);
        Actor kabold = new Actor("Kabold"           , 55, 55, 10, 16, 0, 6, 23);
        Actor banshee = new Actor("Banshees"        , 60, 60, 15, 17, 0, 8, 27);
        Actor goblin = new Actor("Mod of Goblins"   , 65, 65, 15, 20, 0, 10, 30);        
        
    //Jungle Actors
        Actor flies = new Actor("Sworm of Flies"     , 100, 100, 20, 40, 0, 8, 40);
        Actor frogs = new Actor("Frogs"             , 120, 120, 20, 50, 0, 10, 45);
        Actor spider = new Actor("Large Spiders"    , 140, 140, 20, 60, 0, 12, 50);
        Actor curupira = new Actor("Curupira"       , 160, 160, 40, 70, 0, 14, 55);
        Actor snake = new Actor("Snakes"            , 180, 180, 40, 70, 0, 18, 60);
        Actor manticore = new Actor("Manticores"    , 200, 200, 50, 80, 0, 20, 65);
        Actor panther = new Actor("Black Panthers"  , 215, 215, 50, 90, 0, 25, 70);
        Actor gators = new Actor("Gators"           , 250, 250, 40, 100, 0, 30, 80);
        
        
    //Dark Forest Actors
        Actor cougar = new Actor("Cougars"          , 300, 300, 50, 100, 0, 35, 90);
        Actor darkElves = new Actor("Dark Elves"    , 330, 330, 50, 110, 0, 40, 95);
        Actor dirtySatyr = new Actor("Dirty Satyrs" , 350, 350, 55, 120, 0, 45, 100);
        Actor dryad = new Actor("Group of Dryads"   , 360, 360, 55, 120, 0, 50, 110);
        Actor centaurs = new Actor("Centaurs"       , 390, 390, 60, 130, 0, 55, 120);
        Actor werewolves = new Actor("Werewolves"   , 420, 420, 60, 130, 0, 60, 130);
        Actor leshy = new Actor("Group of Leshiye"  , 600, 600, 50, 140, 0, 65, 140);
        Actor theUndead = new Actor("The Undead"    , 1600, 1600, 20, 50, 50, 70, 200);
        
        
    //High Mountain Actors
        Actor troll = new Actor("trolls"            , 1000, 1000, 70, 120, 0, 34, 320);
        Actor wraith = new Actor("a Wraith"         , 1500, 1500, 70, 130, 0, 34, 340);
        Actor golem = new Actor("Magical Golems"    , 2000, 2000, 80, 140, 0, 34, 360);
        Actor demon = new Actor("a Monstrous Demon" , 2500, 2500, 90, 150, 0, 34, 380);
        Actor dragon = new Actor("a Dragon"         , 3500, 3500, 110, 150, 0, 34, 400);
        Actor hydra = new Actor("a Hydra with 6 Heads", 4800, 4800, 130, 160, 0, 34, 500);
        Actor giant = new Actor("a Giant"           , 6000, 6000, 150,170, 0, 34, 600);
        Actor master = new Actor("The Master"       , 1, 1, 1, 0, 1, 0, -20000);
        
        
    //plains Monsters
        Actor[] plainsActors1 = new Actor[8];
        
            plainsActors1[0] = giantAnt;
            plainsActors1[1] = giantAnt;
            plainsActors1[2] = giantAnt;
            plainsActors1[3] = giantAnt;
            plainsActors1[4] = giantAnt;
            plainsActors1[5] = giantAnt;
            plainsActors1[6] = giantAnt;
            plainsActors1[7] = giantAnt;
        actors[0] = plainsActors1;
        
        Actor[] plainsActors2 = new Actor[8];
        
            plainsActors2[0] = giantAnt;
            plainsActors2[1] = giantAnt;
            plainsActors2[2] = giantAnt;
            plainsActors2[3] = giantAnt;
            plainsActors2[4] = gnome;
            plainsActors2[5] = gnome;
            plainsActors2[6] = gnome;
            plainsActors2[7] = gnome;
        actors[1] = plainsActors2;
        
        Actor[] plainsActors3 = new Actor[8];
        
            plainsActors3[0] = giantAnt;
            plainsActors3[1] = giantAnt;
            plainsActors3[2] = gnome;
            plainsActors3[3] = gnome;
            plainsActors3[4] = gremlins;
            plainsActors3[5] = gremlins;
            plainsActors3[6] = wolves;
            plainsActors3[7] = wolves;
        actors[2] = plainsActors3;
        
        Actor[] plainsActors4 = new Actor[8];
        
            plainsActors4[0] = gnome;
            plainsActors4[1] = gnome;
            plainsActors4[2] = gremlins;
            plainsActors4[3] = gremlins;
            plainsActors4[4] = wolves;
            plainsActors4[5] = wolves;
            plainsActors4[6] = evilRabbits;
            plainsActors4[7] = evilRabbits;
        actors[3] = plainsActors4;
        
        Actor[] plainsActors5 = new Actor[8];
        
            plainsActors5[0] = gremlins;
            plainsActors5[1] = gremlins;
            plainsActors5[2] = wolves;
            plainsActors5[3] = wolves;
            plainsActors5[4] = evilRabbits;
            plainsActors5[5] = evilRabbits;
            plainsActors5[6] = kabold;
            plainsActors5[7] = kabold;
        actors[4] = plainsActors5;
        
        Actor[] plainsActors6 = new Actor[8];
        
            plainsActors6[0] = wolves;
            plainsActors6[1] = wolves;
            plainsActors6[2] = evilRabbits;
            plainsActors6[3] = evilRabbits;
            plainsActors6[4] = kabold;
            plainsActors6[5] = kabold;
            plainsActors6[6] = banshee;
            plainsActors6[7] = banshee;
        actors[5] = plainsActors6;
        
        Actor[] plainsActors7 = new Actor[8];
       
            plainsActors7[0] = evilRabbits;
            plainsActors7[1] = evilRabbits;
            plainsActors7[2] = kabold;
            plainsActors7[3] = kabold;
            plainsActors7[4] = kabold;
            plainsActors7[5] = banshee;
            plainsActors7[6] = banshee;
            plainsActors7[7] = banshee;
        actors[6] = plainsActors7;
        
        Actor[] plainsActors8 = new Actor[8];
        
            plainsActors8[0] = kabold;
            plainsActors8[1] = kabold;
            plainsActors8[2] = banshee;
            plainsActors8[3] = banshee;
            plainsActors8[4] = banshee;
            plainsActors8[5] = goblin;
            plainsActors8[6] = goblin;
            plainsActors8[7] = goblin;
        actors[7] = plainsActors8;

    //Jungle Monsters
        Actor[] jungleActors1 = new Actor[8];
        
            jungleActors1[0] = banshee;
            jungleActors1[1] = banshee;
            jungleActors1[2] = goblin;
            jungleActors1[3] = goblin;
            jungleActors1[4] = flies;
            jungleActors1[5] = flies;
            jungleActors1[6] = flies;
            jungleActors1[7] = flies;
        actors[8] = jungleActors1;
        
        Actor[] jungleActors2 = new Actor[8];
        
            jungleActors2[0] = goblin;
            jungleActors2[1] = goblin;
            jungleActors2[2] = flies;
            jungleActors2[3] = flies;
            jungleActors2[4] = flies;
            jungleActors2[5] = frogs;
            jungleActors2[6] = frogs;
            jungleActors2[7] = frogs;
        actors[9] = jungleActors2;
        
        Actor[] jungleActors3 = new Actor[8];
        
            jungleActors3[0] = flies;
            jungleActors3[1] = flies;
            jungleActors3[2] = frogs;
            jungleActors3[3] = frogs;
            jungleActors3[4] = spider;
            jungleActors3[5] = spider;
            jungleActors3[6] = curupira;
            jungleActors3[7] = curupira;
        actors[10] = jungleActors3;
        
        Actor[] jungleActors4 = new Actor[8];
        
            jungleActors4[0] = frogs;
            jungleActors4[1] = frogs;
            jungleActors4[2] = spider;
            jungleActors4[3] = spider;
            jungleActors4[4] = curupira;
            jungleActors4[5] = curupira;
            jungleActors4[6] = snake;
            jungleActors4[7] = snake;
        actors[11] = jungleActors4;
        
        Actor[] jungleActors5 = new Actor[8];
        
            jungleActors5[0] = spider;
            jungleActors5[1] = spider;
            jungleActors5[2] = curupira;
            jungleActors5[3] = curupira;
            jungleActors5[4] = snake;
            jungleActors5[5] = snake;
            jungleActors5[6] = manticore;
            jungleActors5[7] = manticore;
        actors[12] = jungleActors5;
        
        Actor[] jungleActors6 = new Actor[8];
        
            jungleActors6[0] = curupira;
            jungleActors6[1] = curupira;
            jungleActors6[2] = snake;
            jungleActors6[3] = snake;
            jungleActors6[4] = manticore;
            jungleActors6[5] = manticore;
            jungleActors6[6] = panther;
            jungleActors6[7] = panther;
        actors[13] = jungleActors6;
        
        Actor[] jungleActors7 = new Actor[8];
        
            jungleActors7[0] = snake;
            jungleActors7[1] = snake;
            jungleActors7[2] = manticore;
            jungleActors7[3] = manticore;
            jungleActors7[4] = manticore;
            jungleActors7[5] = panther;
            jungleActors7[6] = panther;
            jungleActors7[7] = panther;
        actors[14] = jungleActors7;
        
        Actor[] jungleActors8 = new Actor[8];
        
            jungleActors8[0] = manticore;
            jungleActors8[1] = manticore;
            jungleActors8[2] = panther;
            jungleActors8[3] = panther;
            jungleActors8[4] = panther;
            jungleActors8[5] = gators;
            jungleActors8[6] = gators;
            jungleActors8[7] = gators;
        actors[15] = jungleActors8;

    //DarkForest Monsters
        Actor[] forestActors1 = new Actor[8];
        
            forestActors1[0] = panther;
            forestActors1[1] = panther;
            forestActors1[2] = gators;
            forestActors1[3] = gators;
            forestActors1[4] = cougar;
            forestActors1[5] = cougar;
            forestActors1[6] = cougar;
            forestActors1[7] = cougar;
        actors[16] = forestActors1;
        
        Actor[] forestActors2 = new Actor[8];
        
            forestActors2[0] = gators;
            forestActors2[1] = gators;
            forestActors2[2] = cougar;
            forestActors2[3] = cougar;
            forestActors2[4] = cougar;
            forestActors2[5] = darkElves;
            forestActors2[6] = darkElves;
            forestActors2[7] = darkElves;
        actors[17] = forestActors2;
        
        Actor[] forestActors3 = new Actor[8];
        
            forestActors3[0] = cougar;
            forestActors3[1] = cougar;
            forestActors3[2] = darkElves;
            forestActors3[3] = darkElves;
            forestActors3[4] = dirtySatyr;
            forestActors3[5] = dirtySatyr;
            forestActors3[6] = dryad;
            forestActors3[7] = dryad;
        actors[18] = forestActors3;
        
        Actor[] forestActors4 = new Actor[8];
        
            forestActors4[0] = darkElves;
            forestActors4[1] = darkElves;
            forestActors4[2] = dirtySatyr;
            forestActors4[3] = dirtySatyr;
            forestActors4[4] = dryad;
            forestActors4[5] = dryad;
            forestActors4[6] = centaurs;
            forestActors4[7] = centaurs;
        actors[19] = forestActors4;
        
        Actor[] forestActors5 = new Actor[8];
        
            forestActors5[0] = dirtySatyr;
            forestActors5[1] = dirtySatyr;
            forestActors5[2] = dryad;
            forestActors5[3] = dryad;
            forestActors5[4] = centaurs;
            forestActors5[5] = centaurs;
            forestActors5[6] = werewolves;
            forestActors5[7] = werewolves;
        actors[20] = forestActors5;
        
        Actor[] forestActors6 = new Actor[8];
        
            forestActors6[0] = dryad;
            forestActors6[1] = dryad;
            forestActors6[2] = centaurs;
            forestActors6[3] = centaurs;
            forestActors6[4] = werewolves;
            forestActors6[5] = werewolves;
            forestActors6[6] = leshy;
            forestActors6[7] = leshy;
        actors[21] = forestActors6;
        
        Actor[] forestActors7 = new Actor[8];
        
            forestActors7[0] = centaurs;
            forestActors7[1] = centaurs;
            forestActors7[2] = werewolves;
            forestActors7[3] = werewolves;
            forestActors7[4] = werewolves;
            forestActors7[5] = leshy;
            forestActors7[6] = leshy;
            forestActors7[7] = leshy;
        actors[22] = forestActors7;
        
        Actor[] forestActors8 = new Actor[8];
        
            forestActors8[0] = werewolves;
            forestActors8[1] = werewolves;
            forestActors8[2] = leshy;
            forestActors8[3] = leshy;
            forestActors8[4] = leshy;
            forestActors8[5] = theUndead;
            forestActors8[6] = theUndead;
            forestActors8[7] = theUndead;
        actors[23] = forestActors8;

    //HighMountain
        Actor[] mountainActors1 = new Actor[8];
        
            mountainActors1[0] = leshy;
            mountainActors1[1] = leshy;
            mountainActors1[2] = theUndead;
            mountainActors1[3] = theUndead;
            mountainActors1[4] = troll;
            mountainActors1[5] = troll;
            mountainActors1[6] = troll;
            mountainActors1[7] = troll;
        actors[24] = mountainActors1;
        
        Actor[] mountainActors2 = new Actor[8];
        
            mountainActors2[0] = theUndead;
            mountainActors2[1] = theUndead;
            mountainActors2[2] = troll;
            mountainActors2[3] = troll;
            mountainActors2[4] = troll;
            mountainActors2[5] = wraith;
            mountainActors2[6] = wraith;
            mountainActors2[7] = wraith;
        actors[25] = mountainActors2;
        
        Actor[] mountainActors3 = new Actor[8];
        
            mountainActors3[0] = troll;
            mountainActors3[1] = troll;
            mountainActors3[2] = wraith;
            mountainActors3[3] = wraith;
            mountainActors3[4] = golem;
            mountainActors3[5] = golem;
            mountainActors3[6] = demon;
            mountainActors3[7] = demon;
        actors[26] = mountainActors3;
        
        Actor[] mountainActors4 = new Actor[8];
        
            mountainActors4[0] = wraith;
            mountainActors4[1] = wraith;
            mountainActors4[2] = golem;
            mountainActors4[3] = golem;
            mountainActors4[4] = demon;
            mountainActors4[5] = demon;
            mountainActors4[6] = dragon;
            mountainActors4[7] = dragon;
        actors[27] = mountainActors4;
        
        Actor[] mountainActors5 = new Actor[8];
        
            mountainActors5[0] = golem;
            mountainActors5[1] = golem;
            mountainActors5[2] = demon;
            mountainActors5[3] = demon;
            mountainActors5[4] = dragon;
            mountainActors5[5] = dragon;
            mountainActors5[6] = hydra;
            mountainActors5[7] = hydra;
        actors[28] = mountainActors5;
        
        Actor[] mountainActors6 = new Actor[8];
        
            mountainActors6[0] = demon;
            mountainActors6[1] = demon;
            mountainActors6[2] = dragon;
            mountainActors6[3] = dragon;
            mountainActors6[4] = hydra;
            mountainActors6[5] = hydra;
            mountainActors6[6] = giant;
            mountainActors6[7] = giant;
        actors[29] = mountainActors6;
        
        Actor[] mountainActors7 = new Actor[8];
        
            mountainActors7[0] = dragon;
            mountainActors7[1] = dragon;
            mountainActors7[2] = hydra;
            mountainActors7[3] = hydra;
            mountainActors7[4] = hydra;
            mountainActors7[5] = giant;
            mountainActors7[6] = giant;
            mountainActors7[7] = giant;
        actors[30] = mountainActors7;
        
        Actor[] mountainActors8 = new Actor[8];
        
            mountainActors8[0] = hydra;
            mountainActors8[1] = hydra;
            mountainActors8[2] = hydra;
            mountainActors8[3] = giant;
            mountainActors8[4] = giant;
            mountainActors8[5] = giant;
            mountainActors8[6] = master;
            mountainActors8[7] = master;
        actors[31] = mountainActors8;

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

        Actor[] plainsActors = actors1[ActorControl.ActorGroup.plainsActors8.ordinal()];

        for (Actor actors : plainsActors) {
            int plainsHitPoints = actors.getMaxHitPoints();
            if (plainsHitPoints < 1 || plainsHitPoints > 250) {
                throw new ActorControlException("The hitPoints was too large or too small of a number.");
            }

            totalHP += plainsHitPoints;
        }

        Actor[] jungleActors = actors1[ActorControl.ActorGroup.jungleActors8.ordinal()];

        for (Actor actors : jungleActors) {
            int jungleHitPoints = actors.getMaxHitPoints();
            if (jungleHitPoints < 1 || jungleHitPoints > 250) {
                throw new ActorControlException("The hitPoints was too large or too small of a number.");
            }

            totalHP += jungleHitPoints;
        }

        Actor[] forestActors = actors1[ActorControl.ActorGroup.forestActors8.ordinal()];

        for (Actor actors : forestActors) {
            int forestHitPoints = actors.getMaxHitPoints();
            if (forestHitPoints < 1 || forestHitPoints > 250) {
                throw new ActorControlException("The hitPoints was too large or too small of a number.");
            }

            totalHP += forestHitPoints;
        }

        Actor[] mountainActors = actors1[ActorControl.ActorGroup.mountainActors7.ordinal()];

        for (Actor actors : mountainActors) {
            int mountainHitPoints = actors.getMaxHitPoints();
            if (mountainHitPoints < 1 || mountainHitPoints > 250) {
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
        Actor[] plainsActors = actors[ActorGroup.plainsActors8.ordinal()];
        Actor[] jungleActors = actors[ActorGroup.jungleActors8.ordinal()];
        Actor[] forestActors = actors[ActorGroup.forestActors8.ordinal()];
        Actor[] mountainActors = actors[ActorGroup.mountainActors8.ordinal()];

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

    public static int monsterAttack(int spellAttack, int attack, int opponentDefense) {
        int monsterDamage = spellAttack + attack - opponentDefense + (int) (Math.random() * 10);
        if (monsterDamage < 0) {
            monsterDamage = 0;
        }
        return monsterDamage;
    }
    
    public static int pickRandomMonster() {
        
        int numberReturn;
        int randomNumber = (int) (Math.random() * 10);
        
        
        
        if (randomNumber <= 3) {
            numberReturn = 0;
        } else if (randomNumber <= 4) {
            numberReturn = 1;
        } else if (randomNumber <= 5) {
            numberReturn = 2;
        } else if (randomNumber <= 6) {
            numberReturn = 3;
        } else if (randomNumber <= 7) {
            numberReturn = 4;
        } else if (randomNumber <= 8) {
            numberReturn = 5;
        } else if (randomNumber <= 9) {
            numberReturn = 6;
        } else {
            numberReturn = 7;
        }
        
        return numberReturn;
    }
    
    public static int pickRandomGold() {
        
        int numberReturn;
        int randomNumber = (int) (Math.random() * 10);
        
        
        
        if (randomNumber < 3) {
            numberReturn = 0;
        } else if (randomNumber < 5) {
            numberReturn = 1;
        } else if (randomNumber < 8) {
            numberReturn = 2;
        } else {
            numberReturn = 3;
        } 
        
        return numberReturn;
    }

    public enum ActorGroup {
        plainsActors1,
        plainsActors2,
        plainsActors3,
        plainsActors4,
        plainsActors5,
        plainsActors6,
        plainsActors7,
        plainsActors8,
        jungleActors1,
        jungleActors2,
        jungleActors3,
        jungleActors4,
        jungleActors5,
        jungleActors6,
        jungleActors7,
        jungleActors8,
        forestActors1,
        forestActors2,
        forestActors3,
        forestActors4,
        forestActors5,
        forestActors6,
        forestActors7,
        forestActors8,
        mountainActors1,
        mountainActors2,
        mountainActors3,
        mountainActors4,
        mountainActors5,
        mountainActors6,
        mountainActors7,
        mountainActors8,
    }
}
