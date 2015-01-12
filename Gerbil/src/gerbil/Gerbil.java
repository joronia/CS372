/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerbil;

/**
 *
 * @author Jose
 */

/**
 * Class to add all methods for a Gerbil object.
 */
public class Gerbil {
    //PT - since you use ++gerbilCounter later, you should probably initialize this here.
    private static int gerbilCounter;
    private int gerbilNumber = ++gerbilCounter;

    /**
     * This is the constructor for class Gerbil.
     *
     * @param i
     */

    public Gerbil(int i) {
        gerbilNumber = i;
    }



    /**
     * Method for hop to just output the method toString() + is hopping.
     */

    public String toString() {
        return "Gerbil " + gerbilNumber;
    }

    public void hop() {
        System.out.println(toString() + " is hopping");
    }
}
