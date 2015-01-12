package calculatingpi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joronia17
 */
/**
 * Class that contains all methods for object CalcPI. 
 * @author joronia17
 */
public class CalcPI {
    private final double pi = 4.0;
    private double term = 0;
    /**
     * For loop to calculate infinite series. Prints out the exact number for that number.
     * @param n 
     */
    public void calculatepi(int n) {
        int f = 1;
        for (int i = 1; i < n; i+=2) {
            term += f * (pi/(i));
            f = f * -1;
            
        }
        
        //PT -- this function should probably return term, and the output
        //      should happen in main. -2
        System.out.print("The infinite series of the " + n + " term is " + term);
    }
}
