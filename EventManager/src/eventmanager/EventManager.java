/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eventmanager;

/**
 *
 * @author joronia17
 */
public class EventManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        eventcalander j = new eventcalander("java", "whitworth", "January", "13", "2015");
        j.addevents();
        j.addtofile();
    }
    
}