/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {
    public static void main(String[] args) {
        
        //String accountName = "a";
        
        //boolean isValid = Utilities.IsValidAccountName(accountName);
        
        BankAccount myAccount = new BankAccount(100, "checking");
        BankAccount myAccount2 = new BankAccount(100, "checking");

        String myString = "test1";
        String myString2 = "test1";
        
       if (myString.equals(myString2)) {
           // should be true
       } 
        
        if (myAccount == myAccount2) {
            System.out.println("Same!");
        } else {
            System.out.println("Not Same!");
        }
        
        System.out.println(myAccount.toString("P"));
    }
}
