/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookiesale;

/**
 *
 * @author Jose
 */
public class Cookiesale {

    private int quanity;

    public Cookiesale(int n) {
        setnum(n);
    }
    public void setnum(int n) {
        quanity = n;
    }
    public int getquanity() { return quanity; }
 
    public int soldthinmints(int quanity) {
        int amountsold = 0;

        amountsold = quanity;

        return amountsold;
    }

    public int soldsamoas(int quanity) {
        int amountsold1 = 0;

        amountsold1 = quanity;

        return amountsold1;
    }

    public int soldchocolatechip(int quanity) {
        int amountsold2 = 0;

        amountsold2 = quanity;

        return amountsold2;
    }

    public double totalthinmints(int quanity) {
        double moneymade = 0.00;

        moneymade = 3.00 * quanity;

        return moneymade;
    }

    public double totalsamoas(int quanity) {
        double moneymade1 = 0.00;

        moneymade1 = 4.00 * quanity;

        return moneymade1;
    }

    public double totalchocolatechip(int quanity) {
        double moneymade2 = 0.00;

        moneymade2 = 5.00 * quanity;

        return moneymade2;
    }

    

}
