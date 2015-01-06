/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacircle;
import java.util.Scanner;
/**
 *Anything that is related to the Area of circle goes in here.
 * @author Jose
 */
public class Areacircle {

    /**
     * Main to run the program. I initialized object PI to be a constant
     * Then I called a Scanner to get input from user so they can enter circle
     * radius. Finally I printed out the answer to the area of a circle.
     * <p>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final double PI = 3.14;
       System.out.println("What is the radius of the circle?");
       Scanner radius = new Scanner(System.in);
       double user = radius.nextDouble();
       System.out.println(PI * user * user);
       
    }
    
}
