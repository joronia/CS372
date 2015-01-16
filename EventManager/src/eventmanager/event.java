/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;

import java.util.ArrayList;

/**
 *
 * @author joronia17
 */
public class event {

    private String _name, _location, _month, _date, _year;
    public ArrayList<String> values = new ArrayList();

    public event() {

    }

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

    public ArrayList<String> getValues() {

        return values;
    }

    public void setValues(ArrayList<String> v) {
        values = v;
        _name = v.get(0);
        _location = v.get(1);
        _month = v.get(2);
        _date = v.get(3);
        _year = v.get(4);
    }

    public String setname(String name) {
        _name = name;
        if (values.size() > 0 && !values.get(0).equals(name) && values.size() < 6) {
            values.set(0, name);
        }

        return name;
    }

    public String setlocation(String location) {
        _location = location;
        if (values.size() > 1 && !values.get(1).equals(location) && values.size() < 6) {
            values.set(1, location);
        }
        return location;
    }

    public String setmonth(String month) {
        _month = month;
        if (values.size() > 2 && !values.get(2).equals(month) && values.size() < 6) {
            values.set(2, month);
        }
        return month;
    }

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

    public String setyear(String year) {
        _year = year;
        if (values.size() > 4 && !values.get(4).equals(year) && values.size() < 6) {
            values.set(4, year);
        }
        return year;
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

    public String getdate() throws IllegalArgumentException {
        return _date;
    }

    public String getyear() {
        return _year;
    }

    public String toString() {
        return "Event: " + _name + "|" + _location + "|" + _month + "|" + _date + "|" + _year;
    }
}
