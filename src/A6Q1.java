
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
   public class A6Q1 {

    public static double Circlearea(double radius){
    double ans = ((radius * radius) * Math.PI);   
 // return the loop        
        return ans;
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
    // enter the radius for the system
       System.out.println("Please enter the radius of the circle");
       int circleArea = input.nextInt();
       double ans = (circleArea);
    // enter the code and ask tell it the area of a circle
       System.out.println("the circles area is" + ans);
    
    
    
    
    
    
    
    
    }
}
