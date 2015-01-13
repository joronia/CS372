/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemain;

import java.util.*;

/**
 *
 * @author Jose
 */
public class Triangle extends Shape {

    int _s1, _s2, _s3;

    public Triangle(int s1, int s2, int s3) throws IllegalArgumentException {
        if (s1 <= 0 || s2 <= 0 || s3 <= 0 || s1 + s2 <= s3 || s2 + s3 <= s1 || s1 + s3 <= s2) {

            throw new IllegalArgumentException("Either you have less than 0 on your sides or you have illegal side lengths.");
        }
        _s1 = s1;
        _s2 = s2;
        _s3 = s3;
    }

    @Override
    public double getperimeter() {
        return _s1 + _s2 + _s3;
    }

    @Override
    public double getarea() {
        double p = getperimeter();
        return Math.sqrt(p * (p - _s1) * (p - _s2) * (p - _s3));
    }

}
