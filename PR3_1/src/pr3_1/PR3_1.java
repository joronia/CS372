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
     * Main area to run program. Created a new object names n from class
     * userinput. Then used all my methods with my new object. Exception shows
     * when user enters something other than a integer.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        userinput n = new userinput();
        try {
            n.askuser();
            int d = n.min();
            System.out.println("The minimum for you're numbers are: " + d);
            int a = n.max();
            System.out.println("The maximum for you're numbers are: " + a);
            double b = n.average();
            System.out.println("The average for you're numbers are: " + b);
        } catch (Exception ex) {
            //PT -- Better to let the user retry entering an integer, rather than exiting the program. -3
            System.out.printf("Has to be a interger!",
                    ex.getMessage());
        }

    }
}
