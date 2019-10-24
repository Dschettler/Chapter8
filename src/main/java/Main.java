/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */

enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }


public class Main {
    public static void main(String[] args) {
        
        //String accountName = "a";
        
        //boolean isValid = Utilities.IsValidAccountName(accountName);
        
        Day myDay = Day.FRIDAY;

        if (myDay == Day.MONDAY) {
            // do something
        } else if (myDay == Day.FRIDAY) {
            // celebrate
        }
        
        switch (myDay) {
            case FRIDAY:
                //celebrate
                break;
            case SATURDAY:
                break;
        }
        
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
        
        if (myAccount.equals(myAccount2)) {
            System.out.println("Same!");
        }
        
        System.out.println(myAccount.toString("P"));
    }
}
