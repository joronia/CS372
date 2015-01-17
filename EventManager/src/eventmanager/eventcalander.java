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
 *
 * @author joronia17
 */
public class eventcalander {

    ArrayList<event> Events = new ArrayList();
    String f = "Events.txt";

    public int getSize() {
        return Events.size();
    }

    public event getElement(int i) {
        return Events.get(i);
    }
    public ArrayList<event> getEvents(){
        return Events;
    }

    public void addevents(event c) {
//       Events.add(_name);
//       Events.add(_location);
//       Events.add(_month);
//       Events.add(_date);
//       Events.add(_year);

        Events.add(c);

    }
public void locationsort() {
    Events.sort(event.LocationCompartor);
} 
public void datesort() {
    Events.sort(event.DateComparator);
}
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
    
    public String toString(event e){
        String line="";
        for(String s1:e.getValues()){
            line=line+s1;
        }
        return line;
    }
}
