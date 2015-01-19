


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class for every property and behavior for a restaurant.
 * @author Jose
 */
public class restaurant {
    // initialize variables
    String _name, _address, _notes;
    int _rating;
/**
 * Constructor for the class Restaurant.
 * @param name
 * @param address
 * @param notes
 * @param rating 
 */
    public restaurant(String name, String address, String notes, int rating) {
    _name = name;
    _address = address;
    _notes = notes;
    _rating = rating;
}
    /**
     * All these methods are to return the name,address,notes,and rating to see the actual string.
     * @return 
     */
    public String getname() { return _name; }
    public String getaddress() { return _address; }
    public String getnotes() { return _notes; }
    public int getrating() { return _rating; }
    
    /**
     * To see the actual information for every restaurant object created.
     * @return 
     */
    public String toString() {
        return "Name:" + _name + " Address:" + _address + " Notes:" + _notes + " Rating:" + _rating;
    }
}
