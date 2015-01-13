/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemain;

/**
 *
 * @author Jose
 */
public class Rectangle extends Shape {

    int _width;
    int _height;

    public Rectangle(int width, int height) throws IllegalArgumentException {
        if (width <= 0 || height <= 0) {

            throw new IllegalArgumentException("Need to be greater than 0");

        }
        _width =  width;
        _height =  height;

    }

    @Override
    public double getarea() {
        return  _width * _height;
    }

    @Override
    public double getperimeter() {
        return (2 * _width) + (_height * 2);
    }

}
