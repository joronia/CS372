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
public class CalcPI {
    private final double pi = 4.0;
    private double term = 0;
    
    public void calculatepi(int n) {
        int f = 1;
        for (int i = 1; i < n; i+=2) {
            term += f * (pi/(i));
            f = f * -1;
            
        }
        System.out.print("The infinite series of the " + n + " term is " + term);
    }
}
