/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.ActorControl;
import byui.cit260.mountKabru.exceptions.GameControlException;
import byui.cit260.mountKabru.model.Actor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import mountkabru.MountKabru;

/**
 *
 * @author wibur
 */
public class PrintReportView extends View {

    public PrintReportView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n|  You head into the printShop and   |"
                + "\n|  decide what to do next...         |"
                + "\n--------------------------------------"
                + "\n(M) - Print [M]onster Report"
                + "\n(H) - Print [H]ero Report "
                + "\n(F) - Lick some envelopes "
                + "\n "
                + "\n(Q) - [Q]uit"
                + "\n--------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "M": // go kill stuff in the plains
                this.monsterReport();
                break;
            case "H": // go kill stuff in the jungle
                this.heroReport();
                break;
            case "F": // go kill stuff in the forest
                this.lickIt();
                break;

            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void monsterReport() {

        this.console.println("Where would you like to save your file?");
        String filePath = getInput();

        Actor[][] actors = MountKabru.getCurrentGame().getActors();
        String monsterStats = null;

        for (int i = 0; i < actors.length; i++) {
            for (int r = 0; r < actors[i].length; r++) {
                monsterStats += actors[i][r].getName() 
                + "               " 
                + actors[i][r].getHitPoints()
                + "               "
                + actors[i][r].getGold()
                + "\n";

            }
        }

        String monsterReport = "\n"
                + "\n|--------------------------------------------------|"
                + "\n|                                                  |"
                + "\n|     ****        Monster  Report       ****       |"
                + "\n|                                                  |"
                + "\n|--------------------------------------------------|"
                + "\n The Monsters       Hit Points          Gold "
                + "\n-----------         ------------       ------------"
                + "\n" + monsterStats
     
                + "\n--------------------------------------";

        FileOutputStream fops = null;
        try {
            fops = new FileOutputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream output = null;
        try {
            output = new ObjectOutputStream(fops);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            output.writeObject(monsterReport); //write game to object File
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void heroReport() {
        this.console.println("Where would you like to save the report?");

        String filePath = getInput();

        String heroReport = "\n"
                + "\n|----------------------------------------|"
                + "\n|                                        |"
                + "\n|          Hero stats Report             |"
                + "\n|                                        |"
                + "\n|----------------------------------------|"
                + "\n The Stats      Starting Values          Current Values"
                + "\n-----------     ---------------         --------------------"
                + "\n Name              null                    " + MountKabru.getCurrentGame().getHero().getHeroName()
                + "\n HitPoints          20"
                + "\n  "
                + "\n  "
                + "\n  "
                + "\n  "
                + "\n  "
                + "\n  "
                + "\n  "
                + "\n  "
                + "\n  "
                + "\n--------------------------------------";

        FileOutputStream fops = null;
        try {
            fops = new FileOutputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream output = null;
        try {
            output = new ObjectOutputStream(fops);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            output.writeObject(heroReport); //write game to object File
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void lickIt() {
        this.console.println("*** You started licking only to find out it was a sticky envelope ***");
    }

}
