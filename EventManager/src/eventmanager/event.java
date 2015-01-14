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
public class event {
    String _name, _location, _month,_date,_year;
    
  public event(String name, String location,String month,String date,String year) {
       setname(name);
       setlocation(location);
       setmonth(month);
       setdate(date);
       setyear(year);
   }
   
   public void setname(String name) {
       _name = name;
   }
   
   public void setlocation(String location) {
       _location = location;
   }
   
   public void setmonth(String month) {
       _month = month;
   }
   
   public void setdate(String date) {
       _date = date;
   }
   
   public void setyear(String year) {
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
}
