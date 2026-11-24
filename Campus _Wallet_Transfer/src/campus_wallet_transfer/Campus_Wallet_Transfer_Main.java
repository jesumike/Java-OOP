/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campus_wallet_transfer;

/**
 *
 * @author PANAL_CPE113
 */
public class Campus_Wallet_Transfer_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Campus_Wallet_Transfer aly = new Campus_Wallet_Transfer("Aly", 100);
        Campus_Wallet_Transfer ben = new Campus_Wallet_Transfer("Ben");
        System.out.println( "Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        
        System.out.println( aly.transferTo(ben, 35)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( aly.transferTo(ben, 70)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( aly.transferTo(aly, 10)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( ben.deposit(15)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( aly.transferTo(ben, 65)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( ben.transferTo(aly, 0)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( ben.transferTo(null, 10)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
    }
}
    
    


