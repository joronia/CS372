/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argcommandline;

/**
 *
 * @author Jose
 */

public class Argcommandline {

    /** Main area to run program. A condition to check if the length of args
     * contains at least 3 Strings of arrays and then breaks if there is not 
     * three arrays. If you did not have the conditions it would print out null 
     * on all three args[]. 
     * <p>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(args.length < 3) {
System.out.println("Need 3 arguments");
System.exit(1);
        }
        
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
    
}
