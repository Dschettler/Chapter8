/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class BankAccount {

    private double balance;
    private String name;

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void PrintDetails() {
        System.out.println(this.name + ": $" + String.format("%,.2f", this.balance));
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
