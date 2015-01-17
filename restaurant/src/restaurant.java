/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public class restaurant {
    String _name, _address, _notes;
    int _rating;
    
    public restaurant(String name, String address, String notes, int rating) {
    _name = name;
    _address = address;
    _notes = notes;
    _rating = rating;
}
    public String getname() { return _name; }
    public String getaddress() { return _address; }
    public String getnotes() { return _notes; }
    public int getrating() { return _rating; }
    
    public String toString() {
        return _name + "," + _address + "," + _notes + "," + _rating;
    }
}
