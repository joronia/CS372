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
    ArrayList <event> Events = new ArrayList();
    
   
   public void addevents() {
//       Events.add(_name);
//       Events.add(_location);
//       Events.add(_month);
//       Events.add(_date);
//       Events.add(_year);
       
       Events.add(new event("0","0","0","0","0"));
      
   }
   
   public void addtofile() {
       try {
       File f = new File("C:\\Users\\joronia17\\Documents\\GitHub\\CS372\\EventManager\\Events.txt");
       BufferedWriter wrtr = new BufferedWriter(new FileWriter(f,true));
      
       for (int i = 0; i < Events.size(); i++) {
           wrtr.write(Events.get(i).getname());
           wrtr.write(Events.get(i).getlocation());
           wrtr.write(Events.get(i).getmonth());
           wrtr.write(Events.get(i).getdate());
           wrtr.write(Events.get(i).getyear());
           wrtr.newLine();
       }
       wrtr.newLine();
       wrtr.close();
       }
       catch (Exception ex) {
               System.out.println("Looks like we are having some issues here!");
               }
   }
    
   public void readfromfile() {
    try {
    File F = new File("Events.txt");
    BufferedReader rdr = new BufferedReader(new FileReader(F));
    String line;
    while ((line = rdr.readLine()) != null) {
        System.out.print(line);
        rdr.close();
    }
}
    catch (Exception ex) {
        System.out.println("Something did not go right!");
    }
    
   }
}

  
