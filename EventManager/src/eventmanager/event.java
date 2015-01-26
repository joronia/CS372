/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Clasclass to set everything that is used for the event.
 * @author joronia17
 */
public class event {
// Initializing variables.
    private String _name, _location, _month, _date, _year;
    //PT -- I'm not sure why you need this array list. The menber variables store ths same data,
    // and using those will be more maintainable than the arraylist. -5
    public ArrayList<String> values = new ArrayList();
// An extra empty constructor.
    public event() {

    }
    /**
     * Method to set the name,location, month, date, and year.
     * @param name
     * @param location
     * @param month
     * @param date
     * @param year 
     */
// Used to read the text from GUI and and adding them into an arrayList that
 // has my texts from the functions.
    public event(String name, String location, String month, String date, String year) {
        //setname(name);
        values.add(setname(name));
        //setlocation(location);
        values.add(setlocation(location));
        //setmonth(month);
        values.add(setmonth(month));
        //setdate(date);
        values.add(setdate(date));
        //setyear(year);
        values.add(setyear(year));
    }
    /**
     * Method to return the arraylist of values. 
     * @return values
     */
// return the the whole array of values.
    public ArrayList<String> getValues() {

        return values;
    }
/**
 * Parameter is an array of strings. Whenever an array is passed it adds v to values and then gets the index
 * location for each property and assigns them to their proper variable.
 * @param v 
 */
    public void setValues(ArrayList<String> v) {
        values = v;
        _name = v.get(0);
        _location = v.get(1);
        _month = v.get(2);
        _date = v.get(3);
        _year = v.get(4);
    }
/**
 * Setting the name. Checks to see if the array is greater than zero and see's if the other conditions are
 * satisfied. If it is true then it gets the name and assigns it to index 0 of ArrayList.
 * @param name
 * @return 
 */
    public String setname(String name) {
        _name = name;
        if (values.size() > 0 && !values.get(0).equals(name) && values.size() < 6) {
            values.set(0, name);
        }

        return name;
    }
/**
 * Same as above its to set and tells the compiler that there can not be duplicate elements. 
 * @param location
 * @return location
 */
    public String setlocation(String location) {
        _location = location;
        if (values.size() > 1 && !values.get(1).equals(location) && values.size() < 6) {
            values.set(1, location);
        }
        return location;
    }
/**
 * Same as the first one.
 * @param month
 * @return month
 */
    public String setmonth(String month) {
        _month = month;
        if (values.size() > 2 && !values.get(2).equals(month) && values.size() < 6) {
            values.set(2, month);
        }
        return month;
    }
/**
 * Same as the first one but only difference is that it has a try which catches the user when they try to
 * add a string and not a integer. 
 * @param date
 * @return date
 */
    public String setdate(String date) {
        _date = date;
        if (values.size() > 3 && !values.get(3).equals(date) && values.size() < 6) {
            values.set(3, date);
        }
        if (!date.equals("")) {
            try {

                int d = Integer.parseInt(_date);
           } catch (Exception ex) {
                throw new IllegalArgumentException("Your date needs to be an int");
            }
        }

        return date;
    }
/**
 * Same as the first one. 
 * @param year
 * @return year
 */
    public String setyear(String year) {
        _year = year;
        if (values.size() > 4 && !values.get(4).equals(year) && values.size() < 6) {
            values.set(4, year);
        }
        return year;
    }
/**
 * Return a value
 * @return _name
 */
    public String getname() {
        return _name;
    }
/**
 * return a value
 * @return _location
 */
    public String getlocation() {
        return _location;
    }
/**
 * return a value.
 * @return _month
 */
    public String getmonth() {
        return _month;
    }
/**
 * Returns a value
 * @return _date
 * @throws IllegalArgumentException 
 */
    public String getdate() throws IllegalArgumentException {
        return _date;
    }
/**
 * returns the value of _year.
 * @return _year
 */
    public String getyear() {
        return _year;
    }
/**
 * overwrites the code to output something different like this toString Method. Shows in the list.
 * @return String
 */
    public String toString() {
        return "Event: " + _name + "|" + _location + "|" + _month + "|" + _date + "|" + _year;
    }
    /**
     * Comparator to sort the list by event object. Gets the location and compares it to the second and that is how
     * it gets sorted. I figured it out why I could not sort on my GUI. I needed to clear the array of event and read
     * the file again and then sort that new list and update the list that is shown.
     */
     public static Comparator<event> LocationCompartor = new Comparator<event>() {
            
        @Override
        public int compare(event e1, event e2) {
            int cmp = e1.getlocation().compareTo(e2.getlocation());
            return cmp;
            
            
        }
   };
     /**
      * Comparator to sort the list by event object. Gets the location and compares it to the second and that is how
     * it gets sorted. This is for Dates. 
      */
     public static Comparator<event> DateComparator = new Comparator<event>() {

        @Override
        public int compare(event b1, event b2) {
            int cmp1 = b1.getdate().compareTo(b2.getdate());
            return cmp1;
        }
         
     };
     /**
      * Comparator to sort the list by event object. Gets the location and compares it to the second and that is how
     * it gets sorted. This is for Name.
      */
     public static Comparator<event> NameComparator = new Comparator<event>() {

        @Override
        public int compare(event c1, event c2) {
            int cmp2 = c1.getname().compareTo(c2.getname());
            return cmp2;
        }
         
     };
}
