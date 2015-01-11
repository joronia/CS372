/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookiesale;

/**
 * Class Cookie sale to put all methods a girl scout cookie sale needs to be
 * successful.
 *
 * @author Jose
 */
public class Cookiesale {

    private int quanity;
    double moneymade = 0.00;
    double moneymade1 = 0.00;
    double moneymade2 = 0.00;
    int amountsold = 0;
    int amountsold1 = 0;
    int amountsold2 = 0;

    /**
     * Constructor for the class CookieSale.
     *
     * @param n
     */
    public Cookiesale(int n) {
        setnum(n);
    }

    /**
     * set the parameter to be quantity to use as a parameter for my other
     * functions.
     *
     * @param n
     */
    public void setnum(int n) {
        quanity = n;
    }

    /**
     * return the number of quantity.
     *
     * @return amountsold
     */
    public int getquanity() {
        return quanity;
    }

    /**
     * Method to calculate total amounts sold for thin mints.
     *
     * @param quanity
     * @return amountsold
     */
    public int soldthinmints(int quanity) {
        //int amountsold = 0;

        amountsold += quanity;

        return amountsold;
    }

    /**
     * Method to calculate total amounts sold for samoas.
     *
     * @param quanity
     * @return amountsold1
     */
    public int soldsamoas(int quanity) {
        //int amountsold1 = 0;

        amountsold1 += quanity;

        return amountsold1;
    }

    /**
     * Method to calculate total amounts sold for Chocolate Chip cookies.
     *
     * @param quanity
     * @return amountsold2
     */
    public int soldchocolatechip(int quanity) {
        //int amountsold2 = 0;

        amountsold2 += quanity;

        return amountsold2;
    }

    /**
     * Method to calculate total earned from all sales for thin mints.
     *
     * @param quanity
     * @return moneymade
     */
    public double totalthinmints(int quanity) {
        //double moneymade = 0.00;

        moneymade += 3.00 * quanity;

        return moneymade;
    }

    /**
     * Method to calculate total earned from all sales for samoas.
     *
     * @param quanity
     * @return moneymade1
     */
    public double totalsamoas(int quanity) {
        //double moneymade1 = 0.00;

        moneymade1 += 4.00 * quanity;

        return moneymade1;
    }

    /**
     * Method to calculate total earned from all sales for Chocolate Chip
     * cookies.
     *
     * @param quanity
     * @return moneymade2
     */
    public double totalchocolatechip(int quanity) {
        //double moneymade2 = 0.00;

        moneymade2 += 5.00 * quanity;

        return moneymade2;
    }

}
