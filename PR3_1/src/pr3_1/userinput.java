package pr3_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author joronia17
 */
public class userinput {

    Scanner user = new Scanner(System.in);
    ArrayList<Double> human = new ArrayList();

    public void askuser() {
        for (int i = 0; i < 10; i++) {

            System.out.print(i + "Enter 10 Interger numbers!");
            double numbers = user.nextDouble();
            human.add(numbers);
        }
        
    
    }
    
    public Double min() {
        Double d = Double.MAX_VALUE;
        for (int i = 0; i < human.size(); i++) {
            d = Math.min(d,human.get(i));
        }
        //System.out.println(d);
        
        return d;
    }
    
    public Double max() {
        Double de = Double.MIN_VALUE;
        for (int i = 0; i < human.size(); i++) {
        de = Math.max(de, human.get(i));
    }
        //System.out.print(de);
        
        return de;
    }
    
    public Double average() {
        double average = 0;
        for (int i = 0; i < human.size(); i++) {
            average += human.get(i);
            
        }
        average = average / human.size();
        return average;
    }

}
