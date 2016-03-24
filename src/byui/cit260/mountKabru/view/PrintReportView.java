/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

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
                System.out.println("\n*** Invalid selection *** Try again");


        }
        return false;
    }

    private void monsterReport() {
        System.out.println("*** You Called the monster report function ***");
    }

    private void heroReport() {
       System.out.println("*** You Called the hero report function ***");
    }

    private void lickIt() {
       System.out.println("*** You started licking only to find out it was a sticky envelope ***");
    }
    
}
