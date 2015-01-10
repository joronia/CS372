/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatingpi;

/**
 *
 * @author joronia17
 */
public class CalculatingPI {

    /** Main to use in command prompt
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i = Integer.parseInt(args[0]);
//        
//        System.out.println(i.toString()); 
        if (args.length > 0) {
            CalcPI human = new CalcPI(); 
        human.calculatepi(i);
        }
        
    }
    
}
