/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import View.StartProgramView;
import model.*;

/**
 *
 * @author wibur
 */
public class MountKabru {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
            
          
        
    }    

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MountKabru.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MountKabru.player = player;
    }
}