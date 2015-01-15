/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs372exam1;

/**
 * Class for main undercover player object
 *
 * @author joronia17
 */
public class underover {

    private int _money;
    private String _username;

    public underover(String username, int money) {
        // setting up constructor

        setusername(username);
        setmoney(money);
    }

    /**
     * Setting up the method to equal string.
     *
     * @param username
     */
    public void setusername(String username) {
        // setting up username
        _username = username;
    }

    /**
     * setting the amount of money needed.
     *
     * @param money
     */
    public void setmoney(int money) {
        // This is the money user gets at the begining
        money = 500;
        _money = money;
    }

    /**
     * Method to return the the money
     *
     * @return _money
     */
    public int getmoney() {
        // return money
        return _money;
    }

    /**
     * Method to return the username entered
     *
     * @return username;
     */
    public String getusername() {
        //return _username
        return _username;
    }

}
