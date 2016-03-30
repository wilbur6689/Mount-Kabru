/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.ActorControl;
import byui.cit260.mountKabru.control.EventControl;
import byui.cit260.mountKabru.control.WorldControl;
import byui.cit260.mountKabru.model.Actor;
import byui.cit260.mountKabru.model.Event;
import byui.cit260.mountKabru.model.Location;
import byui.cit260.mountKabru.model.World;
import mountkabru.MountKabru;

/**
 *
 * @author Phill
 */
public class AdventureView extends View {

    public AdventureView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n|  You wander out of town and try to   |"
                + "\n|  decide what to fight next...        |"
                + "\n----------------------------------------"
                + "\nS - [S]earch for a monster"
                + "\nP - use a [P]otion"
                + "\nC - [C]heck your stats"
                + "\nR - [R]eturn back to Map"
                + "\n--------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "S": // go kill stuff in the Jungle
                this.searchForMonster();
                if (MountKabru.getCurrentGame().isEndOfGame()){
                    return true;
                }
                break;
            case "P": // use a potion
                this.usePotion();
                break;
            case "C": // view your inventory
                this.checkStats();
                break;
            case "L": // use a potion
                this.curLocation();
                break;
            case "X": // use a potion
                this.changeLocation();
                break;
            case "R": // use a potion
                return true;

            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void searchForMonster() {

        Actor[] monsters = MountKabru.getCurrentGame().getHero().getCurrentLocation().getEvent().getActors();

        if (monsters != null) {
            Actor monsterYouFight = monsters[ActorControl.pickRandomMonster()];
            int maxHP = monsterYouFight.getMaxHitPoints();
            monsterYouFight.setCurrentHitPoints(maxHP);
            MountKabru.getCurrentGame().getHero().setFoundMonster(monsterYouFight);

            //create the Attack Monster view object
            AttackMonsView attackMonsView = new AttackMonsView();
            //display the Attack Monster view
            attackMonsView.display();
            return;
        } else {
            int[] goldEvents = MountKabru.getCurrentGame().getHero().getCurrentLocation().getEvent().getGoldEvent();

            int goldFound = goldEvents[ActorControl.pickRandomMonster()];
            this.console.println("You Found this much GOLD: " + goldFound);
            int givePlayerGold = MountKabru.getCurrentGame().getHero().getGold() + goldFound;
            MountKabru.getCurrentGame().getHero().setGold(givePlayerGold);

            World world = MountKabru.getCurrentGame().getWorld();
            Location[][] locations = MountKabru.getCurrentGame().getWorld().getLocations();
            Event[][] events = EventControl.createEvents();

            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations[i].length - 1; j++) {
                    //                events[i][j] = locations[i][j].getEvent();
                    //System.out.println(locations[i][j].getEvent().getEventType());
                }
            }
            WorldControl.setEventsToLocations(world, events);

        }

    }

    private void usePotion() {
        this.console.println("\n*** you look into your potion pouch and  ***"
                + "\n*** remember you dont have any potions   ***");
    }

    private void checkStats() {
        String heroName = MountKabru.getCurrentGame().getHero().getName();
        String heroClass = MountKabru.getCurrentGame().getHero().getHeroClassType();
        int heroLevel = MountKabru.getCurrentGame().getHero().getLevelOfHero();
        int heroExperience = MountKabru.getCurrentGame().getHero().getExperience();
        int heroStrength = MountKabru.getCurrentGame().getHero().getStrength();
        int heroMana = MountKabru.getCurrentGame().getHero().getMana();
        int heroCurrentHP = MountKabru.getCurrentGame().getHero().getCurrentHitPoints();
        int heroDefence = MountKabru.getCurrentGame().getHero().getDefence();
        int heroAttack = MountKabru.getCurrentGame().getHero().getAttack();
        int heroSpellAttack = MountKabru.getCurrentGame().getHero().getSpellAttack();
        int heroChanceToHit = MountKabru.getCurrentGame().getHero().getXpGained();
        int heroGold = MountKabru.getCurrentGame().getHero().getGold();
        String weaponSlot = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getName();
        String armorSlot = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getName();
        String spellSlot = MountKabru.getCurrentGame().getHero().getInventory().getSpellSlot().getName();
        String healthPotion = MountKabru.getCurrentGame().getHero().getInventory().getHealthPotionSlot().getName();
        String manaPotion = MountKabru.getCurrentGame().getHero().getInventory().getManaPotionSlot().getName();
        
        this.console.println(
                          "\n"
                + "\n Hero Name:   " + heroName 
                + "\n Class:       " + heroClass
                + "\n Level:       " + heroLevel
                + "\n Experience:  " + heroExperience
                + "\n Strength:    " + heroStrength
                + "\n Mana:        " + heroMana
                + "\n Hitpoints:   " + heroCurrentHP 
                + "\n Defence:     " + heroDefence
                + "\n Attack:      " + heroAttack
                + "\n Spell Atk    " + heroSpellAttack
                + "\n To Hit:      " + heroChanceToHit
                + "\n Gold:        " + heroGold
                + "\n"
                + "\n Weapon:      " + weaponSlot
                + "\n Armor:       " + armorSlot
                + "\n Spell:       " + spellSlot
                + "\n HP Potion:   " + healthPotion
                + "\n Mana Potion: " + manaPotion
        );
    }

    private void curLocation() {
        String eventType = MountKabru.getCurrentGame().getHero().getCurrentLocation().getEvent().getEventType();
        String locationType = MountKabru.getCurrentGame().getHero().getCurrentLocation().getEvent().getLocationType();
        String eventName = MountKabru.getCurrentGame().getHero().getCurrentLocation().getEvent().getEventName();

        this.console.println("This is your event type: " + eventType
                + "\n This is your location type: " + locationType
                + "\n this is the event name: " + eventName);

    }

    private void changeLocation() {
        World world = MountKabru.getCurrentGame().getWorld();
        Location[][] locations = MountKabru.getCurrentGame().getWorld().getLocations();
        Event[][] events = EventControl.createEvents();

        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length - 1; j++) {
//                events[i][j] = locations[i][j].getEvent();
                System.out.println(locations[i][j].getEvent().getEventType());
            }
        }

        WorldControl.setEventsToLocations(world, events);

    }

}
