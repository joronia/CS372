/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs372exam1;

import java.util.*;

/**
 * class to make the main game.
 *
 * @author joronia17
 */
public class underover2 {

    // initialzie variables
    int dicetotal = 0;
    int _bet;
    int _guess;
// set up array for player.
    ArrayList<underover> player = new ArrayList();

    /**
     * method to catch anything that is not a int
     *
     * @param bet
     * @param guess
     */
    public underover2(int bet, int guess) {
        try {
            setbet(bet);
            setguess(guess);
        } catch (Exception ex) {
            System.out.printf("Has to be money not spelled numbers", ex.getMessage());
        }
    }

    /**
     * method to setbet.
     *
     * @param bet
     */
    public void setbet(int bet) {
        // comparing and seting up the bet.
        _bet = bet;

    }

    /**
     * Method to set the guess.
     *
     * @param guess
     */
    public void setguess(int guess) {
        // setting the guess
        _guess = guess;
    }

    /**
     * Method to get the guess back
     *
     * @return _guess
     */
    public int getguess() {
        return _guess;
    }

    /**
     * Method to return _bet
     *
     * @return _bet
     */
    public int getbet() {
        return _bet;
    }

    /**
     * Add player to the vector.
     *
     * @param c
     */
    public void setplayer(underover c) {
        player.add(c);
    }

    /**
     * Method to get the total of both dices
     *
     * @return dicetotal
     */
    public int dices() {
        // Start random dices.
        Random dice = new Random();
        int dice1 = dice.nextInt(6);
        int dice2 = dice.nextInt(6);
        //int dicetotal = 0;

        dicetotal += dice1 + dice2;

        return dicetotal;
    }

    /**
     * Method to return the money has won.
     *
     * @return user
     */
    public int dicegame() {
//       int bank = _bet;
        int user;
        // if statement to compare the guess with the dicetotal 
        if (_guess <= 7 && dicetotal <= 7 || _guess >= 7 && dicetotal >= 7) {
            int bank = _bet;

            user = player.get(0).getmoney();
            user += bank * 2;
            System.out.println("You Won");

        } else if (_guess == dicetotal) {
            int bank = _bet;
            user = player.get(0).getmoney();
            user += bank * 5;
            System.out.print("You won");
        } else {
            user = player.get(0).getmoney();
            user -= _bet;
            System.out.print("You Lost");
        }
        return user;

    }
}
