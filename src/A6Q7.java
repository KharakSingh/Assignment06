/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class A6Q7 {
// create function method, store integer in varible 'number'
   public static void firstDigit(int number){
     // convert integer to string
        String num = Integer.toString(number);
     // check if number is negative 
        if (num.startsWith("-")) {
     // start string 'finalnum' at 1 to skip the negative symbol   
        String finalnum = (num.substring( 1, 2));
     // output final number 
        System.out.println(finalnum);
        }else {
     // create new string that stores 
        String finalnum = (num.substring( 0,1));
     // output the first number
        System.out.println(finalnum);
        
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // send number to varible
           firstDigit(-524);
    }
}
