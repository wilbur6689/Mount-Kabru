/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.GameControl;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author wibur
 */
public class LoadGameView extends View {

    public LoadGameView() {
        super("What is the name of the game you wish to load?");
    }

    @Override
    public boolean doAction(String value) {

        //get list of names of all the files in a folder
        
//        ArrayList<String> results = new ArrayList<String>();
//
//        File[] files = new File("/path/to/the/directory").listFiles();
//        //If this pathname does not denote a directory, then listFiles() returns null. 
//
//        for (File file : files) {
//            if (file.isFile()) {
//                results.add(file.getName());
//            }
//        }

        String filePath = this.getInput();
        
        try {
            //load a save game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
            return false;
        }
        
        this.console.println("You have successfuly loaded your game called: " + filePath);
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        return true;
    }

}
