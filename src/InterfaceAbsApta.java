/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package src;

/**
 *
 * @author aptar
 */

public class InterfaceAbsApta {

    public static void main(String[] args) {
        Account acc1 = new Account("Lendy Elhadi", "12345", 1000);
//        System.out.println(acc1.getBankName());
        acc1.deposit(1000);
        acc1.deposit(1000);
        acc1.print();
        
        CreditAcc acc2 = new CreditAcc("Norman Normandy", "54545", 1000);
//        System.out.println(acc1.getBankName());
        acc2.print();
        
//        polymorphism with instanceof
        System.out.println("\n\n");
        AbsBankAcc[] listAll = new AbsBankAcc[5];
        listAll[0] = acc1;
        listAll[1] = acc2;
        listAll[2] = acc1;
        listAll[3] = acc2;
        listAll[4] = acc1;
        
        for(AbsBankAcc acc : listAll)
            if(acc instanceof Account)
                System.out.println("akun tabungan");
            else
                System.out.println("akun kredit");
    }
}
