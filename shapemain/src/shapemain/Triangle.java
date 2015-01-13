/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemain;

import java.util.*;

/**
 *Class Triangle that extends to shape.
 * @author Jose
 */
public class Triangle extends Shape {
// Intialize variables
    int _s1, _s2, _s3;
/**
 * Method first checks to see if parameters are greater than 0 and that they satisfy the rule of triangles
 * from the three sides. If they don't follow it then the complier will bring back an exception. Then sets the 
 * parameters to the constructor.
 * @param s1
 * @param s2
 * @param s3
 * @throws IllegalArgumentException 
 */
    public Triangle(int s1, int s2, int s3) throws IllegalArgumentException {
        if (s1 <= 0 || s2 <= 0 || s3 <= 0 || s1 + s2 <= s3 || s2 + s3 <= s1 || s1 + s3 <= s2) {

            throw new IllegalArgumentException("Either you have less than 0 on your sides or you have illegal side lengths.");
        }
        _s1 = s1;
        _s2 = s2;
        _s3 = s3;
    }
/**
 * Get the perimeter for the shape Triangle.
 * @return perimeter
 */
    @Override
    public double getperimeter() {
        return _s1 + _s2 + _s3;
    }
/**
 * Method to calculate the area of a Triangle.
 * @return area
 */
    @Override
    public double getarea() {
        double p = getperimeter();
        return Math.sqrt(p * (p - _s1) * (p - _s2) * (p - _s3));
    }

}
