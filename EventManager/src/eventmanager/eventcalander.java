/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 * Class to to do all writing to file and etc. 
 * @author joronia17
 */
public class eventcalander {

    ArrayList<event> Events = new ArrayList();
    String f = "Events.txt";
/**
 * return the size of array event
 * @return 
 */
    public int getSize() {
        return Events.size();
    }
/**
 * Get the element at certain index.
 * @param i
 * @return 
 */
    public event getElement(int i) {
        return Events.get(i);
    }
    /**
     * Return the vector of Events.
     * @return 
     */
    public ArrayList<event> getEvents(){
        return Events;
    }
/**
 * Add all event properties into vector of event.
 * @param c 
 */
    public void addevents(event c) {
//       Events.add(_name);
//       Events.add(_location);
//       Events.add(_month);
//       Events.add(_date);
//       Events.add(_year);

        Events.add(c);

    }
    /**
     * Function to tell the compiler that I want to sort properties of the array events that is from event.
     */
public void locationsort() {
    Events.sort(event.LocationCompartor);
} 
/**
 * Same as above accept its for date.
 */
public void datesort() {
    Events.sort(event.DateComparator);
}
/**
 * Same as above but for the name
 */
public void namesort() {
    Events.sort(event.NameComparator);
}
/**
 * Method to write to file all the properties when I click submit.
 */
    public void addtofile() {
        try {
            //File f = new File("C:\\Users\\joronia17\\Documents\\GitHub\\CS372\\EventManager\\Events.txt");
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true));
            ArrayList<String> values = Events.get(Events.size() - 1).getValues();
            for (int i = 0; i < values.size(); i++) {
                wrtr.write(values.get(i));
                wrtr.newLine();
            }

            wrtr.close();
        } catch (Exception ex) {
            System.out.println("Looks like we are having some issues here!");
        }
    }
/**
 * Reads from file and returns ArrayList.
 * @return Events
 */
    public ArrayList<event> readfromfile() {
        try {
            File F = new File("Events.txt");
            BufferedReader rdr = new BufferedReader(new FileReader(F));
            String line;
            while ((line = rdr.readLine()) != null) {
                System.out.println(line);

            }
            rdr.close();
        } catch (Exception ex) {
            System.out.println("Something did not go right!");
        }
        return Events;
    }
    /**
     * A To String method. When I call it in the GUI.
     * @param e
     * @return 
     */
    public String toString(event e){
        String line="";
        for(String s1:e.getValues()){
            line=line+s1;
        }
        return line;
    }
}
