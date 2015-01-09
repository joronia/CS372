/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataonly.problems2.pkg3.pkg2.pkg4;

/**
 *
 * @author joronia17
 */
public class DataOnlyProblems2324 {
int i;
float f;
boolean b;
    public static void main(String[] args) {
        //PT: Better to make a separate DataOnly class, then create that object here.
        //    You're combining two things (data and user interface) into one class,
        //    which gets away from the goal of high cohesion
        DataOnlyProblems2324 d = new DataOnlyProblems2324();  // TODO code application logic here
        d.i = 47;
        d.f = 1.1f;
        d.b = false;
        System.out.println(d.i);
        System.out.println(d.f);
        System.out.println(d.b);
        
    }
    
}
