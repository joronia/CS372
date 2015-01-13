/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemain;

/**
 *Class for the shape rectangle that extends to class shape
 * @author Jose
 */
public class Rectangle extends Shape {
// Initialize variables
    int _width;
    int _height;
/**
 * First the method checks to see if the parameters are less than zero and if its true it
 * throws the exception and if its not true it assigns the parameters to the variables. This is the
 * constructor.
 * @param width
 * @param height
 * @throws IllegalArgumentException 
 */
    public Rectangle(int width, int height) throws IllegalArgumentException {
        if (width <= 0 || height <= 0) {

            throw new IllegalArgumentException("Need to be greater than 0");

        }
        _width =  width;
        _height =  height;

    }
/**
 * Method to return the area and overrides the method from shapes.
 * @return area
 */
    @Override
    public double getarea() {
        return  _width * _height;
    }
/**
 * Method to return the area and overrides the method from shapes.
 * @return perimeter
 */
    @Override
    public double getperimeter() {
        return (2 * _width) + (_height * 2);
    }

}
