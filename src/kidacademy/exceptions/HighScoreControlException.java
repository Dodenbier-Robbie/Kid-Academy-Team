/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.exceptions;

/**
 *
 * @author rdodenbier
 */
public class HighScoreControlException extends Exception {

    public HighScoreControlException() {
    }

    public HighScoreControlException(String message) {
        super(message);
    }

    public HighScoreControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public HighScoreControlException(Throwable cause) {
        super(cause);
    }

    public HighScoreControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
