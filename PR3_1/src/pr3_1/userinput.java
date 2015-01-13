package pr3_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 * Class to add methods to add input from user into ArrayList. Use the ArrayList
 * to calculate the minimum, maximum, and average.
 *
 * @author joronia17
 */
public class userinput {

    Scanner user = new Scanner(System.in);
    ArrayList<Integer> human = new ArrayList();

    /**
     * Method to do a for loop to insert 10 input numbers from user to the human
     * ArrayList.
     */
    public void askuser() {
        for (int i = 0; i < 10; i++) {

            System.out.print("Enter 10 Interger numbers!");
            Integer numbers = user.nextInt();
            human.add(numbers);
        }

    }

    /**
     * Method to calculate minimum. Goes through the loop and find the minimum
     * number from the ArrayList.
     *
     * @return d
     */
    public Integer min() {
        Integer d = Integer.MAX_VALUE;
        for (int i = 0; i < human.size(); i++) {
            d = Math.min(d, human.get(i));
        }
        //System.out.println(d);

        return d;
    }

    /**
     * Method to calculate the Maximum value that the human ArrayList includes.
     *
     * @return de
     */
    public Integer max() {
        Integer de = Integer.MIN_VALUE;
        for (int i = 0; i < human.size(); i++) {
            de = Math.max(de, human.get(i));
        }
        //System.out.print(de);

        return de;
    }

    /**
     * Method to calculate average from ArrayList. Sets the variable to 0. Then
     * goes to the loop to get each number and adds it to average. Finally it
     * takes average and divides it by the human ArrayList.
     *
     * @return average
     */
    public Double average() {
        double average = 0;
        for (int i = 0; i < human.size(); i++) {
            average += human.get(i);

        }
        average = average / human.size();
        return average;
    }

}
