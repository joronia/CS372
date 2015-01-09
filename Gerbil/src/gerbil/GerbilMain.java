/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerbil;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class GerbilMain {

    /**
     * Main program. Create a vector to add all gerbil objects. Then use a
     * Iterator to output all the Gerbil instead of a for loop.
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Gerbil> Gerbil2 = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            Gerbil2.add(new Gerbil(i));
            //((Gerbil)Gerbil2.get(i)).hop();
        }
        Iterator it = Gerbil2.iterator();
        while (it.hasNext()) {
            ((Gerbil) it.next()).hop();
        }

    }
}
