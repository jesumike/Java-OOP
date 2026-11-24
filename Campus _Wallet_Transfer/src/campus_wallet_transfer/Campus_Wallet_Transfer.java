/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus_wallet_transfer;

/**
 *
 * @author PANAL_CPE113
 */
public class Campus_Wallet_Transfer {
    private String owner;
    private int balance;


    public Campus_Wallet_Transfer(String owner, int balance) {
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    public Campus_Wallet_Transfer(String owner) {
        this(owner, 0);
    }
    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }
    public boolean transferTo(Campus_Wallet_Transfer recipient, int amount) {    
        if (recipient == null || recipient == this || amount <= 0 || this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        recipient.balance += amount;
        return true;
    }
    public int getBalance() {
        return this.balance;
    }
    public String getOwner() {
        return this.owner;
    }
}

