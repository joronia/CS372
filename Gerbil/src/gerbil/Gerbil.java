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
public class Gerbil {
    private static int gerbilCounter;    
    private int gerbilNumber = ++gerbilCounter;
    public Gerbil(int i) {
        gerbilNumber = i;
    }

    public String toString() {
        return "Gerbil " + gerbilNumber;
    }
    public void hop() {
        System.out.println(toString() + " is hopping");
    }
}
