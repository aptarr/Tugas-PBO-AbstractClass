/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author aptar
 */
public class CreditAcc extends AbsBankAcc {
    private static int creditLimit;
    private String BANK;
    
    public CreditAcc(String name, String num, int amt){
        super(name, num, amt);
        this.creditLimit = 100;
    }
    
    public void print(){
        System.out.println("Bank Name: " + this.getBankName()
                            + "\nAccount Name: " + this.accountName
                            + "\nAccount Number: " + this. accountNum
                            + "\nBalance: " + this.balance
                            + "\nCredit Limit: " + this.creditLimit);
    }
    
    @Override
    public void deposit(int amt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getBankName() {
        return BANK = "JavaBank Indonesia";
    }
}
