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
public class Shapemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Rectangle j = new Rectangle(4, 7);
            double arear = j.getarea();
            double perr = j.getperimeter();
            System.out.println("The area of Rectangle is " + arear + ". The perimeter of Rectangle is " + perr);
            Ellipse h = new Ellipse(2, 4);
            double ellipsea = h.getarea();
            double ellipsep = h.getperimeter();
            System.out.println("The area of Ellipse is " + ellipsea + ". The perimeter of Ellipse is " + ellipsep);
            Triangle u = new Triangle(5, 8, 12);
            double trianglea = u.getarea();
            double trianglep = u.getperimeter();
            System.out.println("The area of Triangle is " + trianglea + ". The perimeter of Triangle is " + trianglep);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }

    }

}
