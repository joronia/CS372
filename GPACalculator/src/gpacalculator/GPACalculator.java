/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

/**
 *
 * @author Jose
 */
public class GPACalculator {
public static Double calculategpa(int a,int aminus,int bplus,int b,int bminus,int cplus ,int c,int cminus,int dplus,int d,int dminus,int f) {
        Double Totalgrade = 0.00;
        int numberofclass;
        Double GPA = 0.0;

        numberofclass = a + aminus + bplus + b + bminus + cplus + c +  cminus + dplus + d + dminus + f;
        Double  aamount = a * 4.0;
        Double  Aminusamount = aminus * 3.7;
        Double  bplusamount =  bplus * 3.3;
        Double bminusamount = bminus * 2.7;
        Double cplusamount = cplus * 2.3;
        Double cminusamount = cminus * 1.7;
        Double dplusamount = dplus * 1.3;
        Double damount = d * 1.0;
        Double dminusamount = dminus * 0.7;
        Double famount = f * 0.0;

       Totalgrade = aamount + Aminusamount + bplusamount +bminusamount + cplusamount + cminusamount + dplusamount + damount + dminusamount +famount;

        GPA = Totalgrade/numberofclass;

        return GPA;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double newgpa    = calculategpa(4,0,2,0,0,0,0,0,0,0,0,0);
    System.out.print(newgpa);
    }
    
}
