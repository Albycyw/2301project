/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package authentication;

/**
 *
 * @author xliu01
 */
public class AuthenticationException extends Exception {

    /**
     * Creates a new instance of <code>AuthenticationException</code> without detail message.
     */
    public AuthenticationException() {
    }


    /**
     * Constructs an instance of <code>AuthenticationException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public AuthenticationException(String msg) {
        super(msg);
    }
}
