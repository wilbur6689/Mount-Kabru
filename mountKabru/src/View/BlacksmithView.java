/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Phill
 */
public class BlacksmithView extends View {
    
    
    
    public BlacksmithView() {
           super( "\n"
                + "\n--------------------------------------"
                + "\n|  You straggle into the blacksmith  |"
                + "\n|  hoping to make a deal...          |"
                + "\n--------------------------------------"
                + "\nB - [B]uy weapons and Armor"
                + "\nS - [S]ell weapongs and armor"
                + "\nQ - [Q]uit"
                + "\n--------------------------------------");
    }
    
    
    
    private String promptMessage;
    
    @Override
    private boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "B": // Buy weapons and armor from the blacksmith
                this.buyFromBlacksmith();
                break;
            case "S": // Sell your weapons or armor to the blacksmith
                this.sellToBlacksmith();
                break;
                        
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                
                         
        }
        return false;
    }

    private void buyFromBlacksmith() {
        System.out.println("\n***   Sorry, I am just now stocking my shelves    ***"
                         + "\n***   with all the best weapons and armor I can   ***"
                         + "\n***   find. please come back later.               ***");
    }

    private void sellToBlacksmith() {
        System.out.println("\n***   Sorry, I would love to look at what you     ***"
                         + "\n***   you got but I am too busy stocking my       ***"
                         + "\n***   shelves, please come back later.            ***");
    }
}
