/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accounts;

/**
 *
 * @author Mitch
 */
public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException(){}

    public CustomerNotFoundException(String msg)
    {
        super(msg);
    }
}
