/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.exceptions;

/**
 *
 * @author wibur
 */
public class ActorControlException extends Exception {

    public ActorControlException() {
    }

    public ActorControlException(String string) {
        super(string);
    }

    public ActorControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ActorControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ActorControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
    
}
