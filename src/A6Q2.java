
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class A6Q2 {

    public static void grade(int mark) {
        if (mark < 50) {
         // make the system understand that 60 is more than 50 
            System.out.println("You get a F ");
        // if the grade is 60 and below tell the system to give them a mork of F
        } else if (50 <= mark && mark < 60) {
            System.out.println("You have recived the mark of D ");
        }else if (60 <= mark && mark < 70){
            System.out.println("You Have recived the mark of C ");
        // if the mark is below 70 eneter in a code and eneter in a mark of C
        }else if (70 <=mark && mark < 80){
            System.out.println("You have recived the mark of B ");
        }else if (80 <=mark && mark < 90){
            System.out.println("You have recived the mark of A "); 
        }
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner input = new Scanner (System.in);
    // enter the grade percentage  
    System.out.println("Enter in you grade ");  
    
    
    
    
   }
}
