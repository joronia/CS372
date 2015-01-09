package guipi;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
/**
 * This is the class to set up every method that is going to run in the GUI PI.

 *

 * @author Jose
 */
public class guiPiclass {

    public double usernumber;
    public final double pi = 4.0;
    //public double term = 0;


    /**
     * Set c to equal to usernumber from method of setnum().
     *
     * @param c
     */
    public guiPiclass(double c) {
        setnum(c);
    }

    /**
     * Method to return the number the user entered in the program.
     *
     * @return usernumber
     */
    public double getpi() {
        return usernumber;
    }

    /**
     * Same as the other code set c to equal to usernumber.
     *
     * @param c
     */
    public void setnum(double c) {
        usernumber = c;
    }

    /**
     * Main method to show the answer for the infinite series. Starts with f= 1
     * then initializes term to zero. Goes through the loop till the last term
     * of usernumber. uses the calculation to return term.
     *
     * @param usernumber
     * @return

    
/**
 *  Set c to equal to usernumber from method of setnum().
 * @param c 
 */
    public guiPiclass(double c) {
        setnum(c);
    }
/**
 * Method to return the number the user entered in the program.
 * @return usernumber
 */
    public double getpi() {
        return usernumber;
    }
/**
 * Same as the other code set c to equal to usernumber.
 * @param c 
 */
    public void setnum(double c) {
        usernumber = c;
    }
/**
 * Main method to show the answer for the infinite series. Starts with f= 1 then
 * initializes term to zero. Goes through the loop till the last term of usernumber.
 * uses the calculation to return term.
 * @param usernumber
 * @return 
 */

    public double showpi(double usernumber) {
        int f = 1;
        double term = 0;
        for (int i = 1; i < usernumber; i += 2) {
            term += f * (pi / (i));
            f = f * -1;

        }

        return term;

    }

}
