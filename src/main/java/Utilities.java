/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Utilities {
    public static boolean IsValidEmail(String email) {
        if (!email.contains("@"))
        {
            return false;
        }
        
        if (!email.contains(".")) {
            return false;
        }
        // other checks...
        
        return true;
    }
    
    public static boolean IsValidAccountName(String name) {
        if (name.length() > 3) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean IsNonNegativeBankAccount(BankAccount accountToCheck)
    {
        if (accountToCheck.getBalance() < 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
