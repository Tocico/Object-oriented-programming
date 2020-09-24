package lektion2.Fordon;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-22
 * Time: 10:39
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Båt extends Fordon{
    protected int dödvikt;

    Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public void sväng() {
    }


    @Override
    public void printMe() {
        System.out.println("hastighet: " + getHastighet()
                + "\nvikt: " + getVikt() +
                "\ndödvikt: " + dödvikt);
    }
}
