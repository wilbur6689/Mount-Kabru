/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.Hero;
import byui.cit260.mountKabru.model.Player;
import byui.cit260.mountKabru.view.ErrorView;
import byui.cit260.mountKabru.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private static Hero hero = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        StartProgramView startProgramView = new StartProgramView();
        
        try {
            
        MountKabru.inFile = new BufferedReader(new InputStreamReader(System.in));
        MountKabru.outFile = new PrintWriter(System.out, true);         
        String filePath = "log.txt";
        MountKabru.logFile = new PrintWriter(filePath);
            
        startProgramView.display();
        } catch (Throwable te) {
            ErrorView.display("StartProgramView","Error reading the input: this is what it is: " + te.getMessage() );
            te.printStackTrace();
            startProgramView.display();
        }    
        finally {
            try {
                if (MountKabru.inFile != null);
                MountKabru.inFile.close();
                
                if (MountKabru.outFile != null);
                MountKabru.outFile.close();
                
                if (MountKabru.logFile != null);
                MountKabru.logFile.close();
            } catch (IOException ex) {
                Logger.getLogger(MountKabru.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }  
        
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
    
    public static Hero getHero() {
        return hero;
    }
    
    public static void setHero(Hero hero) {
        MountKabru.hero = hero;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MountKabru.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MountKabru.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MountKabru.logFile = logFile;
    }
    
    
}