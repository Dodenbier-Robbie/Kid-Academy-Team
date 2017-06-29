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
public class AnswerControlException extends Exception {

    public AnswerControlException() {
    }

    public AnswerControlException(String message) {
        super(message);
    }

    public AnswerControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnswerControlException(Throwable cause) {
        super(cause);
    }

    public AnswerControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
