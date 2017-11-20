package byui.cit260.mountKabru.control;

import mountkabru.MountKabru;

import java.util.Scanner;

public class HeroControl {

    public String displayCharStats(){

        String heroName = MountKabru.getCurrentGame().getHero().getHeroName();
        String heroClass = MountKabru.getCurrentGame().getHero().getHeroClassType();
        int heroLevel = MountKabru.getCurrentGame().getHero().getLevelOfHero();
        int heroExperience = MountKabru.getCurrentGame().getHero().getExperience();
        int heroToNextLvl = MountKabru.getCurrentGame().getHero().getXpToNextLevel();
        int heroStrength = MountKabru.getCurrentGame().getHero().getStrength();
        int heroMana = MountKabru.getCurrentGame().getHero().getMana();
        int heroCurrentHP = MountKabru.getCurrentGame().getHero().getCurrentHitPoints();
        int heroDefence = MountKabru.getCurrentGame().getHero().getDefense();
        int heroAttack = MountKabru.getCurrentGame().getHero().getAttack();
        int heroSpellAttack = MountKabru.getCurrentGame().getHero().getSpellAttack();
        int heroGold = MountKabru.getCurrentGame().getHero().getGold();
        String weaponSlot = MountKabru.getCurrentGame().getHero().getInventory().getWeaponSlot().getName();
        String armorSlot = MountKabru.getCurrentGame().getHero().getInventory().getArmorSlot().getName();
        String spellSlot = MountKabru.getCurrentGame().getHero().getInventory().getSpellSlot().getName();
        String healthPotion = MountKabru.getCurrentGame().getHero().getInventory().getHealthPotionSlot().getName();
        String manaPotion = MountKabru.getCurrentGame().getHero().getInventory().getManaPotionSlot().getName();

        String stats = (
                "\n"
                        + "\n Hero Name:        " + heroName
                        + "\n Class:            " + heroClass
                        + "\n Level:            " + heroLevel
                        + "\n Experience:       " + heroExperience
                        + "\n XP to Level Up:   " + heroToNextLvl
                        + "\n Strength:         " + heroStrength
                        + "\n Mana:             " + heroMana
                        + "\n Hitpoints:        " + heroCurrentHP
                        + "\n Defence:          " + heroDefence
                        + "\n Attack:           " + heroAttack
                        + "\n Spell Atk         " + heroSpellAttack
                        + "\n Gold:             " + heroGold
                        + "\n"
                        + "\n Weapon:           " + weaponSlot
                        + "\n Armor:            " + armorSlot
                        + "\n Spell:            " + spellSlot
                        + "\n HP Potion:        " + healthPotion
                        + "\n Mana Potion:      " + manaPotion
                        + "\n"
                        + "\n"
        );

        return stats;
    }

    public void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
