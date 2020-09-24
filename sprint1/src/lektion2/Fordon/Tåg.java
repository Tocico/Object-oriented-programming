package lektion2.Fordon;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-22
 * Time: 10:39
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Tåg extends Fordon{
    protected int antalVagnar;

    Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn() {
    }

    @Override
    public void printMe() {
        System.out.println("hastighet: " + getHastighet()
                + "\nvikt: " + getVikt() +
                "\nantalVagnar: " + antalVagnar);
    }
}
