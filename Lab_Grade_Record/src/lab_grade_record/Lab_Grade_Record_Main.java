/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_grade_record;

/**
 *
 * @author PANAL_CPE113
 */
public class Lab_Grade_Record_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab_Grade_Record ana = new Lab_Grade_Record("Ana", 80, 90);
        System.out.println(ana.getStudentName() + ": " + ana.getFinalGrade() + "; "
                + (ana.isPassing() ? "passing" : "not passing"));

        Lab_Grade_Record ben = new Lab_Grade_Record("Ben", 101, 85);
        System.out.println(ben.getStudentName() + ": " + ben.getFinalGrade() + "; "
                + (ben.isPassing() ? "passing" : "not passing"));

        System.out.println( ana.updateScores(95, 101)
                + "; grade stays " + ana.getFinalGrade());

        System.out.println( ana.updateScores(74, 75)
                + "; " + ana.getFinalGrade() + "; "
                + (ana.isPassing() ? "passing" : "not passing"));

        System.out.println( ana.updateScores(75, 75)
                + "; " + ana.getFinalGrade() + "; "
                + (ana.isPassing() ? "passing" : "not passing"));

        System.out.println(ben.getStudentName() + ": " + ben.getFinalGrade() + "; "
                + (ben.isPassing() ? "passing" : "not passing"));
    }
}
    /* Q1: Why must you validate both new scores before assigning either one?
     *   If we assign a value before validating the second score it might turn out invalid, the original first score is already overwritten.
     * Validating both scores upfront, gurantees that both these scores remain completely unchanged.
    */


