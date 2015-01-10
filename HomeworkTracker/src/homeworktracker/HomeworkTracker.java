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
/**
 * A class object to add all methods that go with the object HomeworkTracker
 *
 * @author joronia17
 */
public class HomeworkTracker {

    ArrayList<Double> scores = new ArrayList();

    /**
     * empty constructor to initialize object
     */
    public HomeworkTracker() {

    }

    /**
     * return whats in each ArrayList.
     *
     * @param i
     * @return scores.get(i);
     */
    public double getgrade(int i) {
        return scores.get(i);
    }

    /**
     * Return each grade.
     *
     * @return scores
     */
    public ArrayList<Double> getscores() {
        return scores;
    }
    //public void addscore(double s) {scores.add(s); }

    /**
     * Add all the grades into ArrayList scores to use.
     *
     * @param grade
     */
    public void gradelist(double grade) {
        scores.add(grade);
    }

    /**
     * Method to calculate the minimum score of all grades being entered to the
     * list.
     *
     * @return min
     */
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

    /**
     * Method to calculate the max number out of all grades.
     *
     * @return max
     */
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

    /**
     * Method to calculate the average scores from all student grades.
     *
     * @return average
     */
    public double average() {
        double average = 0;
        for (int i = 0; i < scores.size(); i++) {
            average += scores.get(i);
            //average = average / scores.size();
        }
        average = average / scores.size();
        return average;
    }

}
