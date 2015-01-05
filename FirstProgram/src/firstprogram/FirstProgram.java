/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstprogram;

/**
 *
 * @author joronia17
 */
import java.util.Scanner;
public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Jose";
        //double score = 42.5;
       System.out.printf("Hello %s is your score:", name); // TODO code application logic here
       Scanner input = new Scanner(System.in);
       int score = input.nextInt();
       System.out.printf("Your Score is %d\n", score);
    }
    
}
