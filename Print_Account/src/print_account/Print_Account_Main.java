/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package print_account;



/**
 *
 * @author PANAL_CPE113
 */
public class Print_Account_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);
        System.out.println("Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());
        System.out.println(mia.printPages(4) + "; Mia: " + mia.getCredits());
        System.out.println(mia.printPages(7) + "; Mia: " + mia.getCredits());
        System.out.println(mia.addCredits(-3) + "; Mia: " + mia.getCredits());
        System.out.println(mia.addCredits(4) + "; Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());
    }
    
}

    /*AI-USE NOTE:
    * Q1: Prompt used: "how do i make it identify positive", 
    * "as a beginner in java code how do i display the expected output, do it by hint by hint"   
    * Q2: Accepted and Rejected:
    * Accepted: joining Mia and Luis together in code instead of writing separately.
    * Rejected: some formatting and grammar.
    * Q3: How I checked it I ran the file and check if the output matches the given expected output.
    */