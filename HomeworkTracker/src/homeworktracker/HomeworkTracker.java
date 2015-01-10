/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktracker;

import java.util.*;

/**
 *
 * @author Jose
 */
public class HomeworkTracker {

    ArrayList<Double> scores = new ArrayList();

    public HomeworkTracker(double c) {
        scores.add(c);
    }

    public double getgrade(int i) {
        return scores.get(i);
    }
    
    public ArrayList<Double> getscores() { return scores; }
    //public void addscore(double s) {scores.add(s); }


public void gradelist(double grade) {
        scores.add(grade);
    }

    public double min() {
        if (scores.size() == 0) {
            return -1;
        }
        double min = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            min = Math.min(min, scores.get(i));
        }
        return min;
    }

    public double max() {
        if (scores.size() == 0) {
            return -1;
        }
        double max = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
        max = Math.max(max, scores.get(i));
    }
        return max;
    }

    public double average() {
        double average = 0;
        for (int i = 0; i <= scores.size(); i++) {
            average += scores.get(i);
        }
        average = average / scores.size();
        return average;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
