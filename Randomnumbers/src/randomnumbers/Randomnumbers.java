/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

/**
 *Class that contains all properties and behaviors that random numbers contains.
 * @author Jose
 */
import java.util.*;
public class Randomnumbers {

    /**Main program area. Initialized for loop to do the test 25 times. I set
     * a Random generator to give me a random number to assign to x and y.
     * Conditions so I can check to see if x is less than y, x is greater than
     * y, and if x is equal to y.
     * <p>
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < 25; i++){
            //PT: should create this outside of the loop (so it's only done once) -1
             Random num = new Random();
       int x = num.nextInt(200);
       //PT: And you only need one Random object. -4
       Random num1 = new Random();
       int y = num1.nextInt(200);
       if (x > y) {
           System.out.println("x > b");
       }
       else if (x < y) {
            System.out.println("x < b");
       }
       else
           System.out.println("x = b");
       
        }
    }
    
}
