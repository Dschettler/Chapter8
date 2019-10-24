
import java.util.Objects;

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

    @Override
    public String toString() {
        return this.name + ": $" + String.format("%,.2f", this.balance);
    }

    public String toString(String formatter) {
        if (formatter == "P") {
            return this.name + " - " + this.balance;
        } else {
            return this.name + ": $" + String.format("%,.2f", this.balance);
        }

    }

    public boolean equals(BankAccount differentAccount) {
        if (this.name == differentAccount.getName()
                && this.balance == differentAccount.getBalance()) {
            return true;
        } else {
            return false;
        }
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

    public void setName(String name) throws Exception {
        if (Utilities.IsValidAccountName(name)) {
            this.name = name;
        } else {
            throw new Exception("Account name must be 3 or more characters");
        }
    }
}
