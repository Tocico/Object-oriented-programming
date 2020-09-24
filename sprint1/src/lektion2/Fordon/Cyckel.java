package lektion2.Fordon;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-22
 * Time: 10:39
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Cyckel extends Fordon implements Hjulburen{
    protected int antalVäxlar;
    protected final int antalHjul = 2;

    Cyckel(int hastighet, int vikt, int antalVäxlar) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
    }

    public void växla() {

    }

    @Override
    public void printMe() {
        System.out.println("hastighet: " + getHastighet()
                + "\nvikt: " + getVikt() +
                "\nantalVäxlar: " + antalVäxlar);
    }

    public void getAntalHjul() {
        System.out.println("Antal hjul är " + antalHjul);
    }
}
