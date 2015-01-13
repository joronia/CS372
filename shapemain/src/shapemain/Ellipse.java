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
public class Ellipse extends Shape {

    int _r1, _r2;

    public Ellipse(int r1, int r2) throws IllegalArgumentException {
        if (r1 <= 0 || r2 <= 0) {

            throw new IllegalArgumentException("Needs to be bigger than 0!");
        }
        _r1 = r1;
        _r2 = r2;
    }

    @Override
    public double getarea() {

        return Math.PI * _r1 * _r2;
    }

    @Override
    public double getperimeter() {
        return 2 * Math.PI * Math.sqrt((_r1 * _r1 + _r2 * _r2) / 2);
    }
}
