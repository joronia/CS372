/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemain;

import java.util.*;

/**
 *Class for the shape eclipse that extends to class Shape.
 * @author Jose
 */
public class Ellipse extends Shape {
// initializes the variables
    int _r1, _r2;
/**
 * Method checks to see if the parameters are less than 0 if they are then the constructor throws a
 * exception if not it assigns the parameters to the constructor.
 * @param r1
 * @param r2
 * @throws IllegalArgumentException 
 */
    public Ellipse(int r1, int r2) throws IllegalArgumentException {
        if (r1 <= 0 || r2 <= 0) {

            throw new IllegalArgumentException("Needs to be bigger than 0!");
        }
        _r1 = r1;
        _r2 = r2;
    }
/**
 * Method to calculate the area of an eclipse. overrides the getarea() method from
 * class Shape.
 * @return area
 */
    @Override
    public double getarea() {

        return Math.PI * _r1 * _r2;
    }
/**
 * Method to calculate the perimeter of an eclipse.
 * @return perimeter
 */
    @Override
    public double getperimeter() {
        return 2 * Math.PI * Math.sqrt((_r1 * _r1 + _r2 * _r2) / 2);
    }
}
