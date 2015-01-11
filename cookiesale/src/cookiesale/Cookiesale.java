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
    quanity = n;
}

public void soldthinmints(int quanity) {
    int amountsold = 0;
    
        amountsold = quanity;
    
    System.out.print(amountsold);
}

public void soldsamoas(int quanity) {
    int amountsold1 = 0;
    
        amountsold1 = quanity;
    
    System.out.print(amountsold1);
}

public void soldchocolatechip(int quanity) {
    int amountsold2 = 0;
    
       amountsold2 = quanity;
    
    System.out.print(amountsold2);
}

public void totalthinmints(int quanity) {
    double moneymade = 0.00;
    
        moneymade = 3.00 * quanity;
    
    System.out.print(moneymade);
}

public void totalsamoas(int quanity) {
    double moneymade1 = 0.00;
    
        moneymade1 = 3.00 * quanity;
    
    System.out.print(moneymade1);
}

public void totalchocolatechip(int quanity) {
    double moneymade2 = 0.00;
    
        moneymade2 = 3.00 * quanity;
        
    
    
    System.out.print(moneymade2);
}
    public static void main(String[] args) {
        Cookiesale j = new Cookiesale(0);
        j.soldchocolatechip(5);
        j.totalchocolatechip(5);
        j.totalchocolatechip(5);
    }
    
}
