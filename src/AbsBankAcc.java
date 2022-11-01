/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author aptar
 */

abstract class AbsBankAcc {
    
    public final String BANK = "JavaBank Indonesia";
    
    protected String accountName;
    protected String accountNum;
    protected int balance;
    
    public AbsBankAcc(String name, String num, int balance){
        this.accountName = name;
        this.accountNum = num;
        this.balance = balance;
    }

    abstract public void deposit(int amt);
    abstract public int getBalance();
    abstract public String getBankName();
    
    public void withdraw(int amt){}
    public void setAccountName(String name){
        this.accountName = name;
    }
}
