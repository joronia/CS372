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
    for (int i = 0; i < quanity; i++) {
        amountsold++;
    }
    System.out.print(amountsold);
}

public void soldsamoas(int quanity) {
    int amountsold1 = 0;
    for (int n = 0; n < quanity; n++ ) {
        amountsold1++;
    }
    System.out.print(amountsold1);
}

public void soldchocolatechip(int quanity) {
    int amountsold2 = 0;
    for (int j =0; j < quanity; j++ ) {
        amountsold2++;
    }
    System.out.print(amountsold2);
}

public void totalthinmints(int quanity) {
    double moneymade = 0.00;
    for (int y = 0; y <= quanity; y++) {
        moneymade = 3.00 * y;
    }
    System.out.print(moneymade);
}

public void totalsamoas(int quanity) {
    double moneymade1 = 0.00;
    for (int p = 0; p <= quanity; p++) {
        moneymade1 = 3.00 * p;
    }
    System.out.print(moneymade1);
}

public void totalchocolatechip(int quanity) {
    double moneymade2 = 0.00;
    for (int a = 0; a <= quanity; a++) {
        moneymade2 = 3.00 * a;
        
    }
    
    System.out.print(moneymade2);
}
    public static void main(String[] args) {
        
    }
    
}
