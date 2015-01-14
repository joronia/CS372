/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eventmanager;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
/**
 *
 * @author joronia17
 */
public class eventcalander {
    ArrayList <String> Events = new ArrayList();
    String _name, _location, _month,_date,_year;
   public eventcalander(String name, String location,String month,String date,String year) {
       _name = name;
       _location = location;
       _month = month;
       _date = date;
       _year = year;
   }
   
   public String getname() {
       return _name;
   }
   
   public String getlocation() {
       return _location;
   }
   
   public String getmonth() {
       return _month;
   }
   
   public String getdate() {
       return _date;
   }
   
   public String getyear() {
       return _year;
   }
   
   public ArrayList <String> addevents() {
       Events.add(_name);
       Events.add(_location);
       Events.add(_month);
       Events.add(_date);
       Events.add(_year);
       
       return Events;
   }
   
   public void addtofile() {
       try {
       File f = new File("Events.txt");
       BufferedWriter wrtr = new BufferedWriter(new FileWriter(f,true));
      
       for (int i = 0; i < Events.size(); i++) {
           wrtr.write(Events.get(i));
           wrtr.newLine();
       }
       wrtr.newLine();
       wrtr.close();
       }
       catch (Exception ex) {
               System.out.println("Looks like we are having some issues here!");
               }
   }
    
}

