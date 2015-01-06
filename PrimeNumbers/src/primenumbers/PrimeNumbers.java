/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

/**
 * Any properties or behaviors that belong to the PrimeNumber class.
 * @author Jose
 */
public class PrimeNumbers {

    /** Main program that runs when debugging. Initialize for loop to start
     * object num as a boolean to true. Then have a nested for loop to check the
     * number from i with j to check if it really is not divisible by other
     * numbers accept itself and 1. If it is not it then converts the boolean to
     * false and then breaks, but if the number is divisible it prints the
     * number from the first for loop.
     * <p>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
			boolean num = true;
			for (int j = 2; j < i; j++) {
				int rest = i % j;
				if (rest == 0) {
					num = false;
					break;
				}
			}
			if (num) {
				System.out.println(i);
			}
		}

	}
    }
    

