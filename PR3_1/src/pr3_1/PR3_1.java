/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

/**
 *
 * @author joronia17
 */
public class PR3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        userinput n = new userinput();
      try {  n.askuser(); 
     double d   = n.min();
     System.out.println("The minimum for you're numbers is: " + d);
     double a  = n.max();
     System.out.println("The maxinum for you're number is: " + a);
     double b = n.average();
     System.out.println("The average for you're numbers is: " + b);
    }
    
    
    catch (Exception ex) {
          System.out.printf("Has to be a interger!",
          ex.getMessage());
      }

}
}
