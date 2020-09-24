package lektion2.Fordon;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-22
 * Time: 10:38
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


abstract class Fordon implements Printable {
    private int hastighet;
    private int vikt;

    Fordon() {}
    Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public void ändraHastighet(int newHastighet) {
        hastighet = newHastighet;
    }

    public int getHastighet() {
        return hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    //abstract void printMe();
}
