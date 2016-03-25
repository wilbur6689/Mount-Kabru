/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.exceptions.GameControlException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
                + "\n(C) - Print [H]ero Report "
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
        
        
       String monsterReport = "\n"
               + "\n|----------------------------------------|"
               + "\n|                                        |"
               + "\n|          Hero stats Report             |"
               + "\n|                                        |"
               + "\n|----------------------------------------|"
               + "\n The Stats                The Values"
               + "\n-----------              ------------"  
               + "\n Name                    " + MountKabru.getCurrentGame().getHero().getHeroName()
               + "\n  "
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
               + "\n The Stats                The Values"
               + "\n-----------              ------------"  
               + "\n Name                    " + MountKabru.getCurrentGame().getHero().getHeroName()
               + "\n  "
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
       
       
       FileOutputStream fops = new FileOutputStream(filePath);
                ObjectOutputStream output = new ObjectOutputStream(fops);

                output.writeObject(heroReport); //write game to object File
            
    }

    private void lickIt() {
       this.console.println("*** You started licking only to find out it was a sticky envelope ***");
    }
    
}
